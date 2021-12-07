
public class Pow {
	 static int power(int N, int P)
	    {
		 int pow = 1;
	        for (int i = 1; i <= P; i++)
	            pow *= N;
	        return pow;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int N = 4;
	        int P = 3;
	  
	        System.out.println(power(N, P));
	}

}
