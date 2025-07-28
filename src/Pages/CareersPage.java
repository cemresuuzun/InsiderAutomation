package Pages;

import Base.BaseClass;
import Utils.WebDriverSettings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CareersPage extends BaseClass {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://useinsider.com/");
        driver.manage().window().maximize();

        WebDriverSettings.Wait(2);
        WebElement companyButton = driver.findElement(By.xpath("//li[@class='nav-item dropdown'][6]"));
        companyButton.click();
        WebElement careersButton = driver.findElement(By.xpath("//a[text()='Careers']"));
        careersButton.click();
        WebElement teams = driver.findElement(By.id("career-find-our-calling"));
        WebElement locations = driver.findElement(By.id("career-our-location"));
        WebElement lifeAtInsider = driver.findElement(By.xpath("//div[@class=\"elementor-swiper\"]"));
        WebDriverSettings.Wait(2);
        if(teams.isDisplayed()){
            System.out.println("Displayed");
        }else{
            System.out.println("not Displayed");
        }



        driver.quit();
    }
}
