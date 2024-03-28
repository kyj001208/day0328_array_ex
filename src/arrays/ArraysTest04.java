package arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysTest04 {

	public static void main(String[] args) throws InterruptedException {
		// 1000원을 입력 시 1줄
		// 2000원을 입력 시 2줄 +++

		Random ran = new Random(); // 랜덤
		Scanner sc = new Scanner(System.in); // 키보드 입력
		System.out.println("얼마?");
		int num = sc.nextInt(); // 입력값

		int[] arr = new int[5]; // 배열 공간

		for (int d = 0; d < num / 1000; d++) {// 입력한 금액에 맞게 출력되는 시작구간
			Thread.sleep(50); //실행하는 시간을 빠르게 해주는 요소

			for (int i = 0; i < arr.length; i++) {

				int temp = ran.nextInt(45) + 1;
				// 이번호가 이미 만들어진 번호들 중에 존재하면 새로운 번호를 만들어

				boolean flag = false; // true false를 활용한 문장

				for (int j = 0; j < i; j++) {

					if (temp == arr[j]) {// 중복 발생구간을 없애는 구간

						flag = true;
						break;

					}
				} // j를 탈출

				if (flag) {
					i--;
					continue; //

				}
				// 중복이 없는 경우 넣어줘
				arr[i] = temp;
				
			} // lotto 배열의 데이터를 오름차순으로 정렬하세요
				// Arrays.sort(arr); ->이게 제일 빠른 방법, 한줄이면 됌
			for (int c = 0; c < arr.length - 1; c++) {
				for (int i = 0; i < arr.length - 1; i++) { // for문을 사용하여 오름차순 정렬

					if (arr[i] > arr[i + 1]) {

						int temp = arr[i];
						arr[i] = arr[i + 1];
						arr[i + 1] = temp;

					}
				}

			}

			System.out.print("자동 ");
			for (int i = 0; i < arr.length; i++) { // 출력을 위해 for문 한번더(없어도 될듯함)

				System.out.printf("%02d ", arr[i]);

			}
			System.out.println();

		} // 입력한 금액에 맞게 끝나는 구간

	}

}
