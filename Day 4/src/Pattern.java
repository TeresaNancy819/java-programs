import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please provide number of rows to print... ");
		int rows = scanner.nextInt();
		System.out.println("\nThe star pattern is... ");
	     for (int i=rows; i>=1; i--)
	        {
	            for (int k=1; k<=(i * 2) -1; k++) 
	            { 
	                System.out.print("*"); 
	            } 
	            System.out.println();  
	            for (int j=rows; j>=i; j--)
	            {
	                System.out.print(" ");
	            }
	            
	        }
	        scanner.close();

	

}
}
