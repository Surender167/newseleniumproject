import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class browserexecution {
         
	public static void main(String[] args) {
		WebDriver br;

//		System.setProperty("webdriver.gecko.driver","D:\\Seleniumwebdriver\\Browserexe\\geckodriver-v0.31.0-win64 (1)\\geckodriver.exe");
//		br = new FirefoxDriver();
//		br.manage().window().maximize();
//		br.get("https://bsadar.github.io/hmrbuild1/Loging.html");
//	
		System.setProperty("webdriver.opera.driver","‪‪D:\\Seleniumwebdriver\\Browserexe\\operadrivernewone\\operadriver.exe");
		br = new OperaDriver();
		br.manage().window().maximize();
		br.get("https://bsadar.github.io/hmrbuild1/Loging.html");

	}

}
