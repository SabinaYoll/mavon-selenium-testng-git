package hometasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class M2DynamicTables {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.expandtesting.com/dynamic-table");
        System.out.println("Page Title: " +driver.getTitle());
        String expectedValue =driver.findElement(By.xpath("//*[@id='chrome-cpu']")).getText();
        int size=driver.findElements(By.xpath("//*[text()='CPU']/../../../tbody/tr[1]/td[3]")).size();

        Thread.sleep(3000);
        for(int i=0;i<size;i++) {
            if (driver.findElement(By.xpath("//*[@class='table table-striped']/thead//*[text()='CPU']/../../../tbody/tr[" + i + "]/td[1]")).getText().equals("Chrome")) {
                Thread.sleep(3000);
                String print = driver.findElement(By.xpath("//*[@class='table table-striped']/thead//*[text()='CPU']/../../../tbody/tr[4]/td[3]")).getText();
                Thread.sleep(3000);

            }
        }


        driver.quit();
    }
}