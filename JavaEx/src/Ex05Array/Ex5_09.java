package Ex05Array;
//2���� �迭 �ʱ�ȭ ����

public class Ex5_09 {
	public static void main(String[] args) {
		int[][] score = {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50}
		};
		//���� ����
		int korTotal = 0 , engTotal = 0, mathTotal = 0;
		
		System.out.println("��ȣ	����	����	����	����	��� ");
		System.out.println("===========================");
		
		for(int i = 0; i < score.length ; i++) {
			int sum = 0; //sum�� �ʱ�ȭ ---- 1
			float avg = 0.0f; // avg�� �ʱ�ȭ ---2
			
			korTotal += score[i][0]; //�������� �� �� ����(�ʱ�ȭ X) --- 3
			engTotal += score[i][1]; //�������� �� �� ����(�ʱ�ȭ X)
			mathTotal += score[i][2];//�������� �� �� ����(�ʱ�ȭ X)
			System.out.printf("%3d", i+1); //���� ���
			
			for (int j = 0 ; j < score[i].length ; j++){//sum�� ��ü ���� �հ� ����
				sum += score[i][j]; //i��° ������ �� �� ���� ---4
				System.out.printf("%5d" , score[i][j]); //5ĭ�� ���� sum ���
			}
			
			avg = sum/(float)score[i].length; // avg�� ���� ---5
			System.out.printf("%5d %5.1f%n" , sum , avg); // ����Ʈ(�ٽ� 1������)
			
		}
		System.out.println("===========================");
		System.out.printf("���� : %3d , %4d , %4d%n" , korTotal,engTotal,mathTotal);
		
	}

}
