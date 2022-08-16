import java.util.Scanner;
import java.util.Date;

public class AccountTransactions {
	double balance;
	double StatusCheck;
	
	Scanner scanner=new Scanner(System.in);
	AccountTransactions(int balance){
		this.balance=balance;
	}

	
	void deposit(int amount) {
		balance=balance+amount;
		StatusCheck=+amount;
		System.out.println("You have succesfully deposited "+amount);
		
		
	}
	void withdraw(int amount) {
		balance=balance-amount;
		if (balance<0) {
			System.out.println("Insufficient balance:Sorry you cannot withdraw this amount");
			
		}else {
		StatusCheck=-amount;
		System.out.println("You have successfully withdrawn "+amount);
		}	
	}
    void statuscheck() {
    	int receipt=(int)(Math.random()*10000);
    	Date date =new Date();
    	if(StatusCheck<0) {
    		System.out.println("");
    		System.out.println("*******************************************************************");
    		System.out.println("You have recently withdrawn "+Math.abs(StatusCheck)+" on "+date.toString());
    		System.out.println("Your Receipt number is "+receipt);
    		System.out.println("Current balance is "+balance);
    		System.out.println("*******************************************************************");
    	}else if(StatusCheck>0) {
    		System.out.println("");
    		System.out.println("*******************************************************************");
    		System.out.println("You have recently deposited "+StatusCheck+" on "+date.toString());
    		System.out.println("Your Receipt number is "+receipt);
    		System.out.println("Current balance is "+balance);
    		System.out.println("*******************************************************************");
    	}else {
    		System.out.println("");
    		System.out.println("*******************************************************************");
    		System.out.println("No recent transactions carried out ");
    		System.out.println("*******************************************************************");
    	}
    }
}
