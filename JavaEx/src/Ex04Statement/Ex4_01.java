package Ex04Statement;
/*
 * if문
 * 가장 기본적인 조건문
 * 
 * if(조건식) {
 * 조건식이 참일 결우 수행할 문장들을 적는다.
 * }
 * 
 * 조건식이 참일경우 괄호안의 문장들을 수행하며, 거짓일 경우 괄호를 지나치고 다음 문장부터 수행한다.
 */
public class Ex4_01 {
	public static void main(String[] args) {
		int score = 80;
		
		if(score > 60) {//조건식이 참이므로 문장이 출력된다.
			System.out.println("합격입니다.");
		}
	}

}
