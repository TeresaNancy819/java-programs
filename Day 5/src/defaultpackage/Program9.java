package defaultpackage;

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int sum=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int size=scan.nextInt();
        
        
        int arr[]=new int[size];
       for(int i=0;i<size;i++) {
     	  arr[i]=scan.nextInt();
       }   System.out.println("enter the array to be inserted ");
     
       System.out.println(" sum of array elements are");
       for(int i=0;i<arr.length;i++) {
        sum=sum+arr[i];

 	}        System.out.println(sum);

	}

}
