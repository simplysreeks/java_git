package projectbank;

interface Bank {
	int deposit(int amount);
	int withdraw(int amount);
	int showBalance();

}
class ATM implements Bank{
	int total=0;
	@Override
	public int deposit(int amount) {
		if(amount>0) {
			 total=total+amount;
		}
		else {
			System.out.println("deposit value should be greater than 0");
		}
		return total;
		
		
	}
	@Override
	public int withdraw(int amount) {
		if(amount<total) {
			total=total-amount;
			
		}
		else {
			System.out.println("you have entered amount more than your Available balance");
		}
		return total;

		
	}
	@Override
	public int showBalance() {
		System.out.println("Your available balance is "+total);
		
		return total;
		
		
	}
	
	
}

