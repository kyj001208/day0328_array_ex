package arrays2;

public class Arrays2Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = new int[3][3];
		// arr[0]: arr[0][0], arr[0][1], arr[0][2]
		// arr[1]: arr[1][0], arr[1][1], arr[1][2]
		// arr[2]: arr[2][0], arr[2][1], arr[2][2]

		// 행렬구조, 2차원 구조의 메모리 공간에 1 ~9까지 대입

		
		for (int i = 0, n = 1; i < arr.length; i++) {// 행

			for (int j = 0; j < arr[i].length; j++, n++) {// 열
				arr[i][j]=n;
			}

		}
		for (int i = 0; i < arr.length; i++) {// 행

			for (int j = 0; j < arr[i].length; j++) {// 열

				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
