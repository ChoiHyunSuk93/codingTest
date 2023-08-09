package codingTest;

public class 이어붙인수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num_list = {3, 4, 5, 2, 1};
		int answer = 0;
		String a = "";
		String b = "";
		for (int i = 0; i < num_list.length; i++) {
			if (num_list[i] % 2 != 0) {
				a = a + num_list[i];
			} else {
				b = b + num_list[i];
			}
		}
		answer = Integer.parseInt(a) + Integer.parseInt(b);
		System.out.println(answer);
	}

}
