package programming_Basic;

public class CountOfNumber {

	public static void main(String[] args) {
		
		// 54319
		
		int num=543198797;
		int count=0;
		
		while (num!=0)
		{
			num=num/10;
			count++;
			
			
		}
		System.out.println(count);
		
	}

}
