package Ex04Statement;
/*
 *�� ������
 * if - else ��
 * if ���ǽĿ� ������ ��� ����� ������ �ʿ��� �� ���� if���� ����
 * if(���ǽ�){
 *  ���ǽ��� ���ϰ�� ����Ǵ� ����
 * } else{
 * ���ǽ��� ������ ��� ����Ǵ� ����
 * }
 * 
 * �� �߿� �ϳ��� ������ ����ǰ� �Ǹ� �� �� ������� �ʰų� �� �� ����Ǵ� ���� ����.
 */

import java.util.Scanner;

public class Ex4_03 {
	public static void main(String[] args) {
		System.out.print("���ڸ� �ϳ� �Է��ϼ��� > ");
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt(); // ��ĳ�ʷ� �޾Ƶ��� ��Ʈ�� ���ڸ� ����
		
		if(input == 0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");
		} else {
			System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�.");
		}//if ��
	}//���� ��

}
