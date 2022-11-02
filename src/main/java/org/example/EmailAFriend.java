package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmailAFriend
{
    protected static WebDriver driver;

    public static void main(String[] args)
    {
    System.setProperty("webdriver.chrome.driver","src/test/java/driver/chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demo.nopcommerce.com/");
    driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']//h2//a[@href=\"/apple-macbook-pro-13-inch\"]")).click();
    driver.findElement(By.xpath("//div[@class='email-a-friend']/button")).click();


    }
}
