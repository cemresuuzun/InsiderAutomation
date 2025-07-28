package Pages;

import Base.BaseClass;
import Utils.WebDriverSettings;
import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HomePage extends BaseClass {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://useinsider.com/");
        driver.manage().window().maximize();

        WebDriverSettings.Wait(2);
        WebElement homePage = driver.findElement(By.id("announce"));
        WebDriverSettings.Wait(2);
        if(homePage.isDisplayed()){
            System.out.println("Displayed");
        }else{
            System.out.println("not Displayed");
        }



        driver.quit();
    }

}
