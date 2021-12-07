
public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=100,evenSum=0,i=1;
//		while(i<=num {
//			if(i%2==0)
//			{
//			evenSum=evenSum+i;	
//			}
//			i++;
//		}
		
		do {
			if(i%2==0)
			{
			evenSum=evenSum+i;	
			}
			i++;
		}while(i<=num); 
		System.out.println("the sum of even numbers upto "+num+"="+evenSum);
	}

}
