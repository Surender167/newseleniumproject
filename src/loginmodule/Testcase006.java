package loginmodule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase006 {

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
		} else if (title.equalsIgnoreCase("HMR")) {

			System.out.println("tile is different");
		}
		WebElement Username = br.findElement(By.name("id"));
		Username.clear();
		Username.sendKeys("sadar");
		WebElement Password = br.findElement(By.name("pass"));
		Password.clear();
		Password.sendKeys("sadar");
		WebElement reset = br.findElement(By.xpath("//input[@type='Reset']"));
		reset.click();
		String usernameafterclear = Username.getText();
		if (usernameafterclear.equals("")) {
			System.out.println("Testcase 6 is pass");
		} else {
			System.out.println("Testcase 6 is failed");

		}

		br.quit();

	}

}
