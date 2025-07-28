package Pages;

import Base.BaseClass;
import Utils.WebDriverSettings;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class QAJobs extends BaseClass {

    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://useinsider.com/careers/quality-assurance/");
        driver.manage().window().fullscreen();


        WebElement seeAllButton = driver.findElement(By.xpath("//a[text()='See all QA jobs']"));
        seeAllButton.click();
        WebElement locationDropdown = driver.findElement(By.xpath("(//span[@class='select2-selection select2-selection--single'])[1]"));
        locationDropdown.click();
        WebElement istanbulOption = driver.findElement(By.xpath("//li[text()=\"Istanbul, Turkiye\"]"));
        istanbulOption.click();
        WebElement departmentDropdown = driver.findElement(By.xpath("(//span[@class='select2-selection select2-selection--single'])[2]"));
        departmentDropdown.click();
        WebElement QAOption = driver.findElement(By.xpath("//li[text()=\"Quality Assurance\"]"));
        QAOption.click();
        WebElement result = driver.findElement(By.xpath("(//a[text()=\"View Role\"])[1]"));

        if(result.isDisplayed()){
            System.out.println("Displayed");
        }else{
            File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            File target = new File(".\\screenshots\\x.png");
            Files.copy(file.toPath(), target.toPath());
        }
        WebDriverSettings.Wait(2);

        driver.quit();
    }
}
