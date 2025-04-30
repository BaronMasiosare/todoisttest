package com.ejemplo.todoist.tests;

import com.ejemplo.todoist.utils.ScreenshotUtil;
import com.ejemplo.todoist.utils.WebDriverProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class LoginTest implements WebDriverProvider {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 👇 Espera implícita de hasta 10 segundos para cualquier elemento
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void loginTodoist() {
        driver.get("https://www.todoist.com/es");
        ScreenshotUtil.tomarCaptura(driver, "01_inicio");

        WebElement loginButton = driver.findElement(By.xpath("//body/div/div[@class='app_appContainer__TEWLy app_pageBackground__s0KeE']/div[@class='_navbarWrapper_1mmc3_1']/div[@class='_navbar_1mmc3_1']/nav[@class='_navbarContainer_1mmc3_14 _container_1hbeh_1 _lg_1hbeh_15']/div[@class='header_header__2pZKc _container_1hbeh_1 _lg_1hbeh_15 _noPadding_1hbeh_19']/div[@class='_hidden_snh3y_1 _hidden-lt-lg_snh3y_30']/div[@class='_navbarSection_l56yj_1 _end_l56yj_11']/ul[@class='_navbarItemGroup_ue8ah_1']/li[1]/a[1]"));
        loginButton.click();
        ScreenshotUtil.tomarCaptura(driver, "02_click_iniciar_sesion");

        WebElement emailField = driver.findElement(By.xpath("//input[@id='element-0']"));
        emailField.sendKeys("correo@ejemplo.com");
        ScreenshotUtil.tomarCaptura(driver, "03_ingresa_email");

        WebElement passwordField = driver.findElement(By.xpath("//input[@id='element-2']"));
        passwordField.sendKeys("contraseña123");
        ScreenshotUtil.tomarCaptura(driver, "04_ingresa_password");

        WebElement submitBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        submitBtn.click();
        ScreenshotUtil.tomarCaptura(driver, "05_click_login");
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

