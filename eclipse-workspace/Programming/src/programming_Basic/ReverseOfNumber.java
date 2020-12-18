package programming_Basic;

public class ReverseOfNumber {

	public static void main(String[] args) {
		
		int num = 6458;
		int temp = 0;
		int reverse=0;
		
		while(num!=0)
		{
		//temp= num%10;
	//	reverse=  temp + (reverse*10);
	//	System.out.println(temp);
	//	System.out.println(reverse);
	//	num=num/10;
	//	}
	//	System.out.println(reverse);
			
			
			
			
			
			num=num/10;
			temp= num%10;
			reverse= (reverse*10)+ temp;
			System.out.println(reverse);
			System.out.println(temp);
			System.out.println(num);
			
		}		
	}

}
