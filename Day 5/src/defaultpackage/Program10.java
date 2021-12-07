package defaultpackage;

import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int flag=0;
       int sum=0;
       Scanner scan=new Scanner(System.in);
       System.out.println("enter the size of an array");
       int size=scan.nextInt();
       
       int arr[]=new int[size];
       System.out.println("enter the array to be inserted ");
      for(int i=0;i<size;i++) {
    	  
      
    	  arr[i]=scan.nextInt();
    	  if(arr[i]%2==0) {
    		  flag++;
    	  }
    	  if(flag==size) {
    		  System.out.println("all the numbers r even");
    	  }
    	  else 
    		  System.out.println("all the numbers r odd");
	}

}
}