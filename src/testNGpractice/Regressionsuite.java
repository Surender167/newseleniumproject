package testNGpractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Regressionsuite {
	WebDriver br;

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Seleniumwebdriver\\Browserexe\\chromedriver_win32\\chromedriver.exe");
		br = new ChromeDriver();
		br.manage().window().maximize();
		br.get("https://bsadar.github.io/hmrbuild1/Loging.html");
	}

	@AfterMethod
	public void afterMethod() {

		br.quit();
	}

	@Test(enabled = true, priority = 1, groups = "login")
	public void testcase1() {

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

	}

	@Test(enabled = true, priority = 2, groups = "login")
	void testcase2() {

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

	@Test(enabled = true, priority = 3, groups = "login")
	void testcase3() {

		WebElement Username = br.findElement(By.name("id"));
		Username.clear();
		Username.sendKeys("Sadar");
		WebElement Password = br.findElement(By.name("pass"));
		Password.clear();
		Password.sendKeys("sadar");
		WebElement Login = br.findElement(By.xpath("//input[@type='button']"));
		Login.click();

		String text = br.switchTo().alert().getText();
		System.out.println(text);

		Assert.assertEquals(text, "Invalid UserID");
		br.switchTo().alert().accept();
	}

	@Test(enabled = true, priority = 4, groups = "login")
	void testcase5() {
		WebElement Username = br.findElement(By.name("id"));
		Username.clear();
		Username.sendKeys("");
		WebElement Password = br.findElement(By.name("pass"));
		Password.clear();
		Password.sendKeys("");
		WebElement Login = br.findElement(By.xpath("//input[@type='button']"));
		Login.click();

		String text = br.switchTo().alert().getText();
		System.out.println(text);

		Assert.assertEquals(text, "Invalid UserID");
		br.switchTo().alert().accept();

	}

	@Test(enabled = true, priority = 5, groups = "login")
	void testcase6() {
		WebElement Username = br.findElement(By.name("id"));
		Username.clear();
		Username.sendKeys("sadar");
		WebElement Password = br.findElement(By.name("pass"));
		Password.clear();
		Password.sendKeys("sadar");
		WebElement reset = br.findElement(By.xpath("//input[@type='Reset']"));
		reset.click();
		String usernameafterclear = Username.getText();
		Assert.assertEquals(usernameafterclear, "");
	}

	@Test(enabled = true, priority = 6, groups = "admin")
	void testcase7() {

		WebElement Username = br.findElement(By.name("id"));
		Username.clear();
		Username.sendKeys("sadar");
		WebElement Password = br.findElement(By.name("pass"));
		Password.clear();
		Password.sendKeys("sadar");
		WebElement Login = br.findElement(By.xpath("//input[@type='button']"));
		Login.click();
		WebElement link = br.findElement(By.xpath("//b[contains(text(),'Station Halts to monitor')]"));
		link.click();
		String tt = br.getTitle();
		System.out.println(tt);
		Assert.assertEquals(tt, "stations");
	}

	@Test(enabled = true,priority=7,groups="admin")
	void testcase8() {

		WebElement Username = br.findElement(By.name("id"));
		Username.clear();
		Username.sendKeys("sadar");
		WebElement Password = br.findElement(By.name("pass"));
		Password.clear();
		Password.sendKeys("sadar");
		WebElement Login = br.findElement(By.xpath("//input[@type='button']"));
		Login.click();
		WebElement link = br.findElement(By.xpath("//b[contains(text(),'Update Profile&Skills')]"));
		link.click();
		String tt1 = br.getTitle();
		System.out.println(tt1);
		Assert.assertEquals(tt1, "AplHmr");

	}

	@Test(enabled = true, priority = 8, groups = "admin")
	void testcase10() {
		WebElement Username = br.findElement(By.name("id"));
		Username.clear();
		Username.sendKeys("sadar");
		WebElement Password = br.findElement(By.name("pass"));
		Password.clear();
		Password.sendKeys("sadar");
		WebElement Login = br.findElement(By.xpath("//input[@type='button']"));
		Login.click();
		WebElement link = br.findElement(By.xpath("//font[contains(text(),'Logout')]"));
		link.click();
		String tt2 = br.getTitle();
		System.out.println(tt2);
		Assert.assertEquals(tt2, "HMR");

	}

}
