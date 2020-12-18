package programming_Basic;

public class PalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//MADAM
		 String wrd="madam";
		 String temp= "";
		 int i=0;
		 for(i=wrd.length()-1;i>=0;i--)
		 {
			temp= temp + wrd.charAt(i); 
		 }
		 System.out.println(temp);
		 
		 if(wrd==temp)
		 {
			 System.out.println("it is pallindrome");
		 }

	}

}
