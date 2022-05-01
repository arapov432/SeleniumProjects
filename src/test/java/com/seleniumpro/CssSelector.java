package com.seleniumpro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://yahoo.com");
        WebElement inp = driver.findElement(By.cssSelector("input[id^='ybar-sbq']"));
        inp.sendKeys("Perizat Ryspaeva");
        WebElement btn = driver.findElement(By.cssSelector("input[type='submit']"));
        btn.click();
        WebElement yahoo = driver.findElement(By.cssSelector("a[id='header-logo']"));
        System.out.println("yahoo.getTagName() = " + yahoo.getTagName());
    }
}
