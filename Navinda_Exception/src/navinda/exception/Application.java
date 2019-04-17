package navinda.exception;

public class Application {

	public static void main(String[] args) {
		
		Printer printer = new Printer();
		//printer.print(-5);
		
		SavingsAccount savingsAccount = new SavingsAccount();
		savingsAccount.withdraw(20000);

	}

}
