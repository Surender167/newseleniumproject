package browsercommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

public class Findelementspractice {

	public static String browser = "ie";
	public static WebDriver br;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		if (browser.equals("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			System.setProperty("webdriver.chrome.driver",
					"D:\\Seleniumwebdriver\\Browserexe\\chromedriver_win32\\chromedriver.exe");

			br = new ChromeDriver();
			br.manage().window().maximize();
		}
		if (browser.equals("opera")) {
			System.setProperty("webdriver.opera.driver",
					"D:\\Seleniumwebdriver\\Browserexe\\operadriver_win64\\operadriver.exe");
			br = new OperaDriver();
			br.manage().window().maximize();
		}
		if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"D:\\Seleniumwebdriver\\Browserexe\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			br = new FirefoxDriver();
			br.manage().window().maximize();
		}
		if (browser.equals("ie")) {
			System.setProperty("webdriver.ie.driver",
					"D:\\Seleniumwebdriver\\Browserexe\\IEDriverServer\\IEDriverServer.exe");
			br = new InternetExplorerDriver();
			br.manage().window().maximize();
		}
		// br.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		br.get("https://bsadar.github.io/hmrbuild1/Loging.html");

		WebElement userid = br
				.findElement(By.xpath("//body[1]/center[1]/table[1]/tbody[1]/tr[2]/td[2]/form[1]/input[1]"));
		userid.clear();
		userid.sendKeys("sadar");

		WebElement password = br.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]"));
		password.clear();
		password.sendKeys("sadar");

		WebElement login = br.findElement(By.xpath("//tbody/tr[4]/td[1]/center[1]/input[1]"));
		login.click();

		WebElement update = br.findElement(By.xpath("//b[contains(text(),'Update Profile&Skills')]"));
		update.click();

		WebElement empid = br.findElement(By.id("EID"));
		empid.clear();
		empid.sendKeys("122345678");

		WebElement fname = br.findElement(By.id("fname"));
		fname.clear();
		fname.sendKeys("Surender reddy");

		WebElement lname = br.findElement(By.id("lname"));
		lname.clear();
		lname.sendKeys("Santapuri");
		WebElement gender = br.findElement(By.xpath("//input[@name='sex'][2]"));
		gender.click();
		WebElement exp = br.findElement(By.xpath("//input[@id='exp-3']"));
		exp.click();
		WebElement date = br.findElement(By.id("datepicker"));
		date.clear();
		date.sendKeys("28-06-1997");
		WebElement profession = br.findElement(By.id("profession-1"));
		profession.click();
		WebElement automationtool = br.findElement(By.id("tool-1"));
		automationtool.click();
		Thread.sleep(5000);
		Select objSelect = new Select(br.findElement(By.xpath("//select[@name='continents']")));
		objSelect.selectByVisibleText("KukatPAlly");
		Select additionskills = new Select(br.findElement(By.id("selenium_commands")));
		additionskills.selectByVisibleText("Signal Principles");
		br.findElement(By.xpath("//*[@id='submit']")).click();
		String title = br.getTitle();
		System.out.println(title);
		br.quit();

	}
}
