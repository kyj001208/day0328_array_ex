package arrays;

import java.util.Arrays;
import java.util.Random;

public class ArraysTest02 {

	public static void main(String[] args)  {
		// 버블 정렬
		// 중복 제거
		// 랜덤 수치를 배열에 저장

		// 1. int형 배열 공간 5개 필요하다
		// 해당하는 5개의 공간(변수) 랜덤을 이용해서 수를 입력하세요
		// 수의 범위는 (1~45)
		// 배열의 내용을 출력하세요

		Random ran = new Random(); //랜덤

		int[] arr = new int[5]; //배열 공간

		for (int i = 0; i < arr.length; i++) {

			arr[i] = ran.nextInt(45) + 1; //만들어준 랜덤을 배열에 넣어주기
			//arr[i]=ran.nextInt(1, 46); 로 사용가능 

		}
		for (int i = 0; i < arr.length; i++) { //출력을 위해 for문 한번더(없어도 될듯함)
			
			System.out.printf("%02d ", arr[i]);
			

		}

		System.out.println(Arrays.toString(arr)); //배열내용 값을 정리
	}

}
