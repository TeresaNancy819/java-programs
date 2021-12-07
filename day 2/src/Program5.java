import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
		 Program5 p=new Program5();
		 System.out.println("enter the  radius of circle");
		 int num=scan.nextInt();
		 p.circle(num);
		 
		 
		 System.out.println("enter the  length of rect");
		 int length=scan.nextInt();
		 System.out.println("enter the  breadth of rect");
		 int breadth=scan.nextInt();
		 p.rect(length,breadth);
		 
		 System.out.println("enter the  side of square");
		 int sq=scan.nextInt();
		 p.square(sq);
		 
	}
	
	   public static int circle(int radius) {
       int circleArea=(22*radius*radius)/7;
       System.out.println("the area of circle :"+ circleArea);
	   return circleArea;
        }
	   
	   public static int rect(int a,int b) {
	        int area=a*b;
	        System.out.println("the area of reactangle "+ area);
			return area;
	   }
	   public static int square(int s) {
       int sqArea=s*s;
       System.out.println("the area of square:"+sqArea);
	   return sqArea;
       
}
}