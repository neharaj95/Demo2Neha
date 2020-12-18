package programming_Basic;

public class FibSeries {

	public static void main(String[] args) {
		// 1 2 3 5 8 13
		
		int a=0;
		int b=1;
		int sum;
		for(int i=0;i<9;i++)
		{
//		sum=a+b;   //
//		System.out.println(sum);
//		a=b;
//		b=sum;
		
//		}
		
		sum= a+b;
		System.out.println(sum);
		b=a;
		a=sum;
	}
	}

}
