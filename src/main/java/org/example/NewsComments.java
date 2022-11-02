package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;

public class NewsComments {
    protected static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/java/driver/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.xpath("//div[@class=\"news-list-homepage\"]/div[2]/div[2]/div[3]/a")).click();
        driver.findElement(By.xpath("[class=\"enter-comment-title\"]")).getText();
        driver.findElement(By.xpath("[class=\"enter-comment-text\"]")).getText();

        driver.findElement(By.xpath("[name=\"add-comment\"]")).click();
        String printComment = driver.findElement(By.xpath("[class='result']")).getText();

        System.out.println(printComment);

       driver.quit();

    }

}