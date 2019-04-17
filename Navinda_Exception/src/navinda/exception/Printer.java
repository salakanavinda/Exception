package navinda.exception;

public class Printer {
	
	void print(int noc) {
	try {
		validate(noc);
	}catch (IllegalArgumentException ie) {
		noc = noc*-1;
	}
	
	for(int i=noc;i!=0;i--) {
		System.out.println("printing");
		}
	}
	
	boolean validate(int noc) {
		
		if(noc<0) {
			throw new IllegalArgumentException("NOC sholud be>0");
		}
		return true;
	}

}
