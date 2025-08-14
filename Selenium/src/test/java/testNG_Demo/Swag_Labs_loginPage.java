package testNG_Demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.HashMap;

public class Swag_Labs_loginPage {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setup() {
        // Set Chrome options to disable password manager and popups
        ChromeOptions options = new ChromeOptions();

        // Disable infobars, extensions, and notifications
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-notifications");

        // Disable password manager popups
        HashMap<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        options.setExperimentalOption("prefs", prefs);

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        driver.get("https://www.saucedemo.com/");
        System.out.println("Navigated to SauceDemo");
    }

    @Test
    public void fullFlowTest() {

        // Login
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name"))).sendKeys("standard_user");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password"))).sendKeys("secret_sauce");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("title")));
        System.out.println("Logged in successfully");

        // Add to Cart
        wait.until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-sauce-labs-backpack"))).click();
        System.out.println("Added product to cart");
        wait.until(ExpectedConditions.elementToBeClickable(By.className("shopping_cart_link"))).click();

        // Checkout Information
        wait.until(ExpectedConditions.elementToBeClickable(By.id("checkout"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("checkout_info_container")));

        driver.findElement(By.id("first-name")).sendKeys("Abdul");
        driver.findElement(By.id("last-name")).sendKeys("Ahad");
        driver.findElement(By.id("postal-code")).sendKeys("12345");

        driver.findElement(By.id("continue")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("finish"))).click();

        WebElement confirmation = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("complete-header")));
        System.out.println("Order Completed: " + confirmation.getText());

        // Assertion to validate order
        Assert.assertEquals(confirmation.getText(), "Thank you for your order!");

        // Back to Home
        wait.until(ExpectedConditions.elementToBeClickable(By.id("back-to-products"))).click();
        System.out.println("Navigated back to home page");

        // Logout
        wait.until(ExpectedConditions.elementToBeClickable(By.id("react-burger-menu-btn"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link"))).click();
        System.out.println("Logged out successfully");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
