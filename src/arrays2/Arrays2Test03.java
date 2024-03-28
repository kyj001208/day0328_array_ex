package arrays2;

import java.util.Scanner;

public class Arrays2Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자 입력");
		int n=sc.nextInt();

		int[][] arr = new int[n][n];
		// arr[0]: arr[0][0], arr[0][1], arr[0][2]
		// arr[1]: arr[1][0], arr[1][1], arr[1][2]
		// arr[2]: arr[2][0], arr[2][1], arr[2][2]

		// 행렬구조, 2차원 구조의 메모리 공간에 1 ~9까지 대입

		int count=1;
		for (int i = 0; i < arr.length; i++) {//

			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=count++;
				
				System.out.printf("%2d ", arr[i][j] );
			}

			System.out.println();
		}
		
				
			
	
		}

	

}
