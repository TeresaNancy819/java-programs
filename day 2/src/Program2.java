import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
		 Program2 p=new Program2();
		 System.out.println("enter the  number");
		 int num=scan.nextInt();
		 p.even(num);
	} 
	public static int even(int s)
	{
		
			if(s%2==0) {	
			System.out.println("it is even number");
	          }
		   else {
			System.out.println("its is not odd number");
	     	}
		
       		return s;
		
       	}
	}

