package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\Seleniumwebdriver\\Browserexe\\chromedriver_win32\\chromedriver.exe");
		WebDriver br = new ChromeDriver();
		br.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		br.manage().window().maximize();
		Actions at = new Actions(br);
		
		WebElement username = br.findElement(By.xpath("//input[@id='txtUsername']"));
		username.clear();
		username.sendKeys("Admin");

		WebElement password = br.findElement(By.xpath("//input[@id='txtPassword']"));
		password.clear();
		password.sendKeys("admin123");

		WebElement login = br.findElement(By.xpath("//input[@id='btnLogin']"));
		login.click();
		
        WebElement admin = br.findElement(By.xpath("//b[contains(text(),'Admin')]"));
		
		at.moveToElement(admin).perform();
		
		WebElement job = br.findElement(By.xpath("//a[@id='menu_admin_Job']"));
	
		at.moveToElement(job).perform();
		WebElement jobcategories = br.findElement(By.xpath("//a[@id='menu_admin_jobCategory']"));
		
		at.moveToElement(jobcategories).click().perform();
	}

}
