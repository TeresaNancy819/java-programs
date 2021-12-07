import java.util.Scanner;

public class StudentH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MPCMarks mp=new MPCMarks();
		CLCMarks cl=new CLCMarks();
		//accsessing mp class
		mp.ReadDetails();
		mp.DisplayDetails();
		mp.ReadMPCMarks();
		mp.DisplayMPCMarks();
		//accessing the clc
		cl.ReadDetails();
		cl.DisplayDetails();
		cl.ReadMPCMarks();
		cl.DisplayCLCMarks();
	}

}

class StudentDet{
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

	class MPCMarks extends StudentDet{
		 int MathsMarks,PhysisMarks,ChemistryMarks;
		 Scanner scan=new Scanner(System.in);
		 
		    void ReadMPCMarks() {
				System.out.println("enter the maths marks");
			MathsMarks=scan.nextInt();
	 	   System.out.println("enter the physis marks ");
	 	  PhysisMarks=scan.nextInt();
	 	   System.out.println("enter the chemistry marks");
	 	    ChemistryMarks=scan.nextInt();
	 	 
	 }
		         void DisplayMPCMarks() {
		    	System.out.println("the M1 Marks :"+MathsMarks);
		    	System.out.println("the M2 marks:"+PhysisMarks);
		    	System.out.println("the M3 marks :"+ChemistryMarks);
				
				}
		
	}
	class CLCMarks extends StudentDet{
		 int CommerceMarks,EconomicsMarks,CivicsMarks;
		 Scanner scan=new Scanner(System.in);
		    void ReadMPCMarks() {
			
			System.out.println("enter the commerce marks");
			CommerceMarks=scan.nextInt();
	 	   System.out.println("enter the economics marks ");
	 	  EconomicsMarks=scan.nextInt();
	 	   System.out.println("enter the civics marks");
	 	  CivicsMarks=scan.nextInt();
	 	 
	 }
		         void DisplayCLCMarks() {
		    	System.out.println("the commerce Marks :"+CommerceMarks);
		    	System.out.println("the economics marks:"+EconomicsMarks);
		    	System.out.println("the civics marks :"+CivicsMarks);
				
				}
		
	}
