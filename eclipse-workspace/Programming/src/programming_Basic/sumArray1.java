package programming_Basic;

public class sumArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[]= {1, 2, 3, 7};
		int sum=0;
		
		for(int i=0;i<num.length;i++)
		{
			sum= sum + num[i];
			
		}
		
		System.out.println(sum);

	}

}
