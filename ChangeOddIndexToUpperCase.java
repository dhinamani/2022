package w1.homework;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "random";
		char[] a =test.toCharArray();
		int sl = test.length();
		System.out.println(sl);
		for(int i=0;i<sl;i++)
		{
			if(i%2 != 0)
				a[i]= Character.toUpperCase(a[i]);
			

	}
		System.out.println(a);
}}
