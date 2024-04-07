package hometasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class M2VerifyingTabVisualFeedback {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://dev-hrm.yoll.io/");
        Thread.sleep(3000);

        String userName = "yoll-student";
        String password ="Bootcamp5#";

        WebElement userNameInput= driver.findElement(By.xpath("//input[@id='txtUsername']"));
        WebElement userPasswordInput= driver.findElement(By.xpath("//input[@id='txtPassword']"));
        WebElement loginButton = driver.findElement(By.xpath("//*[@id='btnLogin']"));

        userNameInput.sendKeys(userName);
       userPasswordInput.sendKeys(password);
        loginButton.click();
        Thread.sleep(3000);
        System.out.println("Title: " + driver.getTitle());

        String borderBottomColor = "rgb(93, 93, 93)";

        WebElement rimTab1= driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));

        String backgroundColorBeforePress=rimTab1.getCssValue("background-color");
        System.out.println("Background color before pressing : " + backgroundColorBeforePress);

        rimTab1.click();
        Thread.sleep(3000);

        WebElement rimTab2 = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        String backgroundColorAfterPress=rimTab2.getCssValue("background-color");
        System.out.println("Background color after pressing : " + backgroundColorAfterPress);
        Thread.sleep(3000);

        driver.quit();
    }


}
