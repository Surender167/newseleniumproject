package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelementspractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"D:\\Seleniumwebdriver\\Browserexe\\chromedriver_win32\\chromedriver.exe");
		WebDriver br = new ChromeDriver();
		br.manage().window().maximize();
		br.get("https://www.redbus.in/");
       List<WebElement> tname = br.findElements(By.tagName("a"));
      int t =  tname.size();
      System.out.println(t);
       }

}
