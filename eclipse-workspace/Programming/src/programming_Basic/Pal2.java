package programming_Basic;

public class Pal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1 2 3 5 8 13
		//int i=0;
		int a=0;
		int sum=0;
		int b=1;
		
		for(int y=0;y<=5;y++)
		{
			sum=a+b;
			System.out.println(sum);
			a=b;
			b=sum;
		    
		    
		}

	}

}
