package Ex04Statement;
/*
 * do - while ��
 * while���� �������� �⺻���� ������ while���� ������ ���ǽİ� ���� ������ �ٲ���� ��
 * ���ǿ� ���� while���� �ѹ��� ������� ���� ���� ������ do - while���� �ּ� 1���� ������ ����ȴ�.
 * 
 * do{
 * 	//���ǽ��� �������� ���� �� ����� ����
 * } while(���ǽ�);
 */

import java.util.Scanner;

public class Ex4_14 {
	public static void main(String[] args) {
		int input = 0;
		int answer = 0;
		
		answer = (int)(Math.random()*100) + 1; //1~100 ������ ������ ��
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("1~100 ������ ������ �Է��ϼ���");
			input = scanner.nextInt();
			
			if(input > answer) {
				System.out.println("�� ���� ���� �ٽ� �õ��غ�����.");
			} else if (input < answer) {
				System.out.println("�� ū ���� �ٽ� �õ��غ�����.");
			}
		}while(input != answer);
		
		System.out.println("�����Դϴ�.");
	}

}
