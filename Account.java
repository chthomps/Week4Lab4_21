//Account Program using a static variable in order to tally accounts generated

public class Account {
	
	private static int numAccounts= 0; //static variable- persists through program
	
	public Account() {  //constructor method for Account
		numAccounts++;
	}
	
	public static int getNumAccounts() { //static method functioning as getter for numAccounts
		return numAccounts;
	}
	
	public static void main(String[] args) {
		
		Account account1, account2, account3, account4, account5;  //est. 5 Account objects
		
		account1= new Account();
		account2= new Account();
		account3= new Account();
		account4= new Account();
		account5= new Account();
		
		
		System.out.println("The number of total Accounts is: "+ Account.getNumAccounts());  //static methods are called by class (Account) name
		

	}

}
