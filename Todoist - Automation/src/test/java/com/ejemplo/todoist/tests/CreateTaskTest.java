package com.ejemplo.todoist.tests;

import com.ejemplo.todoist.utils.ScreenshotUtil;
import com.ejemplo.todoist.utils.WebDriverProvider;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class CreateTaskTest implements WebDriverProvider {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test(priority = 3)
    public void crearTareaEnTodoist() {
        driver.get("https://todoist.com/es");
        ScreenshotUtil.tomarCaptura(driver, "01_inicio");

        // Ir a "Iniciar sesión"
        driver.findElement(By.linkText("Iniciar sesión")).click();
        ScreenshotUtil.tomarCaptura(driver, "02_click_login");

        // Iniciar sesión
        driver.findElement(By.id("element-0")).sendKeys("gotih58545@firain.com");
        driver.findElement(By.id("element-2")).sendKeys("facil1234");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        ScreenshotUtil.tomarCaptura(driver, "03_submit_login");

        // Esperar que cargue el dashboard
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.urlContains("app.todoist.com"));

        // Click en botón "Añadir tarea"
        WebElement addTaskButton = wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//button[contains(text(),'Añadir tarea')]")));
        addTaskButton.click();
        ScreenshotUtil.tomarCaptura(driver, "04_click_añadir_tarea");

        // Ingresar nombre de la tarea
        WebElement taskInput = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//div[@aria-label='Nombre de la tarea']//p[@class='is-empty is-editor-empty']")));
        taskInput.sendKeys("Tarea de prueba automática1");
        ScreenshotUtil.tomarCaptura(driver, "05_ingresa_nombre_tarea");

        // Click en "Añadir tarea" para guardar
        WebElement addTaskConfirmButton = driver.findElement(By.xpath("//button[@type='submit']"));
        addTaskConfirmButton.click();
        ScreenshotUtil.tomarCaptura(driver, "06_tarea_creada");

        // Verificar que la tarea aparece en la lista
        boolean tareaCreada = driver.getPageSource().contains("Tarea de prueba automática1");
        Assert.assertTrue(tareaCreada, "❌ La tarea no se creó correctamente.");
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
