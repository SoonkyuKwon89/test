package Ex03Operstor;

import java.util.Scanner;

public class Ex3_11 {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);//스캐너 객체 생성
		char ch = ' ';
		
		System.out.println("문자를 하나 입력하세요 > ");
		
		String input = scanner.nextLine();
		ch = input.charAt(0);
		
		if('0' <= ch && ch <= '9') { // 숫자의 문자열이 연속해 있기 때문에 가능 0보다 크고 9보다 작을때
			System.out.println("입력하신 문자는 숫자입니다.");//문자 출력
		}
		
		if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
			System.out.println("입력하신 문자는 알파벳입니다.");
		}
		
	}

}
