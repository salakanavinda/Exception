package navinda.exception;

public class Account {
	
	public void withdraw(int amount) {
		
	}
	
	boolean checkBalance(int amount) {
		
		if(amount >10000) {
			throw new IllegalArgumentException("Allowed limit excced");
		}
		return true;
	}

}
