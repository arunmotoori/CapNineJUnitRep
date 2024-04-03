package challengeone;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class BillGenerationTest {
	
	static BillGeneration billObj1=null;
	static BillGeneration billObj2=null;
	static BillGeneration billObj3=null;
	static BillGeneration billObj4=null;
	
	@BeforeClass
	public static void setUp() throws Exception {
		billObj1 = new BillGeneration("1081129157","25/11/2022","Arun Motoori");
		billObj2 = new BillGeneration("1081p29p57","25/11/2022","Arun Motoori");
		billObj3 = new BillGeneration("12346","25/11/2022","Arun Motoori");
		billObj4 = new BillGeneration("12345","25/11/2022","Arun Motoori");
	}

 
	@AfterClass
	public static void tearDown() throws Exception {
	}
	
	@Test
	public void test11CheckForValidBillId(){
		Assert.assertTrue(billObj1.validateBillId());
    }
	
	@Test
	public void test12CheckForInvalidBillId(){
		Assert.assertFalse(billObj2.validateBillId());
    }
	
	@Test
	public void test13CalculateBillAmountForBillIdWithEvenSum(){
		Assert.assertTrue(billObj3.calculateBillAmountAfterLuckyDrawContest(300.0)==270.0);
    }
    
	
	@Test
	public void test14CalculateBillAmountForBillIdWithOddSum() {
		Assert.assertTrue(billObj4.calculateBillAmountAfterLuckyDrawContest(300.0)==300.0);
	}
}
