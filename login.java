package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exp5 {
    public static void main(String[] args) {
        // Setting system property for Chrome driver
        System.setProperty("webdriver.chrome.driver", "/Users/karanchhabra/Downloads/chromedriver-mac-arm64/chromedriver");

        // Creating a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Opening the registration page
        driver.get("https://tieteats.netlify.app");

        // Entering username
        WebElement usernameField = driver.findElement(By.id("login_email"));
        usernameField.sendKeys("chhabrakaran@gmail.com");

        // Entering password
        WebElement passwordField = driver.findElement(By.id("login_password"));
        String password = "karan12"; // Sample password to be validated
        passwordField.sendKeys(password);

        // Validating password constraints
        validatePassword(password);

        // Other registration details can be filled here...

        // Submitting the registration form
        WebElement submitButton = driver.findElement(By.id("login"));
        submitButton.click();

        
    }

    // Method to validate password constraints
    public static void validatePassword(String password) {
        if (password.length() < 8 || password.length() > 15) {
            System.out.println("Password must be between 8 and 15 characters long.");
            return;
        }
        if (!password.matches(".*\\d.*")) {
            System.out.println("Password must contain at least one digit.");
            return;
        }
        if (!password.matches(".*[A-Z].*")) {
            System.out.println("Password must contain at least one uppercase alphabet.");
            return;
        }
        if (!password.matches(".*[a-z].*")) {
            System.out.println("Password must contain at least one lowercase alphabet.");
            return;
        }
        if (!password.matches(".*[!@#\\$%\\^&\\*\\(\\)\\-_\\+=].*")) {
            System.out.println("Password must contain at least one special character.");
            return;
        }
        if (password.contains(" ")) {
            System.out.println("Password cannot contain whitespace.");
            return;
        }
        System.out.println("Password is valid.");
    }
}
