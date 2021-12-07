
public class program11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int units=690;
        if(units<=50)
            System.out.print("Bill Rs.0");

        else if(units>50 && units <=100)
        {   
            units=units-50;
        System.out.print(units*6);
        }
        else if(units>100 && units<=150)
        {
            units=(units-100)*8+(50*6);
            System.out.print("Bill Rs."+units);
        }
        else
        {
            units=(units-150)*9+(50*8)+(50*6);
            System.out.print("Bill Rs."+units);
        }
	}

}
