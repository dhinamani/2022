package w1.homework;

public class RemoveDuplicatesInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Remove the Duplicates please please do";
		text = text.toLowerCase();
		String result = "";
		String split[] = text.split(" ");
				for(int i=0;i<split.length;i++) {
			for(int j= i+1;j<split.length;j++) {
				if(split[i].equals(split[j])) {
					split[j] = "remove";
				}
			}
		}
		for(String word:split) {
			if(word != "remove") {
				result = result + word +" ";
			}
			}
		
		System.out.println("After Removing duplicates " + result);
	}
}
