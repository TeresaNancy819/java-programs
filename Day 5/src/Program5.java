import java.util.Scanner; 

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan=new Scanner(System.in);
       System.out.println("enter the number");
       int num=scan.nextInt();
       try {
    	   if(num<0)
    	 
    		   throw new Number("enter the proper number");
    		   System.out.println("Number is "+num);
    	          }
       catch(Number n) {
    	   System.out.println(n);
       }
	}

}
class Number extends Exception{
	public Number(String message) {
		super(message);
	}
}
