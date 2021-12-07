
public class program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=100,evenSum=0;
		for(int i=1;i<=num;i++) {
			if(i%2==0)
			{
			evenSum=evenSum+i;	
			}
		}
		System.out.println("the sum of even numbers upto "+num+"="+evenSum);

	}

}
