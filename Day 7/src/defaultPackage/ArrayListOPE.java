package defaultPackage;

import java.util.ArrayList;

public class ArrayListOPE {

	public static void main(String[] args) {
		int[] list={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		ArrayList<Integer>evenList = new ArrayList<Integer>();
		ArrayList<Integer>oddList = new ArrayList<Integer>();
		ArrayList<Integer>prime=new ArrayList<Integer>();
		for(Integer s:list)
		{
			
		if(s%2==0)
		evenList.add(s);
		
		else	
		oddList.add(s);
		
		int num=s;
		int rr=num-1;
		int count=1;
		while(rr!=0)
		{
		if(num%rr==0)
		count++;
		rr--;
		}
		if(count==2)
		prime.add(s);
		}
		System.out.println("Even number are: "+evenList);
		System.out.println("Odd number are: "+oddList);
		System.out.println("Prime number are: "+prime);
		}

}
