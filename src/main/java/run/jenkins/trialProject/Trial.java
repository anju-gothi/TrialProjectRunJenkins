package run.jenkins.trialProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Trial {
	
	public String getName() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		return driver.getTitle();
		
		//System.out.println("Name of the Employer is Enexus");
	}

}
