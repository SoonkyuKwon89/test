package Ex03Operstor;

public class Ex3_07 {
	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 2_000_000;
		
		long c = a * b;
		
		System.out.println(c); //- 1454759936
		
		/*
		 * long ������ �������� ���ڰ� �����Ѱ�ó�� ������ ���� ����
		 * a * b�� int���̱� ������ �� ���� �� ���� int���·� ����ǹǷ� ������ ����� �ȴ�.
		 * �׷��⿡ �̹� ������ ��� ���� ������ ���̹Ƿ� ������ ���� ������ �ʰ� �� ���̴�.
		 */
		
		long d = 1_000_000 * 1_000_000;	//�����÷ο� �߻�
		long e = 1_000_000 * 1_000_000L; // longŸ������ ��ȯ�Ǿ� ���ǹǷ� �� ���� ���´�.
		
		System.out.println("d = " + d);
		System.out.println("e = " + e);
	}
	
}
