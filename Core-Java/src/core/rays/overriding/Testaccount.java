package core.rays.overriding;

public class Testaccount {



	public static void main(String[] args) {

		Account a = new Account();

		a.setAccNumber("236545988774451");
		a.setAccType("saving");
		a.setBalance(10000.0);

		System.out.println("account no: " + a.getAccNumber());
		System.out.println("account type: " + a.getAccType());
		System.out.println("current balance: " + a.getBalance());
		a.deposit(100.0);
		a.withdrawal(9000.0);
		
		System.out.println("------------");
		
		Account a1 = new Account();

		a1.setAccNumber("32165498752616");
		a1.setAccType("current");
		a1.setBalance(20000.0);

		System.out.println("account no: " + a1.getAccNumber());
		System.out.println("account type: " + a1.getAccType());
		System.out.println("current balance: " + a1.getBalance());
		a1.deposit(500.0);
		a1.withdrawal(60000);

	}

}


