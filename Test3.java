package codingTest;

public class Test3 {
	public static void main(String[] args) {
		String str1 = "aaaaacc";
		String str2 = "bbbbbdd";
		
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i < str1.length(); i++) {
			result.append(str1.charAt(i));
			result.append(str2.charAt(i));
		}
		
		String answer = result.toString();
		System.out.println(answer);
	}
}
