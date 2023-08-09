package codingTest;

public class 코드처리하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String code = "abc1abc1abc";
		int mode = 0;
		String ret = "";

		for (int i = 0; i < code.length(); i++) {
			if (mode == 0) {
				if (code.charAt(i) == '1') {
					mode = 1;
				} else {
					if (i % 2 == 0) {
						ret += code.charAt(i);
					}
				}
			} else {
				if (code.charAt(i) == '1') {
					mode = 0;
				} else {
					if (i % 2 != 0) {
						ret += code.charAt(i);
					}
				}
			}
		}
		String answer = "";
		if (ret.equals("")) {
			answer = "EMPTY";
		} else {
			answer = ret;
		}
		System.out.println(answer);
	}

}
