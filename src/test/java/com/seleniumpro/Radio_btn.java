package com.seleniumpro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_btn {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        WebElement radiobtn = driver.findElement(By.id("blue"));
        System.out.println("radiobtn.isSelected() = " + radiobtn.isSelected());
        radiobtn.click();

    }
}
