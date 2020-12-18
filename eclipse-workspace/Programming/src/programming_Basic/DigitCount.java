package programming_Basic;

public class DigitCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//4567
		// 4 o/p
		
		int num=456756;
		int count=0;
		
		while(num>0)
		{
			num=num/10;
			count++;
			//System.out.println(count);
		}
		System.out.println(count);
	}

}
