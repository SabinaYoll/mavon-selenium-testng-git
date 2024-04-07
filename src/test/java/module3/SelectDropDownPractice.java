package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectDropDownPractice {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Register.html");
        Thread.sleep(3000);

        WebElement dropdownWebelement= driver.findElement(By.xpath("//select[@id='Skills']"));
        Select dropdown = new Select(dropdownWebelement);
        dropdown.selectByIndex(5);
        Thread.sleep(3000);

        dropdown.selectByValue("C++");
        Thread.sleep(3000);

        dropdown.selectByVisibleText("Java");
        Thread.sleep(3000);

        List<WebElement> allOPtions = dropdown.getOptions();
        System.out.println("All Skills: ");

        for(WebElement option:allOPtions){
            System.out.println(option.getText());
        }

        driver.quit();


    }
}
