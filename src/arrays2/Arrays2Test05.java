package arrays2;

import java.util.Scanner;

public class Arrays2Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력");
		int n = sc.nextInt();

		int[][] arr = new int[n][n];
		// arr[0]: arr[0][0], arr[0][1], arr[0][2]
		// arr[1]: arr[1][0], arr[1][1], arr[1][2]
		// arr[2]: arr[2][0], arr[2][1], arr[2][2]

		// 행렬구조, 2차원 구조의 메모리 공간에 1 ~9까지 대입

		int count = 1;

		for (int i = arr.length - 1; i >= 0; i--) {// 행
			// 감소를 하면

			for (int j = arr[i].length - 1; j >= 0; j--) {// 열
				arr[i][j] = count++;

			}
		}
		// 출력문장은 수정하지 마세요
		for (int i = 0; i < arr.length; i++) {// 행

			for (int j = 0; j < arr[i].length; j++) {// 열

				System.out.printf("%2d ", arr[i][j]);
			}

			System.out.println();
		}

	}

}
