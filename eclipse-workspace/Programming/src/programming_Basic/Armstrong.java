package programming_Basic;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=153;
		int mod=0;
		int val=0;
		int armstrong=0;
		
		while(num!=0)
		{
			mod=num%10;
			//System.out.println(mod);
			val=(mod*mod*mod);
			num=num/10;
			//System.out.println(num);
			
			
			
			armstrong= (armstrong+val);
			
		}
		System.out.println(armstrong);
	}

}
