package codingTest;

import java.util.Arrays;
import java.util.HashSet;

public class 아이오트리코테 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 구구단 만들기
		// 구구단 n 단 출력하기
		System.out.println("1번 문제");
		
		test1(5);
		
		System.out.println("---------");
		
		// 2. 숫자 자릿수 더하기
		System.out.println("2번 문제");
		
		if(test2(930926) == 29) {
			System.out.println("OK");
		} else {
			System.out.println("NO");
		}
		
		System.out.println("---------");
		// 3. 배열 오름차순 출력
		// 배열에서 숫자 2개를 뽑아서 더한 합을 새로운 배열로 만들어서 오름차순으로 숫자만 출력, 중복값X
		// ex) int[] n = {3, 6, 4, 9, 10, 2};
		// 결과 : 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 19
		
		System.out.println("3번 문제");
		
		int[] n = {3, 6, 4, 9, 10, 2};
		test3(n);
		
		System.out.println("---------");
		
		// 4. 이등변삼각형 만들기
		// 높이에 따라서 이등변 삼각형 출력
		// ex) h = 5이면,
//		    *
//		   ***
//		  *****
//		 *******
//		*********
		
		System.out.println("4번 문제");
		test4(5);
		
	}
	
	public static void test1(int n) {
		for (int i = 1; i <= 9; i++) {
			System.out.println(n + " x " + i + " = " + (n*i));
		}
	}
	
	public static int test2(int n) {
		String num = String.valueOf(n);
		String[] num2 = num.split("");
		int answer = 0;
		for (int i = 0; i < num2.length; i++) {
			answer = answer + Integer.parseInt(num2[i]);
		}
		return answer;
	}
	
	public static void test3(int[] n) {
		HashSet<Integer> num = new HashSet<>();
		for (int i = 0; i < n.length - 1; i++) {
			for (int j = i + 1; j < n.length; j++) {
				num.add(n[i] + n[j]);
			}
		}
		Object[] result = num.toArray();
		Arrays.sort(result);
		
		String answer = Arrays.toString(result);
		
		answer = answer.replaceAll("\\[", "").replaceAll("]", "");
		System.out.println(answer);
		
	}
	
	public static void test4(int h) {
		
		for (int i = 1; i <= h; i++) {
			
			// 공백 넣기
			for (int j = 1; j <= h - i; j++) {
				System.out.print(" ");
			}
			
			// * 찍기
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			
			System.out.println(); // 줄바꿈
		}
	}

}
