package programming_Basic;

public class Sorting_Asc {

	public static void main(String[] args) {
		//3,1,8,4,2
		
		int[] arr= {3,1,8,4,2};
		int temp=0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					arr[i]=arr[j];
					temp=arr[i];
					arr[j]=arr[i];
				}
				System.out.println();
			}
			
		}
		
	}

}
