package Ex03Operstor;
/*
 * �Ʒ��� �ڵ�� ����� ��µ� �ʿ��� �ٱ����� ������ ���ϴ� �ڵ��̴�.���� ����� ���� 123���̰� ����� 10���� ���� �� �ִٸ�
 * 13���� �ٱ��ϰ� �ʿ��� ���̴�. �ڵ带 �ϼ��ض�
 */
public class Quiz3_3 {
	public static void main(String[] args) {
		int numOfApples = 123; //����� ����
		int sizeOfBucket = 10; // �ٱ��� �뷮
		int numOfBucket =(numOfApples % sizeOfBucket == 0) ? (numOfApples / sizeOfBucket) : ((numOfApples / sizeOfBucket) + 1);//��� ����� ��µ� �ʿ��� �ٱ��� ����
				
		System.out.println("�ʿ��� �ٱ����� ���� : " + numOfBucket);
	}

}
