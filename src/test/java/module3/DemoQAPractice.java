package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DemoQAPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
        Thread.sleep(2000);
        WebElement firtNameInputBox= driver.findElement(By.xpath("//*[@placeholder='First Name']"));
        firtNameInputBox.sendKeys("omar");

       firtNameInputBox.sendKeys(Keys.chord(Keys.TAB,"Ramo",
               Keys.TAB, "Main Street 45,US",
               Keys.TAB,"omar@gmail.com.",
               Keys.TAB,"545 55 58 48 48"));
        Thread.sleep(5000);

        WebElement maleRadiButton= driver.findElement(By.cssSelector("input[value=Male]"));
        maleRadiButton.click();
        Thread.sleep(2000);

        WebElement femaleRadioButton= driver.findElement(By.cssSelector("input[value=FeMale]"));
        femaleRadioButton.click();
        Thread.sleep(2000);

        selectRadioButtonByValue(driver,"Male");
        Thread.sleep(2000);


        driver.quit();
    }
    public static void selectRadioButtonByValue(WebDriver driver,String type){
        List<WebElement> genderRadioButtons = driver.findElements(By.cssSelector("input[type=radio]"));
        switch (type.toLowerCase()){

            case "male" :
                 genderRadioButtons.get(0).click();
                 break;
            case "female":
               genderRadioButtons.get(1) .click();
               break;
            default:
                throw new IllegalArgumentException("There is no radio button with such value\" + type");
        }
    }
        public static void clickCheckBoxByValue(WebDriver driver,String value){

            List<WebElement> hobbiesOption=driver.findElements(By.cssSelector("input[type=checkb ox]"));




        };

    }

