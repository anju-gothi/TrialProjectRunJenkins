package run.jenkins.trialProject;

import org.testng.annotations.Test;

public class TestTrial {
	@Test
	public void validateTestName() {
		Trial ta= new Trial();
		ta.getName();
	}

}
