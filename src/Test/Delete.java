package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pom.PomDelete;
import Pom.PomTask;
import Pom.PomaActitime;

public class Delete {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","S:\\SESW\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver op=new ChromeDriver();
		
		op.get("https://demo.actitime.com/login.do");
		
		op.manage().window().maximize();
		
		PomaActitime login=new PomaActitime(op);
		login.loginprocces();
		Thread.sleep(3000);
		PomDelete del=new PomDelete(op);
		del.Deletename();
	}

}
