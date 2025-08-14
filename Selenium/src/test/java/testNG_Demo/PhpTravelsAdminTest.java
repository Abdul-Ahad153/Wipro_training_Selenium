package testNG_Demo;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

public class PhpTravelsAdminTest {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Starting Test Suite for PHPTravels Admin Login");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Preparing test environment");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Launching browser");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Navigating to PHPTravels Admin Login Page");
        driver.get("https://phptravels.net/admin");
    }

    @Test(priority = 1)
    public void verifyPageTitle() {
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);
        Assert.assertTrue(title.contains("Admin"), "Title does not contain 'Admin'");
    }

    @Test(priority = 2)
    public void loginTest() {
        System.out.println("Performing login...");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")))
            .sendKeys("admin@phptravels.com");

        driver.findElement(By.name("password")).sendKeys("demoadmin");

        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.className("login_button")));
        loginBtn.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'Dashboard')]")));
        System.out.println("Dashboard is loaded!");

        List<WebElement> menuItems = driver.findElements(By.cssSelector(".sidebar-menu li a"));
        System.out.println("Available Menu Options:");
        for (WebElement menu : menuItems) {
            System.out.println("   " + menu.getText());
        }

        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("dashboard"), "Login failed. Dashboard not loaded.");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Test case finished");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Closing browser");
        if (driver != null) {
            driver.quit();
        }
    }

    @AfterTest
    public void afterTest() {
        System.out.println("Test execution completed");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("End of Test Suite");
    }
}
