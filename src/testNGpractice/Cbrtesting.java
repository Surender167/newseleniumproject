package testNGpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cbrtesting {
	WebDriver br;

	@Parameters({"browser" , "url"})
	@BeforeMethod

	public void beforemethod(String ibr, String buildpath) {

		if (ibr.equalsIgnoreCase("opera")) {
			System.setProperty("webdriver.opera.driver",
					"D:\\Seleniumwebdriver\\Browserexe\\operadriver_win64\\operadriver.exe");
			br = new OperaDriver();
			br.manage().window().maximize();
			br.get(buildpath);
		} else if (ibr.equalsIgnoreCase("gg")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\Seleniumwebdriver\\Browserexe\\chromedriver_win32\\chromedriver.exe");
			br = new ChromeDriver();
			br.manage().window().maximize();
			br.get(buildpath);
		}
		else if(ibr.equalsIgnoreCase("ff")) {
			
			System.setProperty("webdriver.gecko.driver","D:\\Seleniumwebdriver\\Browserexe\\geckodriver-v0.31.0-win64 (1)\\geckodriver.exe");
			br = new FirefoxDriver();
			br.manage().window().maximize();
			br.get(buildpath);
		}
		
	}

	@AfterMethod
	public void aftermethod() {

		br.quit();
	}

	@Test(enabled = true, groups = "cross", priority = 0)
	public void CrB() {

		WebElement Username = br.findElement(By.name("id"));
		Username.clear();
		Username.sendKeys("sadar");
		WebElement Password = br.findElement(By.name("pass"));
		Password.clear();
		Password.sendKeys("Dadar");
		WebElement Login = br.findElement(By.xpath("//input[@type='button']"));
		Login.click();

		String text = br.switchTo().alert().getText();
		System.out.println(text);

		Assert.assertEquals(text, "Invalid Password");
		br.switchTo().alert().accept();

	}
}