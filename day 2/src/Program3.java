import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
		 Program3 p=new Program3();
		 System.out.println("enter the  number");
		 int num=scan.nextInt();
		 p.postivie(num);
	}
  public static int postivie(int a) {
	  
	  if(a<0 ) {
	    	System.out.println("it is negative  number");
	    }
	    else {
	    	System.out.println("it is postive number");
	    }
	return a;
	  
  }
}
