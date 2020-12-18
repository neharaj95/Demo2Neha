package programming_Basic;

public class Rev2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 4589
		// 9854 o/p
		
		int num=4589;
		int rev=0;
		
		while(num!=0)
		{
			int mod=num%10;
			num=num/10;
			rev= (rev * 10) + mod;
		//	System.out.println(rev);
			
			
		}
		System.out.println(rev);

	}

}
