import java.util.Scanner;

public class Number2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows = scanner.nextInt();
		System.out.println("Printing Pattern");
		for (int i = 1; i <= rows; i++)
		{
		for (int j = 1; j <= i; j++)
		{
		System.out.print(i + " ");
		}
		System.out.println();
		}
		}
	}

