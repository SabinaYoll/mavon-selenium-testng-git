package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class PracticeKeys {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bestbuy.com/");

        WebElement searchBar= driver.findElement(By.id("gh-search-input"));
        Thread.sleep(2000);

        searchBar.sendKeys("IPhone 16");

        Thread.sleep(2000);
//        for(int i=1;i<5;i++){
//            searchBar.sendKeys(Keys.BACK_SPACE);
//            Thread.sleep(1000);
//        }
        searchBar.sendKeys(Keys.BACK_SPACE);
            Thread.sleep(1000);
        //how to remove digit 6 and type 5 Pro Max


        searchBar.sendKeys("5 Pro Max");
        Thread.sleep(3000);

        searchBar.sendKeys(Keys.chord(Keys.COMMAND, "a"));
        Thread.sleep(3000);

        searchBar.sendKeys(Keys.ARROW_LEFT);
        Thread.sleep(3000);

        searchBar.sendKeys(Keys.DELETE);
        Thread.sleep(3000);

        searchBar.sendKeys("i");
        Thread.sleep(3000);

        for (int i=1;i<=4;i++){
            searchBar.sendKeys(Keys.ARROW_DOWN);
            Thread.sleep(1000);
        }
        searchBar.sendKeys(Keys.ARROW_UP);
        Thread.sleep(1000);

        searchBar.sendKeys(Keys.ENTER);
        Thread.sleep(3000);

        driver.quit();



    }
    public static WebDriver getDriver(String browserType) {
        switch (browserType) {
            case "Firefox":
                return new FirefoxDriver();
            case "Safari":
                return new SafariDriver();
            default:
                return new ChromeDriver();

        }

        }
    }