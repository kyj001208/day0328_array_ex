package arrays;

public class ArraysTest06 {

	public static void main(String[] args) {
		
		
		int result=plus(10, 20); //매개 변수로 전달되는 데이터=인자
		//해당 데이터가 num1이 num2로 각각 대입
		System.out.println(result);

	}
	//매개변수(parameter)
	private static int plus(int num1, int num2) {
		
		return num1+num2;
		
	}

}
