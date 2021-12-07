import java.util.*;

public class Program1 {
	
	
	void fact(int x) {
		int	fact=1,i=1;
		while(i<=x) {
			fact=fact*i;
			i++;}
		System.out.println("the factoial of "+x+" :"+fact);
	}
    void sum(int p,float q,int r,float s) {
      float  sum=p+q+r+s;
      System.out.println(sum);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Program1 p=new Program1();
      Scanner s=new Scanner(System.in);
      System.out.println("enter the number :");
      int num=s.nextInt();
      p.fact(num);
      
      //sum
      System.out.println("enter the number :");
      int a=s.nextInt();
      System.out.println("enter the number :");
      float b=s.nextFloat();
      System.out.println("enter the number :");
      int c=s.nextInt();
      System.out.println("enter the number :");
      float d=s.nextFloat();
     
      p.sum(a,b,c,d);
	}

}
