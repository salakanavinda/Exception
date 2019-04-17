package navinda.exception;

public class SavingsAccount {
	
	Account account = new Account();
	
	public void withdraw(int amount) {
		
		try {
			account.checkBalance(amount);
			
		}catch (IllegalArgumentException ie) {
			
			throw new RuntimeException("withdraw fail",ie);
		}
		
		account.withdraw(amount);
	}

}
