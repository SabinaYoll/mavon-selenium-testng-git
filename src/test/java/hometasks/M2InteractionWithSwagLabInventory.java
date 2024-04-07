package hometasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class M2InteractionWithSwagLabInventory
{
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        String username="standard_user";
        String password ="secret_sauce";

        WebElement usernameInput= driver.findElement(By.cssSelector("#user-name"));
        WebElement passwordInput = driver.findElement(By.cssSelector("#password"));
        WebElement loginButton = driver.findElement(By.cssSelector("#login-button"));

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
        Thread.sleep(1000);

        String expectedPadeHeader = "Products";
        String actualPageHeader = driver.findElement(By.cssSelector(".title")).getText();
        System.out.println("Successfully Logged In. Page header: " + actualPageHeader);

        if( actualPageHeader.equals(expectedPadeHeader)){
            System.out.println("- Verify Page Header: PASSED");

        }else{
            System.out.println("- Verify Page Header: FAILED");
        }
        Thread.sleep(1000);

        int expectedItemCount = 6;
        int  actualitemCount = driver.findElements(By.xpath("//img[@class='inventory_item_img']")).size();
        System.out.println("Available items on Products page: " + actualitemCount);

        if(actualitemCount==expectedItemCount){
            System.out.println("- Verify Items Count: PASSED");
        }else{
            System.out.println("- Verify Items Count: FAILED");
        }
        Thread.sleep(1000);

        WebElement sauseLabLightPresence = driver.findElement(By.xpath("//*[text()='Sauce Labs Bike Light']"));

        if(sauseLabLightPresence.isDisplayed()){
            System.out.println("- Verify 'Sauce Labs Bike Light' Presence: PASSED");
        }else{
            System.out.println("- Verify 'Sauce Labs Bike Light' Presence: FAILED");
        }
        Thread.sleep(1000);

        WebElement addToCartButton = driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-bolt-t-shirt"));

        if(addToCartButton.isDisplayed() && addToCartButton.isEnabled()){
            System.out.println("- Verify \"ADD TO CARD\" button Displayed and Enabled: PASSED ");
        }else{
            System.out.println("- Verify \"ADD TO CARD\" button Displayed and Enabled: FAILED ");
        }
        Thread.sleep(1000);

        String expectedAddtoCartTextColor = "rgba(19, 35, 34, 1)";
        String expectedAddtoCartBorderColor = "rgb(19, 35, 34)";

        String actualTextColorr = addToCartButton.getCssValue("color");
        String actualBorderColor = addToCartButton.getCssValue("border-color");

        if(actualTextColorr.equals(expectedAddtoCartTextColor)){
            System.out.println("- Verify Button Text Color: PASSED");
        }else{
            System.out.println("- Verify Button Text Color: FAILED");
        }
        Thread.sleep(1000);

        if(actualBorderColor.equals(expectedAddtoCartBorderColor)){
            System.out.println("- Verify Button Border Color: PASSED");
        }else{
            System.out.println("- Verify Button Border Color: FAILED");
        }
        Thread.sleep(1000);
        addToCartButton.click();
        System.out.println("Clicked 'ATT TO CART' button.");

        WebElement removeButton = driver.findElement(By.xpath("//*[text()='Remove']"));
        String expectedCurrentButtonDisplayedText = "Remove";
        String actualCurrentButtonDisplayedText = removeButton.getText();
        System.out.println("Current button displayed text: " + actualCurrentButtonDisplayedText);

        if(actualCurrentButtonDisplayedText.equals(expectedCurrentButtonDisplayedText)){
            System.out.println("- Verify Button Text: PASSED");
        }else{
            System.out.println("- Verify Button Text: FAILED");
        }
        Thread.sleep(1000);

        String expectedRemoveButtonTextColor = "rgba(226, 35, 26, 1)";
        String expectedRemoveButtonBorderColor = "rgb(226, 35, 26)";

        String actualRemoveButtonTextColor=removeButton.getCssValue("color");
        String actualRemoveButtonBorderColor=removeButton.getCssValue("border-color");

        if(actualRemoveButtonTextColor.equals(expectedRemoveButtonTextColor)){
            System.out.println("- Verify Button Text Color: PASSED");
        }else{
            System.out.println("- Verify Button Text Color: FAILED");
        }
        Thread.sleep(1000);

        if(actualRemoveButtonBorderColor.equals(expectedRemoveButtonBorderColor)){
            System.out.println("- Verify Button Border Color: PASSED");
        }else{
            System.out.println("- Verify Button Border Color: FAILED");
        }
        Thread.sleep(1000);

        WebElement shoppingCart = driver.findElement(By.cssSelector("#shopping_cart_container"));
        shoppingCart.click();
        System.out.println("Clicked Cart button.");
        Thread.sleep(1000);

        int expectedItemInTheCart = 1;
        List <WebElement> itemInTheCart = driver.findElements(By.cssSelector(".cart_quantity"));
        int actualItemInTheCart = itemInTheCart.size();
        System.out.println("Items in the cart: " + actualItemInTheCart);

        if(actualItemInTheCart==expectedItemInTheCart){
            System.out.println("- Verify Cart Items: PASSED");
        }else{
            System.out.println("- Verify Cart Items: FAILED");
        }

        Thread.sleep(1000);


        driver.quit();
    }
}
