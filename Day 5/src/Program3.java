
public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         try {
        	 int a[]= new int[5];
        	 a[5]=10/0;
         }
         catch(NullPointerException e)
         {System.out.println(e);} 
         catch(ArithmeticException e) {
        	 System.out.println("it is arithematic exception");
         }
         catch(ArrayIndexOutOfBoundsException e) {
        	 System.out.println("it is array index exception");
         }
         catch(Exception e) {
        	 System.out.println("it  exception");
         }
         
         
         //null
         String data=null;
         try{
              if(data.equals("teresa"))
             System.out.println(data);
            }
            catch(NullPointerException e)
               {
            	System.out.println(e);
            	} 
            finally {
            	System.out.println("finally block is executed");
            	}
            System.out.println("remaining code");

            //array
            int ar[] = { 1, 2, 3, 4, 5 };
            try {
                for (int i = 0; i <= ar.length; i++)
                    System.out.print(ar[i]+" ");
            }
            catch (Exception e) {
                System.out.println("\nException caught");
            }
            
	}
        
	}


