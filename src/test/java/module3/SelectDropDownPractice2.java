package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectDropDownPractice2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Register.html");
        Thread.sleep(3000);

        WebElement dropdownWebelement = driver.findElement(By.xpath("//*[@id='yearbox']"));
        Select dropdown=new Select(dropdownWebelement);
        dropdown.selectByIndex(1);
        Thread.sleep(3000);
        dropdown.selectByValue("1956");
        Thread.sleep(3000);
        dropdown.selectByVisibleText("2010");
        Thread.sleep(3000);

        List<WebElement> allOption = dropdown.getOptions();
        String yearToSelect ="2024";
        boolean isPresent =false;

        for (WebElement option: allOption ){
            if(option.getText().equals(yearToSelect)){
                isPresent=true;
                break;
            }
        }if(isPresent){
            dropdown.selectByVisibleText(yearToSelect);
        }else{
            System.out.println("The option " + yearToSelect + " is not present in the dropdown");
        }

        Thread.sleep(3000);

        driver.quit();

    }
}
