package programming_Basic;

public class DiffOfTwoAdjacentNumber {

	public static void main(String[] args) {
		
		// 1 3 7 9
		
		int[] num= {1,3,7,9,14};
		int diff=0;
		
		for(int i=0; i<num.length-1;i++)
		{
			diff= num[i+1]-num[i];
			
			System.out.println(diff);
		}
		
	}

}
