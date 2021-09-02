package Ex04Statement;
/*
 * if - else if 문
 * 처리해야 할 경우의 수가 3개 이상일 때 사용하는 if문의 변형
 * 
 * if(조건식 1){
 * 조건식 1일 참일경우 실행될 문장
 * } else if(조건식 2){
 * 조건식 2가 참일경우 실행될 문장
 * } ...
 * } else{
 * 조건식이 전부 거짓일 경우 실행될 문장
 * }
 * 
 * 첫번째 조건식부터 비교해서 참일 경우 해당 블럭을 수행하고 if문 전체를 빠져나간다.
 * 마지막의 else는 생략 가능하다. 만약 생략했다면 , if문 전부 실행되지 않을 수도 있다.(조건이 맞지 않을 경우)
 */

import java.util.Scanner;

public class Ex4_04 {
	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';
		
		System.out.print("점수를 입력하세요 > ");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		if(score >= 90) {
			grade = 'A';
		} else if(score >= 80) { //원래 조건식은 80<= score && score <= 90이 맞지만 이렇게 쓸 수
			grade = 'B';		 //있는 이유는 위의 조건식이 거짓이기 때문이다.
		} else if(score >= 70) {
			grade = 'C';
		} else if(score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.println("당신의 점수는 " + score +" 점 이고 당신의 학점은 " + grade + "입니다." );
	}

}
