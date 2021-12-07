
public class Fact { 
	public static void main(String[] args) {
	int	fact=1,i=1;
	int num=6;
	while(i<=num) {
		fact=fact*i;
		i++;
	}
	System.out.println("the factorial of " +num+" is "+fact);
	}

}
