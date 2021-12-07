
public class Area {
  int circleArea,area;
  double sqArea;
  
	Area(int rad){
		circleArea=(22*rad*rad)/7;
		
	}
	Area(int length,int breadth){
		   area=length*breadth;
		
	}
	Area(double s){
		 sqArea=s*s;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Area a1=new Area(5);
    Area a2=new Area(5,6);
    Area a3=new Area(6.0);
    System.out.println(a1.circleArea);
    System.out.println(a2.area);
    System.out.println(a3.sqArea);    
    
	}

}
