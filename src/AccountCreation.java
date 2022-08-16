import java.util.Scanner;

public class AccountCreation {
	String name;
	int age;
	int IDNO;
	int accountNo;
	//a contructor to enable me to call functions from this class
	AccountCreation(){
	
	}
	void NewAccount() {
		int accountNo=(int)(Math.random()*10000);
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter name");
		String name=scanner.next();
		System.out.println("Please enter your ID Number");
		int IDNO=scanner.nextInt();
		System.out.println("Please enter your age");
		int age=scanner.nextInt();
		if (age<18) {
			System.out.println("Sorry only the persons over 18 can create an account");
		}
		else {
			
			System.out.println("Congratulations! "+name+" You have created a new account");
			System.out.println("Your account number is "+accountNo);
		}
	}

}
