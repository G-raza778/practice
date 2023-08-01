package forPractice1;

public class sentenceBag {
public static void main(String[] args) {
	int count=0;
	String s="A sentence is a combination of words put together to convey an idea, a fact, a question, a thought, a request or a command. Does that mean that you can assemble words in any order? Will it still be a sentence? No! Learn what a sentence is and how they are formed in this article. Furthermore, go through the components of a sentence, the types of sentences, and the given examples to understand how they are structured.";
	for (int i = 0; i < s.length(); i++) {
		char c=s.charAt(i);{
			if(c=='.') {
				count++;
			}
		}
	}
	System.out.println(count);
}
}
