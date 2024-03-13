package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING
		
		Account acc1 = bacc;
		//atribuindo um objeto da subclasse para a superclasse
		Account acc2 = new BusinessAccount(1003, "Fernanda", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Patricia", 0.0, 0.01);

	}

}
