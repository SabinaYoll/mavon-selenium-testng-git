package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeAccessibilityWebPage {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.get("https://haltersweb.github.io/Accessibility/submit-disabling.html");
        Thread.sleep(1000);

        WebElement submitButton= driver.findElement(By.xpath("//*[text() ='Submit']"));
        /* Navigate to https://haltersweb.github.io/Accessibility/submit-disabling.html */

        // System.out.println("Submit Button Disabled: " + submitButton.isDisplayed());
        // After inspecting the html we noticed that the button that is not intractable doesn't have a disabled attribute
        // That's why the isEnabled() method will not give you a proper result
        // System.out.println(submitButton.isEnabled());
        // isEnabled() -

        /* Locate 'Submit' button and print on console that button is disabled (use getAttribute() method) */
        System.out.println("Submit Button Disabled: " + submitButton.getAttribute("aria-disabled"));

        /* Print the text color of the Submit Button - "color" */

        System.out.println("Submit Text Color:" + submitButton.getCssValue("color"));
        WebElement heading = driver.findElement(By.xpath("//h2[text()='Example Form']"));
        WebElement firstNameInput= driver.findElement(By.id("firstName"));
        WebElement lastNameInput= driver.findElement(By.id("lastName"));

        firstNameInput.sendKeys("Test");
        Thread.sleep(1000);

        lastNameInput.sendKeys("Automan");
        Thread.sleep(1000);

        heading.click();
        Thread.sleep(1000);

        System.out.println("Submit Button Disabled: " + submitButton.getAttribute("aria-disabled"));

        System.out.println("Submit Text Color:" + submitButton.getCssValue("color"));

        driver.quit();







    }

    }

