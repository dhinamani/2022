package w1.homework;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String gc ="madam";
		String dup="";
		char rev;
		for(int i=0;i<gc.length();i++)
		{
		 rev = gc.charAt(i);
		 dup = rev+dup;
		 
		 
	}
		if(dup.equals(gc))
		 System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
}
}
