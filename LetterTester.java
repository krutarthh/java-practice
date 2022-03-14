public class LetterTester 
{
	public static void main(String[] args)
	{
		Letter dearJohn = new Letter("Sally","John");

		dearJohn.addLine("I'm sorry but it's just not going to work out.");
		dearJohn.addLine("I'm taking the dog.");
		dearJohn.addLine("I'm keeping the ring.");

		System.out.println(dearJohn.getText());
		System.out.println("\nLetter length " + dearJohn.getNumberOfLines() + " lines");
		System.out.println("\nExpected:\nDear John:\n\nI'm sorry but it's just not going to work out.\nI'm taking the dog.\nI'm keeping the ring.\n\nSincerely,\nSally\n");
		System.out.println("Letter length 3 lines");

		dearJohn.removeLine(2);
		System.out.println(dearJohn.getText());
		System.out.println("\nLetter length " + dearJohn.getNumberOfLines() + " lines");
		System.out.println("\nExpected:\nDear John:\n\nI'm sorry but it's just not going to work out.\nI'm keeping the ring.\n\nSincerely,\nSally\n");
		System.out.println("Letter length 2 lines");

		dearJohn.removeLine(2);
		System.out.println(dearJohn.getText());
		System.out.println("\nLetter length " + dearJohn.getNumberOfLines() + " lines");
		System.out.println("\nExpected:\nDear John:\n\nI'm sorry but it's just not going to work out.\n\nSincerely,\nSally\n");
		System.out.println("Letter length 1 lines");
	}
}
