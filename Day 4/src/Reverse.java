import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan=new Scanner(System.in);
      System.out.println("enter the string");
      String str=scan.next();
      String rev="";
      char ch;
      for(int i = str.length()-1; i >= 0; i--){    
          rev = rev + str.charAt(i);    
   
      }
      System.out.println("the reversed of given String  "+rev);
	}

}
