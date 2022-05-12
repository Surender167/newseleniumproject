package regressionsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login extends Repository{
  //  String buildpath = "https://bsadar.github.io/hmrbuild1/Loging.html";
	
	String buildpath = super.buildpath ;
	void testcase1() {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Seleniumwebdriver\\Browserexe\\chromedriver_win32\\chromedriver.exe");
		WebDriver br = new ChromeDriver();
		br.manage().window().maximize();
		br.get(buildpath);
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
		} else {

			System.out.println("Test case 1 is fail");
		}
		br.quit();

	}

	void testcase2() {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Seleniumwebdriver\\Browserexe\\chromedriver_win32\\chromedriver.exe");
		WebDriver br = new ChromeDriver();
		br.manage().window().maximize();
		br.get(buildpath);
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
		Password.sendKeys("Dadar");
		WebElement Login = br.findElement(By.xpath("//input[@type='button']"));
		Login.click();
		String text = br.switchTo().alert().getText();
		System.out.println(text);
		if (text.equals("Invalid Password")) {
			System.out.println();
			System.out.println("------------------------------");
			System.out.println("Test case 2 pass");
		} else {
			System.out.println("Test case 2 fail");
		}
		br.switchTo().alert().accept();
		br.quit();
	}

	void testcase3() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Seleniumwebdriver\\Browserexe\\chromedriver_win32\\chromedriver.exe");
		WebDriver br = new ChromeDriver();
		br.manage().window().maximize();
		br.get(buildpath);
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
		} else {
			System.out.println("Test case 3 is fail");
		}
		br.switchTo().alert().accept();
		br.quit();

	}

	void testcase5() {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Seleniumwebdriver\\Browserexe\\chromedriver_win32\\chromedriver.exe");
		WebDriver br = new ChromeDriver();
		br.manage().window().maximize();
		br.get(buildpath);
		String title = br.getTitle();
		System.out.println(title);

		if (title.equals("HMR")) {

			System.out.println("title is same");
		} else if (title.equalsIgnoreCase("HMR")) {

			System.out.println("tile is different");
		}
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

		if (text.equals("Invalid UserID")) {
			System.out.println();
			System.out.println("------------------------------");
			System.out.println("Test case 5 is pass");
		} else {
			System.out.println("Test case 5 is fail");
		}
		br.switchTo().alert().accept();
		br.quit();

	}

	void testcase6() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Seleniumwebdriver\\Browserexe\\chromedriver_win32\\chromedriver.exe");
		WebDriver br = new ChromeDriver();
		br.manage().window().maximize();
		br.get(buildpath);
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
