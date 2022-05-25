package testNGpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Loginsuite {
  @Test
  public void testcase1() {
	  
	  System.setProperty("webdriver.chrome.driver",
				"D:\\Seleniumwebdriver\\Browserexe\\chromedriver_win32\\chromedriver.exe");
		WebDriver br = new ChromeDriver();
		br.manage().window().maximize();
		br.get("https://bsadar.github.io/hmrbuild1/Loging.html");
		

		WebElement Username = br.findElement(By.name("id"));
		Username.clear();
		Username.sendKeys("sadar");
		WebElement Password = br.findElement(By.name("pass"));
		Password.clear();
		Password.sendKeys("sadar");
		WebElement Login = br.findElement(By.xpath("//input[@type='button']"));
		Login.click();
		String actresu = br.getTitle();
		System.out.println(actresu);
		
		Assert.assertEquals(actresu, "MainHMR");
		
		
		br.quit();
	}

  }
  
  
  

