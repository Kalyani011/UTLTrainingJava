package secondday;

public class InheritanceMain {

	public static void main(String[] args) {
		
		//SBAccount sb = new SBAccount();
		
		SalaryAccount sb = new SalaryAccount();
		sb.readBalance();
		sb.checkBalance();
		sb.withdraw();
		sb.checkBalance();
		sb.deposit();
		sb.checkBalance();
		sb.calculateInterest();
		
	}
}
