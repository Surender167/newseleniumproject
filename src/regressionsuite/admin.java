package regressionsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class admin extends Repository{
     
	String buildpath = super.buildpath ;
	void test007() {

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
		WebElement link = br.findElement(By.xpath("//b[contains(text(),'Station Halts to monitor')]"));
		link.click();
		String tt = br.getTitle();
		System.out.println(tt);
		if (tt.equals("stations")) {

			System.out.println("Testcase007 is pssed");

		} else {

			System.out.println("Testcase007 is fail");
		}
		br.quit();
	}

	void testcase008() {
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
		WebElement link = br.findElement(By.xpath("//b[contains(text(),'Update Profile&Skills')]"));
		link.click();
		String tt1 = br.getTitle();
		System.out.println(tt1);
		if (tt1.equals("AplHmr")) {
			System.out.println("Testcase008 is passed");
		} else {
			System.out.println("testcase008 is failed");
		}
		br.quit();
		
	}
	
      void tstcase010() {
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
  		WebElement link = br.findElement(By.xpath("//font[contains(text(),'Logout')]"));
  		link.click();
  		String tt2 = br.getTitle();
  		System.out.println(tt2);
  		if(tt2.equals("HMR")) {
  			System.out.println("testcase010 is passed");
  		}else {
  			System.out.println("testcase0010 is failed");
  		}
       br.quit();
      }
      

}
