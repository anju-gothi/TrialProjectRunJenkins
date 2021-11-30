package run.jenkins.trialProject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTrial2 {
	
	@Test
	public void validate() {
		
		Trial2 tt= new Trial2();
		String title=tt.getName2();
		System.out.println("title:"+title);
		Assert.assertEquals(title,"Amazon.com. Spend less. Smile more.");
	}

}
