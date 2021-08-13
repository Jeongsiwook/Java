
public class OutputMethod {
	
	public static String a() {
		// ...
		return "a";
	}
	
	public static int one() {
		return 1;
	}
	
	public static String twoTimes(String text, String delimiter) {
		String out = "";
		out = out + delimiter + "\n";
		out = out + text + "\n";
		out = out + text + "\n";
		return out;
	}
	
	public static void main(String[] args) {
		
		System.out.println(a());
		System.out.println(one());
		System.out.println(twoTimes("a", "-"));
		
	}

}
