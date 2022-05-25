package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelementslins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\Seleniumwebdriver\\Browserexe\\chromedriver_win32\\chromedriver.exe");
		WebDriver br = new ChromeDriver();
		br.manage().window().maximize();
		br.get("https://www.redbus.in/");
		List<WebElement> links = br.findElements(By.tagName("a"));
		int t = links.size();
		System.out.println(t);

		for (int i = 0; i <= t - 1; i++) {

			String lname = links.get(i).getText();
			System.out.println(lname);

		}

	}
}
