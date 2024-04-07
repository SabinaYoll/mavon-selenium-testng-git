package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyElementAttributes
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bestbuy.com/");
        Thread.sleep(3000);
        WebElement searchInputBox = driver.findElement(By.id("gh-search-input"));

        String expectedAttributeValue = "What can we help you find today?";
        String actualAttributeValue = searchInputBox.getAttribute("placeholder");

        if(actualAttributeValue.equalsIgnoreCase(expectedAttributeValue)){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }
        System.out.println("Value attribute before typing: " + searchInputBox.getAttribute("value"));
        searchInputBox.sendKeys("Iphone 15 Pro Max");
        System.out.println("Value attribute after typing: " + searchInputBox.getAttribute("value"));
        System.out.println("Get the value of boolean attribute : " + searchInputBox.getAttribute("disabled"));

        WebElement searchButton= driver.findElement(By.cssSelector(""));

driver.quit();
    }
}
