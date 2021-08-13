
public class InputMethod {
	public static void printTwoTimes(String text, String delimiter) {
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
	}
	public static void main(String[] args) {
		
		// 100000000
		printTwoTimes("a", "-");
		// 100000000
		printTwoTimes("b", "*");
		// 100000000
		printTwoTimes("c", "&");

	}

}
