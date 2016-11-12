package BannkAcoount;

import java.util.Random;

public class AccountMain {
	int number;

	public static void main(String[] args) {
		 Random rand = new Random();
		 int number = rand.nextInt(99)+1;
	Account a1= new Account("Indu","Aruva",1000,number );
	a1.deposit(100);
	a1.withdraw(200);
	a1.withdraw(1000);
	System.out.println(a1);
	 
	 number = rand.nextInt(99)+1;
	 Account a2= new Account("Sai","Gunna",2000,number);
		a2.deposit(100);
		a2.withdraw(200);
		a2.withdraw(100);
		System.out.println(a2);
	}

}
