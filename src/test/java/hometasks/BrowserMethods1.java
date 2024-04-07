package hometasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();

        String sepUrl ="https://www.sephora.com/";
        driver.get(sepUrl);
        Thread.sleep(3000);

        driver.manage().window().maximize();
        Thread.sleep(3000);

        String ikeaUrl="https://www.ikea.com/us/en/";
        driver.get(ikeaUrl);
        Thread.sleep(3000);

        String youtUrl="https://www.youtube.com/";
        driver.get(youtUrl);
        Thread.sleep(3000);

        String yollUrl="https://www.yoll.io/";
        driver.navigate().to(yollUrl);
        Thread.sleep(3000);
        String yollTitle = driver.getTitle();
        System.out.println("Page Title : " + yollTitle);

        driver.navigate().back();
        String youtTitle = driver.getTitle();
        System.out.println("Page Title : " + youtTitle);
        Thread.sleep(3000);

        driver.navigate().back();
        System.out.println("Actual URL : " + ikeaUrl);
        Thread.sleep(3000);

        driver.navigate().back();
        String sepTitle = driver.getTitle();
        System.out.println("Page Title :: " + sepTitle);
        Thread.sleep(3000);

        driver.close();
    }
}



