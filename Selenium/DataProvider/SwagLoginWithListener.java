package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

@Listeners(TestNGListener.class) // attach the listener
public class SwagLoginWithListener {
    public WebDriver driver; // public so listener can access if you later add screenshots

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @Test
    public void validLogin() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        String title = driver.findElement(By.className("title")).getText();
        Assert.assertEquals(title, "Products");
    }

    @Test
    public void invalidLogin() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("invalid_user");
        driver.findElement(By.id("password")).sendKeys("wrong_password");
        driver.findElement(By.id("login-button")).click();

        String error = driver.findElement(By.cssSelector("h3[data-test='error']")).getText();
        Assert.assertTrue(error.toLowerCase().contains("epic sadface"), "Expected error not shown");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) driver.quit();
    }
}

