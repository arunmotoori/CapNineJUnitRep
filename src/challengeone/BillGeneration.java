package challengeone;

public class BillGeneration {
	
	private String billId;
	private String billDate;
	private String customerName;
	
	public BillGeneration(String billId,String billDate,String customerName) {
		super();
		this.billId = billId;
		this.billDate = billDate;
		this.customerName = customerName;
		
	}
	
	public String getBillId() {
		return billId;
	}

	public void setBillId(String billId) {
		this.billId = billId;
	}

	public String getBillDate() {
		return billDate;
	}

	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public boolean validateBillId(){

		char[] ch=billId.toCharArray();

		int count=0;

		for(int i=0;i<billId.length();i++){

			if(Character.isDigit(ch[i]))

				count++;

		}

		if(count==billId.length())

			return true;

		else 

			return false;

	}

	public double calculateBillAmountAfterLuckyDrawContest(double billAmount){

		int temp=0,sum=0; 

		double amount=0;

		int bill=Integer.parseInt(billId);

		while(bill!=0){

			temp=bill%10;

			bill=bill/10;

			sum=sum+temp;

		}

		if(sum%2==0){

			amount=billAmount*0.1;

			billAmount=billAmount-amount;

		}

		return billAmount;

	}
	

}
