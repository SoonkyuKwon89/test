package Ex04Statement;

import java.util.Scanner;

/*
 * switch 문
 * 한번의 조건식으로 많은 경우의 수를 처리할 때 사용하는 조건문
 * switch문의 조건식 결과값은 반드시 정수나 문자열이여야 하며 , case값 또한 정수나 문자열이여야 하기때문에
 * 어쩔 수 없이 if문으로 사용할 때도 있지만 조건이 맞는다면 더 간결하고 알아보기 쉽다.
 * 
 * switch (조건식){
 * 		case 값1 : //세미콜론 아님
 * 		조건식의 결과값이 값1 일때 실행될 문장들
 * 		break; // 브레이크가 없으면 다음 브레이크를 만나거나 문장의 끝까지 실행한다.
 * 		...
 * 
 * 		dafault :
 * 		조건식의 결과와 일치하는 문장이 없을경우 실행되는 문장들
 * }
 */
public class Ex4_06 {
	public static void main(String[] args) {
		System.out.print("현재 월을 입력하세요 > ");
		
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		switch(month) {
		
		case 3 : case 4 : case 5 :
			System.out.println("현재의 계절은 봄입니다.");
			break;
		case 6 : case 7 : case 8 :
			System.out.println("현재의 계절은 여름입니다.");
			break;
		case 9 : case 10 : case 11 :
			System.out.println("현재의 계절은 가을입니다.");
			break;
		case 12 : case 1 : case 2 :
			System.out.println("현재의 계절은 겨울입니다.");
			break;
		
		}
	}

}
