package practicepurpose;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\\\Seleniumwebdriver\\\\Browserexe\\\\chromedriver_win32\\\\chromedriver.exe");

		WebDriver sr = new ChromeDriver();
		sr.get("https://www.facebook.com/");
		sr.manage().window().maximize();
		sr.findElement(By.id("//input[@id='email']")).sendKeys("Chinnyreddy36@gmail.com");

	}

}
