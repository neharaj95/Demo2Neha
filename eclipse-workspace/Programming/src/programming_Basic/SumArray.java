package programming_Basic;

public class SumArray {

	public static void main(String[] args) {
		
		int[] num= {4,9,1,3};
		int sum=0;
		
		for(int i=0;i<num.length;i++)
		{
			sum=num[i]+sum;
			
		}
		System.out.println(sum);
	}

}