package challengeone;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Main {
	 
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(BillGenerationTest.class);
		if(result.getFailureCount() == 0) {
			System.out.println("All Test cases Passed");
		}else {
			System.out.println("Failures exist");
			List<Failure> failures = result.getFailures();
			for(Failure fail :  failures){
				System.out.println(fail.getMessage());
			}
		}
	}
 
}
