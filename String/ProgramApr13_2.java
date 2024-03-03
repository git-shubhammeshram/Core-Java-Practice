package String;

public class ProgramApr13_2 {

	public static void main(String[] args) {

		String Sentence = "India is devloping country";
		System.out.println(Sentence.length());
		System.out.println(Sentence.indexOf('i'));
		System.out.println(Sentence.lastIndexOf('i'));
		System.out.println(Sentence.indexOf('y'));
		System.out.println(Sentence.startsWith("is"));
		System.out.println(Sentence.startsWith("India"));
		System.out.println(Sentence.endsWith("y"));
		System.out.println(Sentence.lastIndexOf('i', '4'));
		
	}

}
