package Ex04Statement;
/*
 * do - while 문
 * while문의 변형으로 기본적인 구조는 while문과 같으나 조건식과 블럭의 순서를 바꿔놓은 것
 * 조건에 따라 while문은 한번도 실행되지 않을 수도 있지만 do - while문은 최소 1번의 실행은 보장된다.
 * 
 * do{
 * 	//조건식의 연산결과각 참일 때 수행될 문장
 * } while(조건식);
 */

import java.util.Scanner;

public class Ex4_14 {
	public static void main(String[] args) {
		int input = 0;
		int answer = 0;
		
		answer = (int)(Math.random()*100) + 1; //1~100 사이의 랜덤한 값
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("1~100 사이의 정수를 입력하세요");
			input = scanner.nextInt();
			
			if(input > answer) {
				System.out.println("더 작은 수로 다시 시도해보세요.");
			} else if (input < answer) {
				System.out.println("더 큰 수로 다시 시도해보세요.");
			}
		}while(input != answer);
		
		System.out.println("정답입니다.");
	}

}
