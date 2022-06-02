import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class browserexecution {

	public static void main(String[] args) {
		WebDriver br;
		System.setProperty("webdriver.gecko.driver","D:\\Seleniumwebdriver\\Browserexe\\geckodriver-v0.31.0-win64 (1)\\geckodriver.exe");
		br = new FirefoxDriver();
		br.manage().window().maximize();
		br.get("https://bsadar.github.io/hmrbuild1/Loging.html");
	
	}

}
