abstract class MotorBike {
	MotorBike(){
		  System.out.println("MotorBike constructor");
	}
  abstract void brake();
}
 class Bike extends MotorBike{
   Bike(){
	   super();
	  System.out.println("bike constructor");
   }
	void brake() {
		// TODO Auto-generated method stub
		System.out.println("bike brake!!");
	}
	
}



public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike p=new Bike();
		p.brake();
		
	}

}
