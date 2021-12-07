
public class demo {


    public static void main(String aa[]) throws MyExcep
    {
        int age=10;
         if(age<18)
         {
             throw new MyExcep("age is not valid exception");
         }
    }
}
 

class MyExcep extends Exception
{
 
    public MyExcep(String message) {
        super(message);

    }
}


