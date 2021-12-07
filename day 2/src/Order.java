import java.util.Scanner;

public class Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		 int op=0;
		 int total=0;
		 int totalBill=0; 
		 Scanner scan=new Scanner(System.in);
      System.out.println("please do your order\n 1.Breakfast\n 2.Lunch\n 3.Dinner\n ");
      op = scan.nextInt();
    switch(op) {
      case 1:{
       do {
    	    int coffe=80,dosa=60,puri=70;
    	     System.out.println("1.coffee: Rs 80\n 2.dosal:60\n 3.puri:70\n"); 
    	     int bfop = scan.nextInt();
    	     if(bfop==1) 
    		
    		 totalBill=totalBill+coffe;

     	  
    	  else if(bfop==2) 
    		
    		  totalBill=totalBill+dosa;

    	  
    	  else if(bfop==3)
    		  
    		  totalBill=totalBill+puri;
    	    else 
    		  System.out.println("invalid");
        	 System.out.println("do u want to something to order more?(yes/no)");
        	 ch=scan.next().charAt(0);
       } while(ch==('y')||ch==('Y'));
       System.out.println("the totalBill is :"+ totalBill);
       
      }
     
       }
       
       System.out.println("thankyou!!!");
	}
}

