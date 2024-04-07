package hometasks;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class M2WebTables {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.expandtesting.com/tables");
        System.out.println("Page Title: " + driver.getTitle());

        Thread.sleep(3000);

        String  getEmail=printEmailByFullName(driver,"John","Smith");
        System.out.println(getEmail);
        Thread.sleep(3000);


        System.out.println(getTotalAmountOfDueColumn(driver));
        Thread.sleep(3000);

        double expectedTotal=251.0;
        Double actualTotal=getTotalAmountOfDueColumn(driver);
        Thread.sleep(1000);
        if(actualTotal==expectedTotal){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }
        driver.quit();

    }

    public static String printEmailByFullName(WebDriver driver, String fName, String lName) {
        String findEmail = null;
        try {
            findEmail = driver.findElement(By.xpath("//table[@id='table1']/tbody//*[text()='" + fName + "']/../..//*[text()='" + lName + "']/../td[3]")).getText();

        }catch (NoSuchElementException e){
            System.out.println("The first name or last name is not valid please provide a valid one.");

        }
        return findEmail;

    }

    public static double  getTotalAmountOfDueColumn(WebDriver driver) {

        double total = 0;
        double size= driver.findElements(By.xpath("(//table[@id='table1'])//td[4]")).size();
        for (int i = 1; i <= size; i++) {
            String amount = driver.findElement(By.xpath("//table[@id='table1']//tbody/tr[" + i + "]/td[4]")).getText(); //$50.00
            total += Double.parseDouble(amount.substring(1));
        }

        return total;
    }

}


