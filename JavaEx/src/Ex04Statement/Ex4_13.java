package Ex04Statement;

import java.util.Scanner;

//�� �ڸ� ������ ���� ���ϴ� ����
public class Ex4_13 {
	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); // �Է¹��� ���ڸ� ���ڿ��� �޾Ƶ���
		num = Integer.parseInt(tmp); //�Է¹��� ���ڿ��� ���ڷ� ��ȯ�ؼ� num�� ����
		
		while(num != 0) { // num�� 0�� �ƴѵ���
			sum += num%10; // sum�� num���� 10���� ���� ���������� �ִ´�.
			System.out.println("sum = " + sum + " num = " + num);
			num /= 10; //num���� 10���� ���� ���ڸ� �ٽ� num�� ����
		}
		
		System.out.println("�� �ڸ� ������ �� : " +sum);
	}

}
