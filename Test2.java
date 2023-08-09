package codingTest;

public class Test2 {
	public static void main(String[] args) {
		String my_String = "He11oWor1d";
		String overwrite_string = "lloWorl";
		int s = 2;

		char[] chars = my_String.toCharArray();
		char[] chars2 = overwrite_string.toCharArray();
		for (int i = 0; i < chars2.length; i++) {
			chars[i + s] = chars2[i];
		}
		String answer = new String(chars);
		System.out.println(answer);
	}
}
