package Ex04Statement;
/*
 * int Ÿ���� ���� num�� ���� ��, �� �ڸ��� ���� ���� ����� ����ϴ� �ڵ带 �ϼ��϶�.
 */

public class Quiz4_8 {
	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		
		while(num != 0) {
			sum += num%10; //������ ���� ������ ���� �̾Ƴ���
			num /= 10; // ������ ���� ������ ���� �߶󳻱�
		}
		System.out.println("sum = " + sum);
	}

}
