package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ordertesting {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
       
        System.setProperty("webdriver.chrome.driver", "/Users/karanchhabra/Downloads/chromedriver-mac-arm64/chromedriver");

        // Initialize ChromeDriver instance
        driver = new ChromeDriver();

        // Maximize browser window
        driver.manage().window().maximize();
    }

    @Test
    public void orderFoodTest() throws InterruptedException {
        // Open the website
        driver.get("https://tieteats.netlify.app/home");
        

        // Click on "Order Food" button
//        driver.findElement(By.id("order_food_button")).click();

        // Select restaurant
        driver.findElement(By.xpath("//img[@src='img/cos_market.jpg']")).click();
        Thread.sleep(2000);

        // Select category - Snacks
        driver.findElement(By.xpath("//img[@src='./img/chinii.png']")).click();
        Thread.sleep(2000);
//
//         Add items to the cart - Paneer Momo
        driver.findElement(By.xpath("//div[@id='chinese']//div[1]//div[1]//div[1]//div[2]//div[2]//span[3]//i[1]")).click();
        
        // Add another item to the cart - Mushroom Momo
//        driver.findElement(By.xpath("//div[@id='chinese']//div[1]//div[1]//div[1]//div[2]//div[2]//span[3]//i[1]")).click();
        Thread.sleep(2000);
//     // Select category - Drinks
//        driver.findElement(By.xpath("//img[@src='./img/drinks.png']")).click();
//       
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//body/section/div/div/div/div/div/div/div/div/div[1]/span[1]/i[1]")).click();
//        
//        
        
        // Click on "Go to Cart"
        driver.findElement(By.xpath("//div[@id='chinese']//button[@type='button'][normalize-space()='Go to Cart']")).click();

        // Add address in the address field
        
        WebElement addressField = driver.findElement(By.xpath("//textarea[@id='address']"));
        addressField.sendKeys("Your address here");
        
//
//        // Click on "Order Now"
        WebElement orderNowButton = driver.findElement(By.id("//a[normalize-space()='Order Now']"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", orderNowButton);

        // Add any assertions or verification steps if needed
        // For example, you can verify the order confirmation message or the URL redirection after placing the order
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
//        driver.quit();
    }
}
