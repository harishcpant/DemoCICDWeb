package DemoCICDWeb.DemoCICDWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {
	
	@Test
	public void WebTest() throws InterruptedException {
		
		System.out.println("Running HTML Unit Driver..");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://automationtalks.com/");
		
		System.out.println("Title here is :->"+driver.getTitle());
		
		Thread.sleep(5000);   
		driver.close();
		
	}
	

}
