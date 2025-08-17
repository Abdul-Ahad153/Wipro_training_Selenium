package testNG_smoke_groups;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PhpTravelsLoginTest {
    WebDriver driver;

    @Test
    public void validLoginTest() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://phptravels.net/admin");

        // Enter login credentials
        driver.findElement(By.name("email")).sendKeys("admin@phptravels.com");
        driver.findElement(By.name("password")).sendKeys("demoadmin");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        // Check if Dashboard is visible
        Thread.sleep(3000);
        Assert.assertTrue(driver.getCurrentUrl().contains("admin"), "Login Failed!");
        System.out.println("✅ Login Successful: Dashboard Opened");
        
        driver.quit();
    }
}

