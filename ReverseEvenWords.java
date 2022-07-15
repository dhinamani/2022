package w1.homework;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "random as adf word ";
		String[] split = test.split(" ");
			for(int i=0;i<split.length;i++)
		{
		 if(i%2 !=0)
		 {
			 System.out.println(split[i]);
	}
		 else 
		 {
			 int evenword = split[i].length();
			 char[] str = split[i].toCharArray();
			 for(int j=evenword-1;j>=0;j--)
		 
		 {
			
					System.out.print(str[j]);
		 }
		
	}
		}}}

