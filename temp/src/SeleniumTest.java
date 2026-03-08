import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;

public class SeleniumTest{
    public static void main(String[] args) {
        
        WebDriver driver = new FirefoxDriver();

        try {
            
            File file = new File("index.html");
            driver.get(file.getAbsolutePath());

           
            driver.findElement(By.id("tempInput")).sendKeys("0");
            driver.findElement(By.tagName("button")).click();

            
            String resultText = driver.findElement(By.id("result")).getText();
            
          
            String expectedValue = "0°C = 32.00°F"; 

            if (resultText.equals(expectedValue)) {
                System.out.println("TEST PASS: Result matched expected value.");
            } else {
                System.out.println("TEST FAIL: Expected [" + expectedValue + "] but got [" + resultText + "]");
            }

        } finally {
            driver.quit();
        }
    }
}