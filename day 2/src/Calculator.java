import java.util.Scanner;

public class Calculator {

  public static void main(String[] args) {
		// TODO Auto-generated method stub
	  int ans=0 ,sel;
     do {
		
		 Scanner scan=new Scanner(System.in); 
		 System.out.println("enter the first number");
		 int num1=scan.nextInt(); 
		 System.out.println("enter the second number");
		 int num2=scan.nextInt();
		 System.out.println("select the operation:");
	      System.out.print("1.addition\n2.subtraction\n3.multiplication\n4.division\n5 ");
	      int op = scan.nextInt();
	      
	       switch(op) {
	         case 1: ans = num1 + num2;
	               System.out.println(ans);
	            break;
	         case 2: ans = num1 - num2;
	         System.out.println(ans);
	            break;
	         case 3: ans = num1 * num2;
	         System.out.println(ans);
	            break;
	         case 4: ans = num1 / num2;
	         System.out.println(ans);
	            break;
	      default: System.out.printf("Error! Enter correct operation");
	    
	       }
	       System.out.println("do you want to continue ?(y/n)");
	      sel= scan.next().charAt(0);
     }while(sel=='y'|| sel=='Y');
     
     System.out.println("thankyou!!!");
	}	 
    
		 
		 
	}

