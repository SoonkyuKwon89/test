package Ex05Array;
//�迭�� Ȱ�� - �ζǹ�ȣ ������

public class Ex5_05 {
	public static void main(String[] args) {
		int[] ball = new int[45]; //45���� �������� �����ϱ� ���� �迭 ����
		
		//�迭�� �� ��ҿ� 1~45�� ���� �����Ѵ�.
		for (int i = 0 ; i < ball.length ; i++)
			ball[i] = i+1; //ball[0]���� 1�� �����
		
		int tmp = 0; //�� ���� �ٲٱ� ���� ����� �ӽú���
		int j = 0; // ������ ���� �� ������ ����
		
		for (int i = 0; i < 6; i++) {
			j = (int)(Math.random()*45); //0~44������ ������ ���� ��´�.
			tmp = ball[i]; //i��° ���� j��° ���� ���� �ٲ۴�.
			ball[i] = ball[j];
			ball[j] = tmp;
		}
		
		//�迭 ball�� �տ��� 6���� ��Ҹ� ����Ѵ�.
		for (int i = 0; i < 6 ; i ++) {
			System.out.println("ball["+i+"] = " + ball[i]);
		}
	}

}
