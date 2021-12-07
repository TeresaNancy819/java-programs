
public class program1 {
    int rollNo;
    public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	String Name;
    public  void setRollNo(int rollNo) {
    	this.rollNo=rollNo;
    	
    }
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      program1 s=new program1();
      s.setName("teresa");
      s.setRollNo(5729);
      System.out.println(s.getName());
      System.out.println(s.getRollNo());
	}

}
