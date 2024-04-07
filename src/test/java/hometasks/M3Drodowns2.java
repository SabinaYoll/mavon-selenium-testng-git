package hometasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class M3Drodowns2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.automationtesting.in/Register.html");
        WebElement dayDropdown= driver.findElement(By.xpath("//select[@id='daybox']"));
        Select dropdown = new Select(dayDropdown);
        List<WebElement> allOptions =dropdown.getOptions();
        for(WebElement option: allOptions){
            String alldays=option.getText();
            System.out.println(alldays);
        }
        Thread.sleep(3000);
        dropdown.selectByVisibleText("10");
        Thread.sleep(3000);
        WebElement getSelectedOption= dropdown.getFirstSelectedOption();
        System.out.println("Selected Day:" + getSelectedOption.getText());

        driver.quit();
    }
}
