package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownPractice3 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Register.html");
        Thread.sleep(3000);

        WebElement skillsDropdownWebelement= driver.findElement(By.xpath("//select[@id='Skills']"));
        Select skillsDropdown = new Select(skillsDropdownWebelement);
        skillsDropdown.selectByVisibleText("Mac");
        Thread.sleep(3000);

        WebElement selectOption = skillsDropdown.getFirstSelectedOption();
        System.out.println("Selected option is: " + selectOption.getText());
        Thread.sleep(3000);


        driver.quit();


    }

}
