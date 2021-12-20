package defaultPackage;

public class Pen {
      String brand;
      double cost;
      String color;
      
	public Pen(String brand, double cost, String color) {
		this.brand = brand;
		this.cost = cost;
		this.color = color;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Pen p1=new Pen("cello",4.5,"black");
       Pen p2=new Pen("cello2",4.0,"blue");
       System.out.println("student 1 pen details are");
       System.out.println(p1.brand+" "+p1.cost+" "+p1.color);
       System.out.println("student 2 pen details are");
       System.out.println(p2.brand+" "+p2.cost+" "+p2.color);
	}

}
