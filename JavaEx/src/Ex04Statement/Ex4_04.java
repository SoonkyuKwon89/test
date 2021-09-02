package Ex04Statement;
/*
 * if - else if ��
 * ó���ؾ� �� ����� ���� 3�� �̻��� �� ����ϴ� if���� ����
 * 
 * if(���ǽ� 1){
 * ���ǽ� 1�� ���ϰ�� ����� ����
 * } else if(���ǽ� 2){
 * ���ǽ� 2�� ���ϰ�� ����� ����
 * } ...
 * } else{
 * ���ǽ��� ���� ������ ��� ����� ����
 * }
 * 
 * ù��° ���ǽĺ��� ���ؼ� ���� ��� �ش� ���� �����ϰ� if�� ��ü�� ����������.
 * �������� else�� ���� �����ϴ�. ���� �����ߴٸ� , if�� ���� ������� ���� ���� �ִ�.(������ ���� ���� ���)
 */

import java.util.Scanner;

public class Ex4_04 {
	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';
		
		System.out.print("������ �Է��ϼ��� > ");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		if(score >= 90) {
			grade = 'A';
		} else if(score >= 80) { //���� ���ǽ��� 80<= score && score <= 90�� ������ �̷��� �� ��
			grade = 'B';		 //�ִ� ������ ���� ���ǽ��� �����̱� �����̴�.
		} else if(score >= 70) {
			grade = 'C';
		} else if(score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.println("����� ������ " + score +" �� �̰� ����� ������ " + grade + "�Դϴ�." );
	}

}
