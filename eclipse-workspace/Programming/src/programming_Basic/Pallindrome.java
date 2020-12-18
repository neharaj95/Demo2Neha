package programming_Basic;

public class Pallindrome {

	public static void main(String[] args) {
		
		String word = "madam";
		String temp = "";
		for(int i=word.length()-1;i>=0;i--)
		{
			temp= temp+word.charAt(i);
		}
       System.out.println(temp);  
        
        if(word==temp)
        {
        	System.out.println("It is pallindrome");
        }
        
	}

}
