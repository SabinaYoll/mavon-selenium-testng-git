package hometasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class M2Interactions {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        String username = "standard_user";
        String userPassword = "secret_sauce";

        WebElement usernameInputBox= driver.findElement(By.xpath("//input[@id='user-name']"));
        WebElement userPasswordInputBox = driver.findElement(By.xpath("//input[@id='password']"));
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));

        usernameInputBox.sendKeys(username);
        userPasswordInputBox.sendKeys(userPassword);
        loginButton.click();

        Thread.sleep(3000);

        String expectedPageHeader = "Products";
         String actualPageHeader = driver.findElement(By.xpath("//*[@class='title']")).getText();
         if (actualPageHeader.equals(expectedPageHeader)){
             System.out.println("Verify Page Header : PASSED");
         }else{
             System.out.println("Verify Page Header : FAILED");
         }
         Thread.sleep(3000);

         int expectedItemListed=6;
         int actualItemListed=driver.findElements(By.xpath("//img[@class='inventory_item_img']")).size();

        System.out.println("Available items on Products page: " + actualItemListed);

        if ((actualItemListed==expectedItemListed)){
            System.out.println("Verify Items Count: PASSED");
        }else{
            System.out.println("Verify Items Count: Failed");
        }

        boolean nameDisplayed = driver.findElement(By.xpath("//*[@id='item_4_title_link'] ")).isDisplayed();
        if(nameDisplayed){
            System.out.println("Verify 'Sauce Labs Bike Light' Presence: PASSED");
        }else {
            System.out.println("Verify 'Sauce Labs Bike Light' Presence: FAILED");
        }
        Thread.sleep(3000);

        Boolean addToCadtButtonIsDispayed = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']")).isDisplayed();
        Boolean addToCardButtonIsEnabled = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']")).isEnabled();

         if(addToCadtButtonIsDispayed&&addToCardButtonIsEnabled){
             System.out.println("Verify \"ADD TO CARD\" button Displayed and Enabled: PASSED");
         }else{
             System.out.println("Verify \"ADD TO CARD\" button Displayed and Enabled: FAILED");
         }
         Thread.sleep(3000);
driver.quit();
    }
}
