
public class program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=50,oddSum=0;
		for(int i=1;i<=num;i++) {
			if(i%2!=0)
			{
			oddSum=oddSum+i;	
			}
		}
		System.out.println("the sum of odd numbers upto "+num+"="+oddSum);

	}

}
