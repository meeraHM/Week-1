
public class BankStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount ba = new BankAccount(12,"Meera",3000);
		ba.Display();
		ba.Deposit(500);
		ba.Display();
		ba.Withdraw(51);
		ba.Display();
		

	}

}
