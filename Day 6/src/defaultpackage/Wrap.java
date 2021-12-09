package defaultpackage;

import java.util.ArrayList;

import javax.print.DocFlavor.STRING;

public class Wrap {

	public static void main(String[] args) {
		
		ArrayList<String> list =new ArrayList<>();
		list.add("teresa");
		list.add("py");
		list.add("java");
		for(String x:list) {
			System.out.println(x);
		}
		

	}

}
