public class Reverse {
	public static void main(String[] args) {
		String name = "Rakesh Kumar";

		StringBuilder reverseName = new StringBuilder(name).reverse();
		
		System.out.println(reverseName);
	}
}