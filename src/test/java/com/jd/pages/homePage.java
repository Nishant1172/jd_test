package com.jd.pages;

import com.jd.drivers.driver_manager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class homePage extends driver_manager {

    public void doSearch(String item){
        WebElement searchBox = driver.findElement(By.id("srchInput"));
        searchBox.sendKeys(item);
        searchBox.sendKeys(Keys.ENTER);
    }
    public void searchItem(){
        List<WebElement> nameLabel = driver.findElements(By.cssSelector("span[class='itemTitle']"));
        int randomNumber = randomNumber(nameLabel.size());
        WebElement selectedElement = nameLabel.get(randomNumber);
        String expected = selectedElement.getText();
        selectedElement.click();
        sleep(4000);
    }

    public void selectSize(){
         WebElement elements = driver.findElement(By.cssSelector("button[data-e2e='pdp-productDetails-size']"));
        elements.sendKeys(Keys.ENTER);
        sleep(4000);
    }
    public void addToBasket(){
        driver.findElement(By.id("addToBasket")).click();
    }
}
