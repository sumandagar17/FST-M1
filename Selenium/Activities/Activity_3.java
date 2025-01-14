package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/simple-form");
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        WebElement firstName = driver.findElement(By.id("firstName"));
        WebElement lastName = driver.findElement(By.id("lastName"));
        firstName.sendKeys("suman");
        lastName.sendKeys("Dagar");
        driver.findElement(By.id("email")).sendKeys("test@example.com");
        driver.findElement(By.id("number")).sendKeys("1234567890");
        driver.findElement(By.cssSelector(".ui.green.button")).click();
        driver.close();
    }
}
