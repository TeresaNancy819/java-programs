
public class Occ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "teresa nancy";
		System.out.println(str);
		// count occurrence 
		int count = 0;
	    for (int i=0; i < str.length(); i++)
	    {
	        if (str.charAt(i) == 'a')
	        {
	             count++;
	        }
	    }
		System.out.println("occurrence of a: "+count);
	}

}
