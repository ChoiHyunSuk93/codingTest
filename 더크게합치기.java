package codingTest;

public class 더크게합치기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12;
		int b = 3;
		int a1 = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
		int a2 = Integer.parseInt(String.valueOf(b) + String.valueOf(a));
		int answer = 0;
		if (a1 >= a2) {
			answer = a1;
		} else {
			answer = a2;
		}
		System.out.println(answer);
	}

}
