package propertyfileusage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpropertyfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\Seleniumwebdriver\\Browserexe\\chromedriver_win32\\chromedriver.exe");
		WebDriver br = new ChromeDriver();
		Properties pr = new Properties();
		FileInputStream fi = new FileInputStream("C:\\Users\\suren\\Userpractice-workspace\\newseleniumproject\\src\\propertyfileusage\\login.properties");
	    pr.load(fi);
		br.get(pr.getProperty("Buildpath"));
		br.findElement(By.xpath(pr.getProperty("Useridlocator"))).sendKeys(pr.getProperty("Useridvalue"));
        br.findElement(By.xpath(pr.getProperty("Passwordidlocator"))).sendKeys(pr.getProperty("Passwordvalue"));
		br.findElement(By.xpath(pr.getProperty("login"))).click();
		br.quit();
	}

}
