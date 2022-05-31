import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.opera.driver",
				"D:\\Seleniumwebdriver\\Browserexe\\operadriver_win64\\operadriver.exe");
		WebDriver br = new OperaDriver();
		br.manage().window().maximize();
		br.get("https://gmail.com");
        br.findElement(By.id("identifierId")).sendKeys("Chinnyreddy36");
        br.findElement(By.className("VfPpkd-vQzf8d")).click();
        br.quit();
	}

}
