package programming_Basic;

public class Fib2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	1 1 2 3 5 8
		
		int a=0;
		int b=1;
		int sum;
		
		for(int i=0; i<=5;i++)
		{
			sum=a+b;
			System.out.println(sum);
			a=b;
			b=sum;
			
			
			
		}

	}

}
