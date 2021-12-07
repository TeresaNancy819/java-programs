package defaultpackage;

import java.util.Scanner;

public class program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       Scanner scan=new Scanner(System.in);
       System.out.println("enter the size of an array");
       int size=scan.nextInt();
       
       int arr[]=new int[size];
       System.out.println("enter the array to be inserted ");
      for(int i=0;i<size;i++) 
      {
    	  arr[i]=scan.nextInt();
    	  
      }
      System.out.println("printed elements are");
      for(int i=0;i<arr.length;i++) {
       System.out.println(arr[i]);
	}

}
}