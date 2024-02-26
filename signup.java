package selenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Scanner;

public class thapareatslogin {
    public static String browser = "Chrome";
    public static WebDriver driver;
    public static void main(String[] args) 
    throws InterruptedException {
        if(browser.equals("Firefox")){
            driver = new FirefoxDriver();
        }
        else if(browser.equals("Chrome")){
            driver = new ChromeDriver();
        }
        else if(browser.equals("Edge")){
            driver = new EdgeDriver();
        }

        String s = "78aA$ ";
        String password = "123456";
        for(int i = 0; i < s.length(); i ++){
            
            if(browser.equals("Firefox")){
                driver = new FirefoxDriver();
            }
            else if(browser.equals("Chrome")){
                driver = new ChromeDriver();
            }
            else if(browser.equals("Edge")){
                driver = new EdgeDriver();
            }
            password += s.charAt(i);
            driver.manage().window().maximize();
            driver.get("https://tieteats.netlify.app");
            
            Thread.sleep(2000);
            driver.findElement(By.id("signUp")).click();
            driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Karan");
            driver.findElement(By.xpath("//input[@placeholder='contact']")).sendKeys("7889080485");
            driver.findElement(By.xpath("//input[@placeholder='city']")).sendKeys("Ludhiana");
         
            
            driver.findElement(By.id("email")).sendKeys("karanggg@gmail.com");
            driver.findElement(By.id("password")).sendKeys(password);
            Thread.sleep(2000);
            driver.findElement(By.id("register")).click();
            Thread.sleep(2000);
            driver.quit();
        }
     
        Thread.sleep(10000);
        driver.close();
    }
}



