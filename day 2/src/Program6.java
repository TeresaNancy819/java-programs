
public class Program6 {
    static int i=90;
    int r=10;
    public static void changeVariable() {
    	i++;
    	
    }
    public void changeVar() {
      this.r=20;
      System.out.println(this.r);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Program6 obj=new Program6();
      System.out.println(i);
      System.out.println(obj.i);
      Program6 obj1=new Program6();
      Program6 obj2=new Program6();
      System.out.println(obj1.i);
      System.out.println(obj2.i);
      System.out.println(obj.r);
      obj.changeVar();
      changeVariable();
      
	}

}
