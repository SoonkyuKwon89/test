package Ex05Array;
/*
 * 2���� �迭�� ����
 * 2���� �迭�� �����ϴ� ���� ������ ����.
 * Ÿ��[][] �����̸� or Ÿ�� �����̸�[][] or Ÿ��[] �����̸�[]
 * ex) int[][] score = new int[4][3]; // 4�� 3���� �����͸� ������� �迭 ����
 * 			   score[0][0] = 100;
 * 	   System.out.println(score[0][0]);
 * 
 * 2���� �迭�� �ʱ�ȭ
 * 2���� �迭�� ��ȣ{}�� ����ؼ� ������ �ʱ�ȭ�� ���ÿ� �� �� �ִ�.�ٸ�, 1���� �迭���� ��ȣ�� �ѹ� �� �Ἥ
 * �ະ�� �������ش�.
 * int arr[][] = {{1,2,3},{4,5,6}};
 * ũ�Ⱑ ū �迭�� ��� ���ٷ� ��α⺸�ٴ� �ະ�� �� �ٲ��� ���ִ°� �˾ƺ��⵵ ���� �����ϱ� ����.
 * in[][] arr = {
 * 					{1,2,3},
 * 					{4,5,6}
 * 				};
 */

public class Ex5_08 {
	public static void main(String[] args) {
		int[][] score = {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40}
		};
		int sum = 0;
		
		for (int i = 0 ; i < score.length ; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.println("score["+i+"]["+j+"] = "+score[i][j]);
				
				sum += score[i][j];
			}
		}
		
		System.out.println("sum = " + sum);
	
		}
	}
	


