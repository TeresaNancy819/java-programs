package defaultpackage;

public class ArrayGreatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int temp, size;
		      int array[] = {7,6,9,3,2};
		      size = array.length;

		      for(int i = 0; i<size; i++ ){
		         for(int j = i+1; j<size; j++){
		            if(array[i]>array[j]){
		               temp = array[i];
		               array[i] = array[j];
		               array[j] = temp;
		            }
		         }
		      }
		      System.out.println("The greatest element is "+array[size-1]);
	}

}
