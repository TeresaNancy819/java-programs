import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);  //2
	        System.out.print("Enter character"); //3
	        char ch= scan.next().charAt(0);  //4
	        System.out.print("Enter name");
	        String name=scan.next(); 
	        System.out.print(name+"  , "+ch);
	}

}
