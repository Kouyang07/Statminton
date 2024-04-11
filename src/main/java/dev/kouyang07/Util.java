package dev.kouyang07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class Util {
    public static String getHTML(String URL) throws InterruptedException {
            WebDriver driver = new SafariDriver();
            driver.get(URL);
            WebElement button = driver.findElement(By.xpath("//button[@class='btn btn--success js-accept-basic']"));
            button.click();
            Thread.sleep(1000);
            String html = driver.getPageSource();
            driver.quit();
            return html;
    }
}
