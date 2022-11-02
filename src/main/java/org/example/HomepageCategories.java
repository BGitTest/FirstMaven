package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomepageCategories
{
    // WebDriver permits to execute cross-browser tests
    protected static WebDriver driver;
    //main method is directly called by JVM without creating an object
// using main method to store, printout and to get

    public static void main(String[]args)
    {
        // it allows system property to have the value
        System.setProperty("webdriver.chrome.driver", "src/test/java/driver/chromedriver.exe");
        //calling particular browser , this is used so script will execute without any issue

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        // manage() - returns instance of options, 
        // window() - returns intance of window and 
        // maximize() - this method is used to maximize
///opening homepage
        driver.get("https://demo.nopcommerce.com/");
       // storing and printing out
        String computers = driver.findElement(By.xpath("//div[@class=\"news-list-homepage\"]/div[2]/div[2]/div[3]/a")).getText();
       String electronics =  driver.findElement(By.xpath("//div[@class='master-wrapper-page']/div[2]/ul[1]//a[@href='/electronics']")).getText();
        String apparel =  driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[3]/a")).getText();
        String digitalDownloads =  driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[4]/a")).getText();
         String books = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[5]/a")).getText();
         String jewelry = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[6]/a")).getText();
        String giftCards= driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[7]/a")).getText();

        System.out.println(computers+electronics+apparel+digitalDownloads+books+jewelry+giftCards);

        driver.quit();

    }
}
