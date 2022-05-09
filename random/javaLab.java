package random;

import java.util.Scanner;

public class javaLab {
public static void main(String[] args) {
	System.out.println("ATM MACHINE ");
	int balance = 10000 ,deposit , withdraw;
	Scanner sc = new Scanner(System.in);
	
	while(true) {
		System.out.println("MENU");
		System.out.println("click on 1 for withdraw ");
		System.out.println("click on 2 for deposit ");
		System.out.println("click on 3 for balance enquiry ");
		System.out.println("click on 4 for change pin ");
		System.out.println("click on 5 for exit ");
		System.out.println("choose the option you want");
		int n = sc.nextInt();
		switch(n) {
		
		case 1:
			System.out.println("enter amount to withdrawn");
			withdraw = sc.nextInt();

	        if(balance >= withdraw)

	        {

	           balance = balance - withdraw;

	           System.out.println("Please collect your money");

	        }

	        else

	        {

	           System.out.println("Insufficient Balance");

	         }

	        System.out.println("");
			break;

        case 2:

        System.out.print("Enter money to be deposited:");

        deposit = sc.nextInt();

        balance = balance + deposit;

        System.out.println("Your Money has been successfully depsited");

        System.out.println("");

        break;      

        case 3:

        System.out.println("Balance : "+balance);

        System.out.println("");

        break;

        case 4:

        System.exit(0);

		
		}
	}
	}
}
