package hometasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task2TourRegistr {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();

        driver.get("http://demo.guru99.com/test/newtours/");

        driver.manage().window().maximize();
        WebElement registerButton= driver.findElement(By.linkText("REGISTER"));

        Thread.sleep(1000);
        registerButton.click();
        Thread.sleep(1000);

        WebElement userFirstNameInput= driver.findElement(By.name("firstName"));
        WebElement userLastNameInput= driver.findElement(By.name("lastName"));
        WebElement userPhoneInput= driver.findElement(By.name("phone"));
        WebElement userEmailInput= driver.findElement(By.id("userName"));

        userFirstNameInput.sendKeys("Sabina");
        Thread.sleep(2000);
        userLastNameInput.sendKeys("Aghayeva");
        Thread.sleep(2000);
        userPhoneInput.sendKeys("346-000-00-00");
        Thread.sleep(2000);
        userEmailInput.sendKeys("sabina.aghayeva.f@gmail.com");
        Thread.sleep(2000);

        WebElement userAddressInput= driver.findElement(By.name("address1"));
        WebElement userCityInput=driver.findElement(By.name("city"));
        WebElement userStateInput=driver.findElement(By.name("state"));
        WebElement userPostalCodeInput=driver.findElement(By.name("postalCode"));
        WebElement userCountryInput=driver.findElement(By.name("country"));

        userAddressInput.sendKeys("Owl Landing Lane");
        Thread.sleep(2000);
        userCityInput.sendKeys("Katy");
        Thread.sleep(2000);
        userStateInput.sendKeys("Texas");
        Thread.sleep(2000);
        userPostalCodeInput.sendKeys("77494");
        Thread.sleep(2000);
        userCountryInput.sendKeys("United States of America");
        Thread.sleep(2000);

        WebElement userNameInput=driver.findElement(By.id("email"));
        WebElement userPasswordInput=driver.findElement(By.name("password"));
        WebElement userConPasswordInput=driver.findElement(By.name("confirmPassword"));
        WebElement submitButton=driver.findElement(By.name("submit"));

        userNameInput.sendKeys("SabinaA");
        Thread.sleep(2000);
        userPasswordInput.sendKeys("Sabina123");
        Thread.sleep(2000);
        userConPasswordInput.sendKeys("Sabina123");
        Thread.sleep(2000);
        submitButton.click();
        Thread.sleep(10000);

        String expectedUrl = "/register_sucess.php";
         String actualUrl= driver.getCurrentUrl();

         if(actualUrl.endsWith(expectedUrl)){
             System.out.println("TEST: PASSED");
         }else{
             System.out.println("TEST: FAILED");
         }

        driver.quit();

    }


}
