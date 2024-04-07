package module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        String url="https://www.bestbuy.com/";
        driver.get(url);
        System.out.println(driver.getTitle());
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep( 5000);

        driver.quit();






    }
}
