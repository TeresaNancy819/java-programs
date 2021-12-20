package Day10.maven;

import org.springframework.stereotype.Component;

@Component

public class MyMessage {
	public MyMessage()
	{
		System.out.println("inside construcor....");
	}
	void display()
	{
		System.out.println("inside method.....");
	}

}
