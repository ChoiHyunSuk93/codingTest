package codingTest;

public class 등차수열의특정한항만더하기 {
	public static void main(String[] args) {
		int a = 3;
		int d = 4;
		boolean[] included = {true, false, false, true, true};
		int[] b = new int[included.length];
		int answer = 0;
		for (int i = 0; i < included.length; i++) {
			b[i] = a;
			if (included[i] == true) {
				answer = answer + b[i];
			}
			a = a + d;
		}
		System.out.println(answer);
	}
}
