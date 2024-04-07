package module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageInformation {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        String url ="http://dev-hrm.yoll.io/";
        driver.get(url);
        String title = driver.getTitle();
        System.out.println("Page title : " + title );

        String currentUrl=driver.getCurrentUrl();
        System.out.println("Actual URL: " + currentUrl);
        driver.quit();



    }


}
