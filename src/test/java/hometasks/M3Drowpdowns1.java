package hometasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class M3Drowpdowns1 {
    public static void main(String[] args) {

//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://demo.automationtesting.in/Register.html");
//        int size = driver.findElements(By.xpath("//*[@placeholder='Month']/Option")).size();
//        List<WebElement> monthDropdown= driver.findElements(By.xpath("//*[@placeholder='Month']/Option"));
//        String expectedDOB = "September";
//        for (WebElement element:monthDropdown) {
//            if(element.getText().equals(expectedDOB)){
//                break;
//            }
//            System.out.println(element.getText());
//        }
//        driver.quit();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.automationtesting.in/Register.html");
        WebElement dropdownWebElement =
                driver.findElement(By.cssSelector("select[placeholder=Month]"));
        Select dropdown = new Select(dropdownWebElement);
        List<WebElement> allOptions = dropdown.getOptions();
        String expectedDOB = "November";
        for (WebElement option: allOptions){
            String month = option.getText();
            System.out.println(month);
            if(expectedDOB.equals(month)){
                break;
            }
        }
        driver.quit();

    }
}
