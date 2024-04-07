package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SouceDemoPractice {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        String url="https://www.saucedemo.com/";
        driver.get(url);
        driver.manage().window().maximize();

         String userName= "standard_user";
         String userPassword="secret_sauce";

        WebElement userNameInput= driver.findElement(By.xpath("//input[@id='user-name']"));
        WebElement userPasswordInput= driver.findElement(By.xpath("//input[@id='password']"));
        WebElement loginButton= driver.findElement(By.xpath("//input[@id='login-button']"));

        userNameInput.sendKeys(userName);
        userPasswordInput.sendKeys(userPassword);
        loginButton.click();

        Thread.sleep(2000);

        String getUrl=driver.getCurrentUrl();
        System.out.println(" URL after Login: " + getUrl);


        WebElement sauceLapsBackpackAddToCart= driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        sauceLapsBackpackAddToCart.click();

        Thread.sleep(3000);

       WebElement sauceLabsBoltTShirtAddToCart= driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
        sauceLabsBoltTShirtAddToCart.click();

       Thread.sleep(3000);

       WebElement cartButton=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
       cartButton.click();

       Thread.sleep(3000);

        List<WebElement> productsInCart=driver.findElements(By.xpath("//div[@class='cart_item']"));

        int expectedItem=2;
        int actualItemInCart=productsInCart.size();

        if(actualItemInCart==expectedItem){
            System.out.println("Test Passed");
            System.out.println("Expected Item In The Cart "+ expectedItem );
            System.out.println("Actual Item In The Cart: " + actualItemInCart);
        }else{
            System.out.println("Test Failed");
            System.out.println("Expected Item In The Cart "+ expectedItem );
            System.out.println("Actual Item In The Cart: " + actualItemInCart);
        }

           driver.quit();












    }


}
