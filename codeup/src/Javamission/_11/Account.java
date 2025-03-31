package Javamission._11;

public class Account {
	private String depoNumber;		// 계좌번호 
	private String depositor; 		// 예금주
	private int deposit; 			// 잔고
	
	public Account() {
		this("계좌없음", "이름없음", 0); 
	} 
	
	public Account(String depoNumber, String depositor, int deposit) {
		this.depoNumber = depoNumber;
		this.depositor = depositor;
		this.deposit = deposit;
	}

	public String getDepoNumber() {
		return depoNumber;
	}

	public String getDepositor() {
		return depositor;
	}

	public int getDeposit() {
		return deposit;
	}

	public void setDepoNumber(String depoNumber) {
		this.depoNumber = depoNumber;
	}

	public void setDepositor(String depositor) {
		this.depositor = depositor;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}

	@Override
	public String toString() {
		return "Account [depoNumber=" + depoNumber + ", depositor=" + depositor + ", deposit=" + deposit + "]";
	}
	
	
	
}
