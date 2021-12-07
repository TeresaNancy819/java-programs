
public class program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int calls=300;
	int bills=0;
	 if(calls<=100)
	 {
		 System.out.println(" first 100 calls are free RS:  "+bills);
	 }
	 else if(calls>=101 && calls<=200)
	 {
		 bills=(calls-100)*1;
		 System.out.println("call cost Rs:"+bills);
	 }
	 else if(calls>=201 && calls<=300)
	 {
		 bills=(calls-200)*2+100;
		 System.out.println("call cost Rs: "+bills);
	 }

	 else if(calls>=301 && calls<=400)
	 {
		 bills=(calls-300)*3+200+100;
		 System.out.println("call cost Rs: "+bills);
	 }
	

	}

}
