package Ex04Statement;

import java.util.Scanner;

//각 자리 숫자의 합을 구하는 예제
public class Ex4_13 {
	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); // 입력받은 숫자를 문자열로 받아들임
		num = Integer.parseInt(tmp); //입력받은 문자열을 숫자로 전환해서 num에 저장
		
		while(num != 0) { // num이 0이 아닌동안
			sum += num%10; // sum에 num값을 10으로 나눈 나머지값을 넣는다.
			System.out.println("sum = " + sum + " num = " + num);
			num /= 10; //num값을 10으로 나눈 숫자를 다시 num에 저장
		}
		
		System.out.println("각 자리 숫자의 합 : " +sum);
	}

}
