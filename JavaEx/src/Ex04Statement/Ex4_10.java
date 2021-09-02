package Ex04Statement;
/*
 * 중첩 for문
 * for문 안에 다른 for문을 중첩시키는 것이 가능하다.
 * 중접횟수는 거의 제한이 없다.
 */
public class Ex4_10 { // 별찍어보기
	public static void main(String[] args) {
		
		for(int i = 1 ; i <= 5 ; i++) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 5 ; i >= 1; i--) {
			for (int j = i ; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}

}
