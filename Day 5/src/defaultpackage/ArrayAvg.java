package defaultpackage;

public class ArrayAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int array[] = {10, 20, 30, 40, 50};
		   
		    int sum = 0;
		    int avg = 0;

		   
		    for (int i=0; i<array.length; i++) {
		      sum = sum + array[i];
		    }
		    avg = sum/array.length;
		    System.out.println("Average: " + avg );
	}

}
