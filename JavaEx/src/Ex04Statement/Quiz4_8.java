package Ex04Statement;
/*
 * int 타입의 변수 num이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라.
 */

public class Quiz4_8 {
	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		
		while(num != 0) {
			sum += num%10; //정수의 가장 마지막 숫자 뽑아내기
			num /= 10; // 정수의 가장 마지막 숫자 잘라내기
		}
		System.out.println("sum = " + sum);
	}

}
