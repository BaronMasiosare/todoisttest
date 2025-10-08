package com.ejemplo.todoist.tests;

import com.ejemplo.todoist.utils.ScreenshotUtil;
import com.ejemplo.todoist.utils.WebDriverProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class LoginFail implements WebDriverProvider {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test(priority = 2)
    public void loginFallidoTodoist() {
        driver.get("https://www.todoist.com/es");
        ScreenshotUtil.tomarCaptura(driver, "01_inicio");

        WebElement loginButton = driver.findElement(By.linkText("Iniciar sesión"));
        loginButton.click();
        ScreenshotUtil.tomarCaptura(driver, "02_click_iniciar_sesion");

        WebElement emailField = driver.findElement(By.id("element-0"));
        emailField.sendKeys("correo@invalido.com");
        ScreenshotUtil.tomarCaptura(driver, "03_email_invalido");

        WebElement passwordField = driver.findElement(By.id("element-2"));
        passwordField.sendKeys("claveIncorrecta");
        ScreenshotUtil.tomarCaptura(driver, "04_password_invalida");

        WebElement submitBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        submitBtn.click();
        ScreenshotUtil.tomarCaptura(driver, "05_click_login_fallido");

        // Validar presencia del mensaje de error
        boolean contieneError = driver.getPageSource().contains("contraseña o el correo electrónico no son correctos")
                             || driver.getPageSource().toLowerCase().contains("email o contraseña incorrectos");

        Assert.assertTrue(contieneError, "⚠ No se detectó el mensaje de error esperado.");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Override
    public WebDriver getDriver() {
        return this.driver;
    }
}

