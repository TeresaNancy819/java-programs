package defaultpackage;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array character ");
		int n=sc.nextInt();
		System.out.println("enter the element of array character");
		char arr[]=new char[n];
		for(int i=0;i<n;i++)
		{
		arr[i]=sc.next().charAt(0);
		}
		System.out.println("elements are");
		for(int i=0;i<n;i++)
		{
		if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U')
        count++;
		}
		System.out.println(count);

	}
}
