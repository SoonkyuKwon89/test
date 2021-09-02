package Ex04Statement;

import java.util.Scanner;

/*
 * 중첩 if문
 * if문 안에 if문을 쓰는 것도 가능하다.
 * 중첩갯수에는 제한이 없으며 만약 중첩하게 된다면 들여쓰기를 확실히 해서 헷갈리지 않게 해야 한다.
 */
public class Ex4_05 {
	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';
		char opt = '0';
		
		System.out.print("점수를 입력하세요 > ");
		Scanner scanner = new Scanner(System.in);
		
		score = scanner.nextInt();
		
		if(score >= 90) {
			grade = 'A';
			if (score >= 98) {
				opt = '+';
			} else if (score < 94) {
				opt = '-';
			}
		} else if (score >= 80) {
			grade = 'B';
			if (score >= 88) {
				opt = '+';
			} else if (score < 84) {
				opt = '-';
			}
		}else if (score >= 70) {
			grade = 'C';
			if (score >= 78) {
				opt = '+';
			} else if (score < 74) {
				opt = '-';
			}
		}else if (score >= 60) {
			grade = 'D';
			if (score >= 68) {
				opt = '+';
			} else if (score < 64) {
				opt = '-';
			}
		} else {
			grade = 'F';
		}
		
		System.out.println("당신의 학점은 "+grade + opt + "입니다.");
	}//메인 끝
}
