package browsercommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsercommandspractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\Seleniumwebdriver\\Browserexe\\chromedriver_win32\\chromedriver.exe");
		WebDriver br = new ChromeDriver();
		br.get("https://www.facebook.com/");
		String ab = br.getTitle();
		System.out.println(ab);
		String df = br.getCurrentUrl();
		System.out.println(df);
		String hi = br.getPageSource();
		System.out.println(hi);
		Navigation l = br.navigate();
		l.to("https://www.redbus.in/");
		l.back();
		l.forward();
		l.refresh();
		br.quit();
	}
}
