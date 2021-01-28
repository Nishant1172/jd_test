package com.jd.drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class driver_manager {

    public static WebDriver driver;
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.jdsports.co.uk/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void closeBrowser(){
        driver.quit();
    }

    public void sleep(int ms){
        try {
            Thread.sleep(ms);
        }
        catch (Exception e){}
    }
    public int randomNumber(int size){
        Random random = new Random();
        return random.nextInt(size-1);
    }
}
