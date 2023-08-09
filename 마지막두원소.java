package codingTest;

import java.util.Arrays;

public class 마지막두원소 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num_list = {2, 1, 6};
		int[] answer = new int[num_list.length + 1];
		
		int last = num_list[num_list.length - 1];
		int secondLast = num_list[num_list.length - 2];
		int result = 0;
		
		if (last > secondLast) {
			result = last - secondLast;
		} else {
			result = 2 * last;
		}
		
		for (int i = 0; i < num_list.length; i++) {
			answer[i] = num_list[i];
		}
		answer[answer.length - 1] = result;
		
		System.out.println(Arrays.toString(answer));
	}

}
