package Ex04Statement;
/*
 * ������ ���� ������ Math.random()
 * ������ ��� ���� ����ϴ� �޼���
 * 0�� 1 ������ �������� �������ִ� �޼����̴�.
 * ���� 1 �̻��� �������� ���ϰ��� �Ѵٸ� ���� �� ��ŭ ������ �� +1���ָ� �ȴ�.
 */
public class Ex4_07 {
	public static void main(String[] args) {
		int num = 0;
		
		for(int i = 0 ; i < 5 ; i ++) {
			num = (int)(Math.random()*6) + 1; // 1~6������ ������ ���� ������
			System.out.println(num);
		}
	}

}
