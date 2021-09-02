package Ex04Statement;
/*
 *깃 연습중
 * if - else 문
 * if 조건식에 거짓일 경우 실행될 문장이 필요할 때 쓰는 if문의 변형
 * if(조건식){
 *  조건식이 참일경우 실행되는 문장
 * } else{
 * 조건식이 거짓일 경우 실행되는 문장
 * }
 * 
 * 둘 중에 하나는 무조건 실행되게 되며 둘 다 실행되지 않거나 둘 다 실행되는 경우는 없다.
 */

import java.util.Scanner;

public class Ex4_03 {
	public static void main(String[] args) {
		System.out.print("숫자를 하나 입력하세요 > ");
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt(); // 스캐너로 받아들인 인트형 숫자를 저장
		
		if(input == 0) {
			System.out.println("입력하신 숫자는 0입니다.");
		} else {
			System.out.println("입력하신 숫자는 0이 아닙니다.");
		}//if 끝
	}//메인 끝

}
