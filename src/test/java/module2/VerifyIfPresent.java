package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyIfPresent {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://dev-hrm.yoll.io/");

        String username="yoll-student";
        String password="Bootcamp5#";

        Thread.sleep(3000);
        WebElement userInput= driver.findElement(By.cssSelector("input[id=txtUsername]"));
        WebElement passwordInput= driver.findElement(By.cssSelector("input[id=txtPassword]"));
        WebElement loginButton = driver.findElement(By.cssSelector("input[id=btnLogin]"));
        Thread.sleep(3000);

        userInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();

        Thread.sleep(3000);

        boolean isLogoPresent = driver.findElements(By.cssSelector("img[src *= yoll-logo]")).size() == 1;
        System.out.println("Logo verification test passed: " + isLogoPresent);

        driver.quit();
    }
}
