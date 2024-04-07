package hometasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class M2MagentoSignInFlow {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();

        String email="testautoman@email.com";
        String pwd="qwerty123!";

        driver.get(" https://magento.softwaretestingboard.com/");
        driver.manage().window().maximize();

        WebElement signInBtn= driver.findElement(By.xpath("//div[@class='panel header']//li/a"));
        signInBtn.click();

        WebElement emailInput= driver.findElement(By.xpath("//input[@id='email']"));
        emailInput.sendKeys(email);

        WebElement pwdInput= driver.findElement(By.xpath("//input[@name='login[password]']"));
        pwdInput.sendKeys(pwd);

        WebElement clickBtn= driver.findElement(By.xpath("//button[@class='action login primary']"));
        clickBtn.click();
        Thread.sleep(3000);

        System.out.println("Title: " + driver.getTitle());
        System.out.println("Welcome!");

        WebElement welcomeMessage= driver.findElement(By.xpath("//div[@class='panel wrapper']//li[1]/span"));
        if(welcomeMessage.getText().startsWith("Welcome")){
            System.out.println("TEST: PASSED");
        }else{
            System.out.println("TEST: FAILED");
        }

        driver.quit();
    }
}
