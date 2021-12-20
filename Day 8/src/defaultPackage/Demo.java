package defaultPackage;

public class Demo {
	
	Demo(){
		System.out.println("non par constructor");
	}
	Demo(int i,String s){
		this();
		System.out.println("int and string type constructor");
	}
	Demo(String s,int i){
		this(5,"nan");
		System.out.println("string and int type constructor");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Demo d=new Demo("ter",8);
	}

}
