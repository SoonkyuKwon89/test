package Ex03Operstor;

import java.util.Scanner;

public class Ex3_11 {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);//��ĳ�� ��ü ����
		char ch = ' ';
		
		System.out.println("���ڸ� �ϳ� �Է��ϼ��� > ");
		
		String input = scanner.nextLine();
		ch = input.charAt(0);
		
		if('0' <= ch && ch <= '9') { // ������ ���ڿ��� ������ �ֱ� ������ ���� 0���� ũ�� 9���� ������
			System.out.println("�Է��Ͻ� ���ڴ� �����Դϴ�.");//���� ���
		}
		
		if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
			System.out.println("�Է��Ͻ� ���ڴ� ���ĺ��Դϴ�.");
		}
		
	}

}
