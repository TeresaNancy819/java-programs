interface A{
	void meth1();
	void meth2();
}
public class MyClass implements A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    MyClass my=new MyClass();
    my.meth1();
    my.meth2();
	}

	@Override
	public void meth1() {
		// TODO Auto-generated method stub
		System.out.println(" method 1 works!");
		
	}

	@Override
	public void meth2() {
		// TODO Auto-generated method stub
		System.out.println(" method 2 works!");
	}

}
