package Ex05Array;
/*
 * �迭�� Ȱ��
 * (1)���հ� ���
 */
public class Ex5_02 {
	public static void main(String[] args) {
		int sum = 0;
		float average = 0f;
		
		int[] score = {100, 88, 100, 100, 90};
		
		for (int i = 0; i < score.length; i ++) {
			sum += score[i];	//�迭�� �� ���� ����
		}
		
		average = sum / (float)score.length; //������� floatŸ������ �ٲٱ� ���� ����ȯ
		System.out.println("���� = " + sum);
		System.out.println("��� = " + average);
	}

}
