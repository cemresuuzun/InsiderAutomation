package Base;

import Utils.WebDriverSettings;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class BaseClass {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://useinsider.com/");
        driver.manage().window().fullscreen();
        WebDriverSettings.Wait(5);

        driver.quit();



    }
    public void scrollToElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) element;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }
}
