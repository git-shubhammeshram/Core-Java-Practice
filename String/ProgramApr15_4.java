package String;

public class ProgramApr15_4 {
	public static void main(String[] args) {
		String Sentence = "I am softwere engineer";
		String splitSentence[] = Sentence.split(" ");
		System.out.println("Original = "+ Sentence);
		System.out.println("After Split = "+ Sentence);
		for(int i=0;i<splitSentence.length;i++)
		{
			System.out.println(splitSentence[i]);
		}
		
	}

}
