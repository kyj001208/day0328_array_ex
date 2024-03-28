package arrays;

import java.util.Arrays;

public class ArraysTest01 {

	public static void main(String[] args) {
		// 배열
		
		// 동일한 데이터타입의 집합구조
		// 메모리에 연속적(순차적)으로 나열되는 특징
		// 배열을 생성하면 자동으로 변수이름을 만들어줘요
		// 배열변수이름[인덱스번호] : 0번부터 시작 
		// 배열 길이: arr.length == 3
		// 마지막 인덱스 번호 : arr.length-1로 통해 알수 있다
		// 배열 == heap메모리에 할당되며 default 초기화 (int형은 0으로 초기화, String형은 null로 초기화)
		
		
		int [] arr=new int[3];
		System.out.println(arr[0]); //이름은 자동으로 생성 [0]부터, 또한 값은 defalut 초기화로 0으로 확인됌
		
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=(i+1)*10;
		
			System.out.println("arr["+i+"] ="+ arr[i]);
			
		}
		System.out.println(Arrays.toString(arr));
	}

}
