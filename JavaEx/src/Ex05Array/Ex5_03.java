package Ex05Array;
//�迭�� Ȱ��
//(2) �ִ밪�� �ּҰ�
public class Ex5_03 {
	public static void main(String[] args) {
		int[] score = {79, 88 , 91 , 33 , 100, 55 , 95};
		
		int max = score[0]; //  �迭�� �ִ밪�� �迭�� ù��°������ �ʱ�ȭ
		int min = score[0]; //  �迭�� �ּҰ��� �迭�� ù��°������ �ʱ�ȭ
		
		for (int i = 1; i < score.length ; i ++) {
			if(score[i] > max) { // ���� �迭�� i��° ���ڰ� �ִ밪���� ũ�ٸ�
				max = score[i]; // max�� �迭�� i��° ���� ����
			} else if (score[i] < min) { // ���� �迭�� i��° ���ڰ� �ּҰ����� �۴ٸ�
				min = score[i]; //min�� �迭�� i��° ���� ����
			}
		} // for end
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
		
	}

}
