package programming_Basic;

public class OccurenceOfLetter {

	public static void main(String[] args) {
	

		String word = "madam";
		int count = 0;
		char letter = 'a';
		 
		for(int i=0; i<word.length();i++)
		{
			if(word.charAt(i)==letter);
			{
			count++;
			System.out.println(word.charAt(i));
			}
			
		}
         System.out.println(count);
	}

}
