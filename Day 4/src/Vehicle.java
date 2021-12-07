import java.util.Scanner;

interface IVehicle{

    public double tuneUpCost();
  
   
    public boolean canCarry(int numPassengers);
  }

public class Vehicle implements IVehicle {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
         Vehicle v=new Vehicle();
         double tc=v.tuneUpCost();
         System.out.println("  the timeup cost:"+tc);
         System.out.println("enter the number of passanger: ");        
        int x=scan.nextInt();
         boolean ss =v.canCarry(x);
   
	}

	@Override
	public double tuneUpCost() {
		return 2430.00;
	}

	@Override
	public boolean canCarry(int x) {
		// TODO Auto-generated method stub
     if (x>50) {
    	 System.out.println("vehicle cannot hold given "+x+"passengers");
     }
     else {
    	 System.out.println("vehicle can hold given "+x+"  passengers");
     }
	return false;
	}

}
