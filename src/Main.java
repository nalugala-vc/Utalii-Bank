import java.util.Scanner;

public class Main {
  
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
    System.out.println("**** WELCOME TO UTALII NATIONAL BANKING ****");
    System.out.println("");
    System.out.println("What action would you want to perform today?");
    System.out.println("1.Create a new account\n2.Deposit Money\n3.Withdraw Money\n4.Take a loan\n5.Status Check\n6.Exit");
    int choice;
    AccountTransactions a2=new AccountTransactions(0);//to allow me to call the various methods in account transactions
    do {
		System.out.println("");
		System.out.println("Enter your choice");
		
		int choice1 = scanner.nextInt();
		choice=choice1;
		switch(choice) {
		case 1: AccountCreation a1=new AccountCreation();
	    a1.NewAccount();
		
		break;
		case 2:
		System.out.println("Please enter the amount you would like to deposit");
	    int amount=scanner.nextInt();
	    
	    a2.deposit(amount);
	    break;
		case 3:System.out.println("Please enter the amount you would like to withdraw ");
		int amount2=scanner.nextInt();
        a2.withdraw(amount2);
		break;
		case 4:System.out.println("Do you have an existing accont?");
		String answer=scanner.next();
		int rate=15;
		if (answer.equals("yes")) {
			System.out.println("are you employed?");
			String answer1=scanner.next();
			if (answer1.equals("yes")) {
				System.out.println("what category does your monthly salary lie?\n1.less than 10000\n2.between 10000 and 49999\n3.between 50000 and 100000\n 4.Over 100000");
				int answer2=scanner.nextInt();
				switch (answer2) {
				case 1:System.out.println("How much do you want to borrow?");
				//can borrow a maximum of 20 000
				double loan=scanner.nextDouble();
				if (loan>20000) {
					System.out.println("Sorry .You cannot borrow this amount");
				
				}
				else {
					System.out.println("Congratulations.You have successfully borrowed ksh "+loan);
					System.out.println("How long are you willing to take to repay your loan(years)");
					int time=scanner.nextInt();
					Loan L1=new Loan(rate,loan,time);
					System.out.println("Your full payable amount after "+time+" years is"+L1.loan(loan, time)); 
					
						
				}break;
				case 2:System.out.println("How much do you want to borrow?");
				//can borrow a maximum of 80 000
				double loan1=scanner.nextDouble();
				if (loan1>80000) {
					System.out.println("Sorry .You cannot borrow this amount");
					
				}
				else {
					System.out.println("Congratulations.You have successfully borrowed ksh "+loan1);
					System.out.println("How long are you willing to take to repay your loan(years)");
					int time=scanner.nextInt();
					Loan L1=new Loan(rate,loan1,time);
					System.out.println("Your full payable amount after "+time+" years is"+L1.loan(loan1, time)); 
					
						
				
				}break;
				case 3:System.out.println("How much do you want to borrow?");
				//can borrow a maximum of 200000
				double loan3=scanner.nextDouble();
				if (loan3>200000) {
					System.out.println("Sorry .You cannot borrow this amount");
					System.exit(0);
				}
				else {
					System.out.println("Congratulations.You have successfully borrowed ksh "+loan3);
					System.out.println("How long are you willing to take to repay your loan(years)");
					int time=scanner.nextInt();
					Loan L1=new Loan(rate,loan3,time);
					System.out.println("Your full payable amount after "+time+" years is"+L1.loan(loan3, time)); 
				
						
			}break;
			
				case 4:System.out.println("How much do you want to borrow?");
				//can borrow a maximum of 500000
				double loan4=scanner.nextDouble();
				if (loan4>500000) {
					System.out.println("Sorry .You cannot borrow this amount");
					System.exit(0);
				}
				else {
					System.out.println("Congratulations.You have successfully borrowed ksh "+loan4);
					System.out.println("How long are you willing to take to repay your loan(years)");
					int time=scanner.nextInt();
					Loan L1=new Loan(rate,loan4,time);
					System.out.println("Your full payable amount after "+time+" years is "+L1.loan(loan4, time)); 
					
				}break;				
		}
			}
		}
		else {
			System.out.println("You need an existing account to get a loan");
			
			}break;
			
		case 5:a2.statuscheck();
		break;
		case 6:System.out.println("Thank you for banking with us");
		break;
		default:System.out.println("Option not available");
		
		} }while (choice!=6);

}
}
