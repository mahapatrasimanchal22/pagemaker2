package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pom.PomTask;
import Pom.PomaActitime;

public class Cancel {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","S:\\SESW\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver op=new ChromeDriver();

		op.get("https://demo.actitime.com/login.do");
		
		PomaActitime login=new PomaActitime(op);
		login.loginprocces();
		Thread.sleep(5000);
		PomTask Task=new PomTask(op);
		Task.clicktask();
	}

}
