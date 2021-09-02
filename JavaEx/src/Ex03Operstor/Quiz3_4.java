package Ex03Operstor;
/*
 * 변수 num의 값에 따라 양수 , 음수 , 0을 출력하는 코드
 */
public class Quiz3_4 {
	public static void main(String[] args) {
		
		int num = 10;
		System.out.println((num > 0) ? "양수" : ((num < 0) ? "음수" : "0"));
	}

}
