package codingTest;

public class 조건문자열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ineq = "<";
		String eq = "=";
		int n = 20;
		int m = 50;
		int answer = 0;
		
		if (ineq.equals(">") && eq.equals("=")) {
			if (n >= m) {
				answer = 1;
			} else {
				answer = 0;
			}
		} else if (ineq.equals(">") && eq.equals("!")) {
			if (n > m) {
				answer = 1;
			} else {
				answer = 0;
			}
		} else if (ineq.equals("<") && eq.equals("=")) {
			if (n <= m) {
				answer = 1;
			} else {
				answer = 0;
			}
		} else if (ineq.equals("<") && eq.equals("!")) {
			if (n < m) {
				answer = 1;
			} else {
				answer = 0;
			}
		}
		
		System.out.println(answer);
	}

}
