package Ex04Statement;
/*
 * while 문
 * 	while(조건식){
 * 	//조건의 연산자가 참인 동안 반복될 문장들
 * }
 * 조건식이 거짓이 될때까지 무한정 반복된다.
 */

public class Ex4_11 {
	public static void main(String[] args) {
		int i = 5;
		
		while(i -- !=0) {
			System.out.println(i + " - I can do it.");
		}
	}//main

}
