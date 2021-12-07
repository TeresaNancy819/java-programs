
public class Car {
 public static void main(String[] args) {
	 Car2 c=new Car2("bmw","100000");
	 System.out.println(c.getDetails());
}
}
class Car2
{
    String brandName,price;

        Car2(String name,String  pr)
        {
        	brandName =name;
        	price=pr;
        }    

    String getDetails()
    {
        return brandName +" "+price;
    }

}
