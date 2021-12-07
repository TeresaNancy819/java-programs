import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a, b, temp;
	      Scanner s = new Scanner(System.in);
	      
	      System.out.print("Enter the First Number: ");
	      a = s.nextInt();
	      System.out.print("Enter the Second Number: ");
	      b = s.nextInt();
	      
	      temp = a;
	      a = b;
	      b = temp;
	      
	      System.out.println("\na = " +a);
	      System.out.println("b = " +b);
	}

}
