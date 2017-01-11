public class Reverse {
	public static void main(String[] args) {
		//String name = "Rakesh Kumar";

		StringBuilder reverseName = new StringBuilder(args[0]).reverse();
		
		System.out.println(reverseName);
	}
}