package Ex05Array;
//2���� �迭 arr�� ��� ��� ���� ���հ� ����� ���ϴ� ���α׷��� �ϼ��ϼ���
public class Quiz5_02 {
	public static void main(String[] args) {
		
		int[][] arr = {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
		};
		
		int total = 0;
		float avg = 0;
		//�ڵ� ����
		int tmp = 0;
		for(int i = 0; i < arr.length; i++) {
			tmp += arr[i].length;
			for (int j = 0 ; j < arr[i].length; j++){
 				total += arr[i][j];
			}
		}
		avg = total / (float)tmp;
		System.out.println("total = " + total);
		System.out.println("average = " + avg);
				
		//�ڵ� ��
		
		
	}

}
