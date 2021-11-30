package run.jenkins.trialProject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTrial {
	@Test
	public void validateTestName() {
		Trial ta= new Trial();
		String title=ta.getName();
		Assert.assertEquals(title,"Login | Salesforce");
		//System.out.println(title);
	
	}

}
