import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BalanceInquiry b=new BalanceInquiry();
		 Withdrawal w=new  Withdrawal();
		 Deposit d=new Deposit();
		 b.execute();
		 w.execute();
		 d.execute();
	}

}
class Transaction{
	Scanner scan=new Scanner(System.in);
	int accountNumber=67899;
	double balAmt=6700;
	int getAccountNumber( int accountNumber) {
		return this.accountNumber=accountNumber;
	}
	void execute() {
		System.out.println("the account number of the user is : "+accountNumber);
	}
}
class BalanceInquiry extends Transaction{
	 void execute(){
		  super.execute();	
		 System.out.println("the account number of the user is : "+accountNumber);
		System.out.println(" do you want to check your account balance(y/n) ");
		 int bal=scan.next().charAt(0);
		 if(bal=='y'||bal=='Y') {
			 System.out.println("your current balance is : "+balAmt);
		 }
	}
	
	
}
class Withdrawal extends Transaction{

	void execute(){   
		System.out.println("the account number of the user is : "+accountNumber);
		System.out.println(" enter the amt to be withdrawn ");
		 double wd=scan.nextDouble();
		 balAmt=balAmt-wd;
        System.out.println("the amt withdrawn succesfully");
        System.out.println("the current balance is : "+ balAmt);
		 }
	}
	
class Deposit extends Transaction{

	void execute(){
		System.out.println("the account number of the user is : "+accountNumber);
		System.out.println(" enter the amt to be Deposited ");
		 double d=scan.nextDouble();
		 balAmt=balAmt+d;
        System.out.println("the amt withdrawn succesfully");
        System.out.println("the current balance is : "+ balAmt);
		 }
	}
