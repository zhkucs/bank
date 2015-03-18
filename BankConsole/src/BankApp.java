
public class BankApp {
	public static void main(String[] args){
		Account acc = new Account();
		acc.save(500.0);
		acc.depoit(100.0);
		acc.history();
	}
}
