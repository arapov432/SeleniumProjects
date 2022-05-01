package com.seleniumpro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.nio.file.LinkPermission;

public class CssSelectorRegisterForm {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/registration_form");
        WebElement firstName = driver.findElement(By.cssSelector("input[name='firstname']"));
        firstName.sendKeys("Azamat");
        WebElement last = driver.findElement(By.cssSelector("input[data-bv-field='lastname']"));
        last.sendKeys("Rakhmatilla");
        WebElement username = driver.findElement(By.cssSelector("input[name='username']"));
        username.sendKeys("azamuulu");
        WebElement email = driver.findElement(By.cssSelector("input[name='email']"));
        email.sendKeys("arapov324@gmail.com");

        WebElement pass = driver.findElement(By.cssSelector("input[name='password']"));
        pass.sendKeys("TogetherBecause");


        WebElement phone = driver.findElement(By.cssSelector("input[name='phone'][type='tel']"));
        phone.sendKeys("415-980-7890");


        WebElement genderRadiobtn = driver.findElement(By.cssSelector("input[name='gender'][value='male']"));
        genderRadiobtn.click();


        WebElement birthdate = driver.findElement(By.cssSelector("input[name='birthday']"));
        birthdate.sendKeys("01/10/2022");


        WebElement dropdown = driver.findElement(By.cssSelector("select[name='department']"));
        Select depSelect = new Select(dropdown);
        depSelect.selectByIndex(2);

        WebElement titledropdown = driver.findElement(By.cssSelector("select[name='job_title']"));
        Select title = new Select(titledropdown);
        title.selectByIndex(3);

        WebElement checkbox1 = driver.findElement(By.cssSelector("#inlineCheckbox1"));
        checkbox1.click();

        WebElement signup = driver.findElement(By.cssSelector("#wooden_spoon"));
        signup.click();

    }
}