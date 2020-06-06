package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Pom.PomProject;
import Pom.PomTask;
import Pom.PomWork;
import Pom.PomaActitime;

public class Actitime {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","S:\\SESW\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver op=new ChromeDriver();
		
		//WebDriver op=new FirefoxDriver();
		
		op.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		op.get("https://demo.actitime.com/login.do");
		
		PomaActitime login=new PomaActitime(op);
		login.loginprocces();
		Thread.sleep(5000);
		/*PomTask click1=new PomTask(op);
		click1.clicktask();
		Thread.sleep(5000);*/
		PomProject click2=new PomProject(op);
		click2.clickproject();
		/*Thread.sleep(5000);
		PomWork click3=new PomWork(op);
		click3.ClickWork();
*/	}
}
