package Ex04Statement;
/*
 * ��ø for��
 * for�� �ȿ� �ٸ� for���� ��ø��Ű�� ���� �����ϴ�.
 * ����Ƚ���� ���� ������ ����.
 */
public class Ex4_10 { // ������
	public static void main(String[] args) {
		
		for(int i = 1 ; i <= 5 ; i++) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 5 ; i >= 1; i--) {
			for (int j = i ; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}

}
