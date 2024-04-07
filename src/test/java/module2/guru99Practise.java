package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class guru99Practise {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/newtours/");


        WebElement userNameInput=driver.findElement(By.name("userName"));
        WebElement userPasswordInput= driver.findElement(By.name("password"));
        WebElement submitButton= driver.findElement(By.name("submit"));

        String userName="test@email.com";
        String userPassword="test";

        userNameInput.sendKeys(userName);
Thread.sleep(3000);
userPasswordInput.sendKeys(userPassword);
Thread.sleep(3000);

submitButton.click();
Thread.sleep(3000);


WebElement vacationLink=driver.findElement(By.partialLinkText("Vacations"));

vacationLink.click();
Thread.sleep(10000);
WebElement registerButton=driver.findElement(By.linkText("REGISTER"));
registerButton.click();
Thread.sleep(10000);

String expectedUrl="/register.php";
String actualUrl= driver.getCurrentUrl();

if(actualUrl.endsWith(expectedUrl)) {
    System.out.println("Registration Test Passed");
}
else{
    System.out.println("Registration Test Failed");
}
driver.quit();

    }
}
