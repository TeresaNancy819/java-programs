package defaultPackage;

class Test{
   Test(double d){
	   System.out.println(" double typr constructor");
   }
   Test(int i)
   {
	   this(5.9);
	   System.out.println("int type constructor");
   }
}

public class Const extends Test {
	Const(char ch){
		super(40);
		System.out.println("char type constructor");
	}
	
	Const(int i,String s){
		this('q');
		System.out.println("int and string type constructor ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Const c=new Const(10,"java");
	}

}
