package secondday;

public class SalaryAccount extends SBAccount{
	float minBalance=0, interestRate=7f;
	
	public void checkBalance() {
		
		int fine=25;
		
		if(availableBalance < minBalance) {
			System.out.println("Available balance is less than minimum balance");
			availableBalance -= fine; 
			System.out.println("Charged 25 rupees as fine");
		}
	}
	
	@Override
	public void calculateInterest() {
		if(numberOfDays > 90) {
			availableBalance += (availableBalance * 0.07f);
			numberOfDays -= 90;
		}
		
		System.out.println("Updates balance after credit of interest is="+availableBalance);
	}
	
}
