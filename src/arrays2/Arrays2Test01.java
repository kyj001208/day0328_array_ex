package arrays2;

import java.util.Arrays;

public class Arrays2Test01 {

	public static void main(String[] args) {

		// int형 2차원 배열 변수 선언
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };

		//System.out.println(arr.length);

		for(int i=0; i<arr.length;i++) {//1차원 배열 길이(2개) :행
			for(int j=0; j<arr[i].length;j++) {//arr[0],arr[1]에 들어있는 1차원 배열의 값 확인: 열
				
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
			
		}
		
	}

}
