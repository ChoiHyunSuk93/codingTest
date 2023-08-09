package codingTest;

import java.util.Arrays;

public class 정수를나선형으로배치하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int[][] answer = new int[n][n];
        
		int[][] direction = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // 우, 하, 좌, 상 이동
		
		int x = 0, y = 0;
		int num = 1;
		
		int directionIndex = 0;
		
		for (int i = 0; i < n * n; i++) {
			answer[x][y] = num++;
			int nextX = x + direction[directionIndex][0];
			int nextY = y + direction[directionIndex][1];
			
			if (nextX < 0 || nextX >= n || nextY < 0 || nextY >= n || answer[nextX][nextY] != 0) {
                // 다음 위치가 배열 범위를 벗어나거나 이미 숫자가 할당된 경우, 방향을 변경
                directionIndex = (directionIndex + 1) % 4;
            }

            x += direction[directionIndex][0]; // 다음 위치로 이동
            y += direction[directionIndex][1];
		}
		
		System.out.println(Arrays.deepToString(answer));
	}

}
