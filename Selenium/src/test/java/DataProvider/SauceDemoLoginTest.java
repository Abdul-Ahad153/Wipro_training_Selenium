package DataProvider;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import DataProvider.SauceDemoDataProvider;   // <-- importing DataProvider class
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;



public class SauceDemoLoginTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000); // just to see result clearly in demo
        driver.quit();
    }

    @Test(dataProvider = "loginData", dataProviderClass = SauceDemoDataProvider.class)
    public void loginTest(String username, String password, String expected) {
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();

        if (expected.equals("success")) {
            // On successful login, URL changes to /inventory.html
            String currentUrl = driver.getCurrentUrl();
            Assert.assertTrue(currentUrl.contains("inventory"), 
                              "Login failed for valid user: " + username);
            System.out.println("✅ Login successful for user: " + username);

        } else if (expected.equals("locked")) {
            // Locked out user gets a specific error
            String errorMsg = driver.findElement(By.cssSelector("h3[data-test='error']")).getText();
            Assert.assertTrue(errorMsg.contains("locked out"),
                              "Expected locked out error but got: " + errorMsg);
            System.out.println("🚫 User locked out: " + username);

        } else if (expected.equals("invalid")) {
            // Invalid credentials show invalid username/password error
            String errorMsg = driver.findElement(By.cssSelector("h3[data-test='error']")).getText();
            Assert.assertTrue(errorMsg.contains("Username and password do not match") 
                           || errorMsg.contains("do not match"), 
                           "Expected invalid login error but got: " + errorMsg);
            System.out.println("❌ Invalid login for user: " + username);

        }
    }
}


