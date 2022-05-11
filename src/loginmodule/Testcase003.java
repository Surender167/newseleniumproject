package loginmodule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase003 {

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
		Username.sendKeys("Sadar");
		WebElement Password = br.findElement(By.name("pass"));
		Password.clear();
		Password.sendKeys("sadar");
		WebElement Login = br.findElement(By.xpath("//input[@type='button']"));
		Login.click();

		String text = br.switchTo().alert().getText();
		System.out.println(text);

		if (text.equals("Invalid UserID")) {
			System.out.println();
			System.out.println("------------------------------");
			System.out.println("Test case 3 is pass");
			} else
           {
			System.out.println("Test case 3 is fail");
			}
		br.switchTo().alert().accept();
		br.quit();
  }

}
