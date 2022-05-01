package com.seleniumpro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.ls.LSOutput;

public class xpath {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver object = new ChromeDriver();
        object.get("https://yahoo.com");
        System.out.println("object.getTitle() = " + object.getTitle());
        WebElement xp = object.findElement(By.xpath("//input[@name='p']"));
        xp.sendKeys("perizat ryspaeva");
        WebElement but = object.findElement(By.xpath("//input[@id='ybar-search']"));
        but.click();

          //object.quit();

    }
}
