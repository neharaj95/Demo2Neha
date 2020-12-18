package programming_Basic;

public class DiffAdjof2nums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[] = {1, 2,3,5,9};
		int a;
		
		for(int i=0;i<num.length-1;i++)
		{
			a= num[i+1]-num[i];
			System.out.println(a);
		}

	}

}
