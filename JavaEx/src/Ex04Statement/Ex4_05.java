package Ex04Statement;

import java.util.Scanner;

/*
 * ��ø if��
 * if�� �ȿ� if���� ���� �͵� �����ϴ�.
 * ��ø�������� ������ ������ ���� ��ø�ϰ� �ȴٸ� �鿩���⸦ Ȯ���� �ؼ� �򰥸��� �ʰ� �ؾ� �Ѵ�.
 */
public class Ex4_05 {
	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';
		char opt = '0';
		
		System.out.print("������ �Է��ϼ��� > ");
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
		
		System.out.println("����� ������ "+grade + opt + "�Դϴ�.");
	}//���� ��
}
