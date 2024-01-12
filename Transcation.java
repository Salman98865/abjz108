package work;
import java.util.Scanner;

public class Transcation {
	static String amount;
	static Enum<TransactionType> Type;
	
	Scanner scan=new Scanner(System.in);

	public void transcationHome() {
		System.out.println("enter 1 for transfer money");
		System.out.println("Enter 2 for Transcation History");
		int a=scan.nextInt();
		switch(a){
		case 1:
			Transfermoney();
			break;
		case 2:
			Withdraw();
			break;
		case 3:
			Deposit();
			break;
		case 4:
			transcationHistory();
		default:
			System.out.println("please enter the valid input");
		
		}	
	}
	
	private void Deposit() {
		System.out.println("enter the amount to the Deposit");
		amount=scan.nextLine();
	   // Type=TransactionType.Deposit;
		
	}

	private void Withdraw() {
		System.out.println("enter the amount to the WithDrwael");
		amount=scan.nextLine();
	//	Type=TransactionType.Transfer;
		
	}

	public void store(){
		
		
	}

	private void transcationHistory() {
		String s=amount+"  "+Type;
		System.out.print(s);
		
		
	}

	private void Transfermoney() {
		
		System.out.print("enter the amount to transfer");
		amount=scan.nextLine();
		//Type=TransactionType.Transfer;
	}
	

}

