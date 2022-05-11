package loginmodule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"D:\\Seleniumwebdriver\\Browserexe\\chromedriver_win32\\chromedriver.exe");
		WebDriver br = new ChromeDriver();
		br.manage().window().maximize();
		br.get("https://bsadar.github.io/hmrbuild1/Loging.html");
		String title = br.getTitle();
		System.out.println(title);

		if (title.equals("HMR")) {

			System.out.println("title is same");
		} else {

			System.out.println("tile is different");
		}

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
		if (actresu.equals("MainHMR")) {

			System.out.println();
			System.out.println("------------------------");
			System.out.println("Test case 1 is pass");
		}
		else {
			
			System.out.println("Test case 1 is fail");
		}
		br.quit();
	}
}
