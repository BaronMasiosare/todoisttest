package com.ejemplo.todoist.utils;

import org.openqa.selenium.*;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtil {

    public static void tomarCaptura(WebDriver driver, String nombreBase) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File fuente = ts.getScreenshotAs(OutputType.FILE);

        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String nombreArchivo = "evidencias/" + nombreBase + "_" + timestamp + ".png";

        try {
            File destino = new File(nombreArchivo);
            FileUtils.copyFile(fuente, destino);
            System.out.println("Captura guardada: " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al guardar captura: " + e.getMessage());
        }
    }
}
