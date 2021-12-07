import java.util.Scanner;

public class StudentIn {

	 public static void main(String[] args) {
		 Result m=new Result();
		m.ReadDetails();
		m.DisplayDetails();
		m.ReadMarks();
		m.DisplayMarks();
		m.CalculateResult();
		m.DisplayResult();
	
	}
    
}
 class Marks extends StudentIn2{
	 int M1,M2,M3;
	 Scanner scan=new Scanner(System.in);
	    void ReadMarks() {
		
		System.out.println("enter the M1");
 	    M1=scan.nextInt();
 	   System.out.println("enter the M2");
 	    M2=scan.nextInt();
 	   System.out.println("enter the M3");
 	    M3=scan.nextInt();
 	 
 }
	         void DisplayMarks() {
	    	System.out.println("the M1 Marks :"+M1);
	    	System.out.println("the M2 marks:"+M2);
	    	System.out.println("the M3 marks :"+M3);
			
			}
	
}
 class StudentIn2{
	 

 int StudentId;
 String StudentName;
 String Phone;
 
 void ReadDetails() {
	 Scanner scan=new Scanner(System.in);
 	System.out.println("enter the studentID:");
 	   StudentId=scan.nextInt();
 	   System.out.println("enter the studentName:");
 	   StudentName=scan.next();
 	   System.out.println("enter the phone number");
 	   Phone=scan.next();
		 }
 
      void  DisplayDetails() {
 	System.out.println("the Student ID :"+StudentId);
 	System.out.println("the Student Name :"+StudentName);
 	System.out.println("the phone number :"+Phone);
	
 }
 }
 
 class Result extends Marks{
	 int TotalMarks,Percentage;
	 String Grade;
	  void  CalculateResult() {
		  TotalMarks=M1+M2+M3;
		   Percentage=TotalMarks/3;
		  if(Percentage>=80 ||Percentage<=100) {
			  Grade="FirstClass";
		  }
		  else if(Percentage>=60 ||Percentage<=80) {
			  Grade="Second Class";
		  }
		  else if(Percentage>=40 ||Percentage<=60) {
			 Grade="Third Class";
		  }
		  else {
			  Grade="Failed";
		  }
	  }
	  void DisplayResult() {
		  System.out.println(" the total marks of student is :"+TotalMarks+"\n and the percenatge: "+Percentage+"\n and the Grade is: "+Grade);
	  }
 }