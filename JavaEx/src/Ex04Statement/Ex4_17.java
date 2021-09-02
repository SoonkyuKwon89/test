package Ex04Statement;

import java.util.Scanner;

//break문과 continue문의 예제
public class Ex4_17 {
	public static void main(String[] args) {
		int menu = 0;
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("원하는 메뉴(1~3)를 선택하세요 (종료:0)> ");
			
			String tmp = scanner.nextLine();
			menu = Integer.parseInt(tmp);
			
			if(menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if(!(1<= menu && menu <= 3)) {
				System.out.println("숫자를 잘못 입력하셨습니다.(종료는 0번)");
				continue;
			}
			
			System.out.println("선택하신 메뉴는" + menu + "번입니다.");
		}
	}

}
