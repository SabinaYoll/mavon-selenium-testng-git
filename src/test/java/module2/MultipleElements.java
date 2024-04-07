package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class MultipleElements {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.bestbuy.com/");

        WebElement searchInput=driver.findElement(By.id("gh-search-input"));
        WebElement searchButton=driver.findElement(By.className("header-search-button"));

        searchInput.sendKeys("iPhone 15");
        Thread.sleep(2000);

        searchButton.click();
        Thread.sleep(2000);

        List<WebElement> products=driver.findElements(By.className("sku-title"));
        System.out.println("Products found: " + products.size() );
        for(WebElement product :products){
           String text= product.getText();
            System.out.println("Title: " + text);

            Thread.sleep(1000);

            if(text.contains("iPhone")){
                System.out.println("Item Relevant");
            }else{
                System.out.println("Item Irrelevant");
            }
        }
        driver.quit();








    }
}
