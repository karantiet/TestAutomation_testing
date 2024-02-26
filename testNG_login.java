package testing;
import org.testng.annotations.Test;

import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class DemoClass {
  @Test(dataProvider="TestData")
  public void TestLogin(String uname, String paswd) {
	  
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("https://tieteats.netlify.app");
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.id("login_email")).sendKeys(uname);
	  driver.findElement(By.id("login_password")).sendKeys(paswd);
	  driver.findElement(By.id("login")).click();
	  
	  
	
	  
	  
	  
  }
  @DataProvider
  public Object[][] TestData()
  {
	  Object[][] data = new Object[4][2];
	  
	  data[0][0] = "thapareats@gmail.com";
	  data[0][1] = "tiet@1234#";
	  
	  data[1][0] = "divesh@gmail.com";
	  data[1][1] = "tiet@";
	  
	  data[3][0] = "karan@gmail.com";
	  data[3][1] = "Test@1234";
	  
	  return data;
  }
}

