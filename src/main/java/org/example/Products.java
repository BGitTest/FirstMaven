package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Products
{
    protected static WebDriver driver;
    public static void main(String[]args)
    {
        System.setProperty("webdriver.chrome.driver","src/test/java/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com");

        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[1]/a\n")).click();
        driver.findElement(By.xpath("//div[@class=\"center-2\"]//h1")).click();

        String readMsg= driver.findElement(By.xpath("//div[@class=\"product-grid\"]/div/div[2]/div/div/a")).getText();
        System.out.println("readMsg");

       String productItem1 = driver.findElement(By.xpath("//div[@class=\"product-grid\"]/div/div/div/a/img")).getText();
       String productItem2 = driver.findElement(By.xpath("//div[@class=\"product-grid\"]/div/div[2]//h2/a")).getText();
       String productItem3 = driver.findElement(By.xpath("//div[@class='product-grid']/div/div[3]//h2/a")).getText();

        System.out.println(productItem1+productItem2+productItem3);

        driver.quit();
    }
}
