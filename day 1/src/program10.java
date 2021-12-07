
public class program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1000,start=0;
		for(int i=1;i<=num;i++) {
			if(i%3==0  && i%9==0)
			{
			start=start+i;	
			
		}
		}
		System.out.println("the sum of numbers divisible by 3 and 9 upto "+num+"="+start);

	

}
}