package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;

public class BasePage
{

    protected static WebDriver driver;
     public static void main(String []args)
     {
         System.setProperty("webdriver.chrome.driver", "src/test/java/driver/chromedriver.exe");
         driver = new ChromeDriver();

         String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
         System.out.println(timeStamp);
         driver.manage().window().maximize();
         driver.get("https://demo.nopcommerce.com/");
         driver.findElement(By.className("ico-register")).click();
         driver.findElement(By.id("FirstName")).sendKeys("Rajesh");
         driver.findElement(By.id("LastName")).sendKeys("Sharma");

         driver.findElement(By.id("Email")).sendKeys("raj"+timeStamp+"@gmail.com");


         driver.findElement(By.id("Password")).sendKeys("123456");
         driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");

         driver.findElement(By.id("register-button")).click();


         driver.quit();


     }
}
