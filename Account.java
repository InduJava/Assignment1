package BannkAcoount;

public class Account {
	String fName;
	String lName;
	double bal;
	int accountNo;


	public Account(String fName, String lName, double bal, int accountNo)
	{
		this.fName=fName;
		this.lName=lName;
		this.bal=bal;
		this.accountNo=accountNo;
	}
	
	public void deposit(double amount)
	{
		bal=bal+amount;
		System.out.println("New balance:"+bal);
		
	}
	public void withdraw(double amount)
	{
		if(bal>=amount)
		{
			bal=bal-amount;
			System.out.println("New balance:"+bal);
			
		}
		else
		{
			System.out.println("insufficient balance");

		}
	}
	public String toString()
	{
		String str;
		       str="Name: "+fName+" "+lName+"\n"
	                       +"balance: "+bal+"\n"
				           +"account number: "+accountNo;
		       return str;

	}
	
}
