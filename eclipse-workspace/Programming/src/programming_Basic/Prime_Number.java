package programming_Basic;

public class Prime_Number {

	public static void main(String[] args) {
		
		int i=1;
		int num=19;
		
		if(num%2!=0 && num%i==0)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("Not a prime number");
		}
	}
}
