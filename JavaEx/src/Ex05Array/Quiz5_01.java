package Ex05Array;
//�迭 arr�� ��� ��� ���� ���ϴ� ���α׷��� �ۼ��ϼ���
public class Quiz5_01 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
		//�ڵ� �ֱ�
		for(int i = 0 ; i < arr.length; i++) {
			sum+= arr[i];
		}
		//�ڵ� �ֱ�(��)
		
		System.out.println("sum = " + sum);
	}

}
