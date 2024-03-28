package arrays2;

import java.util.Scanner;

public class Arrays2Test07 {

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
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][(i%2==0) ? j:arr[j].length-1-j]=count++; //삼항 연산자로 표현 가능 
				
			}
		}
		
/*
		for (int i = 0; i < arr.length; i++) {// 행

			if (i % 2 == 0) {
				for (int j = 0; j < arr.length; j++) {// 열
					// 역으로 출력할수 있게끔 나오는 패턴
					arr[i][j] = count++;

				}
			} else {
				for (int j = arr.length - 1; j >= 0; j--) {// 열
					// 역으로 출력할수 있게끔 나오는 패턴
					arr[i][j] = count++;

				}

			}
		}//*/
		// 출력문장은 수정하지 마세요
		for (int i = 0; i < arr.length; i++) {// 행

			for (int j = 0; j < arr[i].length; j++) {// 열

				System.out.printf("%2d ", arr[i][j]);
			}

			System.out.println();
		}

	}

}
