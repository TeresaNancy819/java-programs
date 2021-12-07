import java.util.Scanner;

public class Triangle {
	
//	
//	Program(int a,int b,int c){
//		int s=((a+b+c)/2);
//			int	sq=(s*(s-a)*(s-b)*(s-c));
//	        int area=Math.sqrt(sq);
//			int p=a+b+c;
//		System.out.println("area of triangle  "+A);
//		System.out.println("ara of perimeter "+p);
//	}
 
	int l,b,h;
	Triangle(){
	System.out.println("Enter the sides of triangle");
	Scanner s=new Scanner(System.in);

	l=s.nextInt();
	b=s.nextInt();
	h=s.nextInt();
	int p=l+b+h;
	int s2=p/2;
	double sq =(s2*(s2-l)*(s2-b)*(s2-h));
	double area=Math.sqrt(sq);
	System.out.println("Area is: "+area+" Perimeter is: "+p);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//		Triangle p=new Triangle(3,4,5);	
		Triangle p=new Triangle();
	}
}
