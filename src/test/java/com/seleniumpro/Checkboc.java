package com.seleniumpro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboc {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/checkboxes");
        WebElement checkbox1 = driver.findElement(By.id("box1"));
        System.out.println("Before checkbox1.isSelected() = " + checkbox1.isSelected());
        checkbox1.click();
        System.out.println(" After checkbox1.isSelected() = " + checkbox1.isSelected());
       WebElement checkbox2 = driver.findElement(By.id("box2"));
        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected());
        System.out.println("checkbox2.getAttribute(\"checked\") = Before " + checkbox2.getAttribute("checked"));
        checkbox2.click();
        System.out.println("checkbox2.getAttribute(\"checked\") = After " + checkbox2.getAttribute("checked"));
        if(!checkbox1.isSelected()){
            checkbox1.click();
        }
        else {
            System.out.println("checkboz already checked ");
        }
    }
}
