package Ex04Statement;
//1~20������ ���� �߿��� 2�Ǵ� 3�� ����� �ƴ� ���� �� ���� ���Ͻÿ�

public class Quiz4_1 {
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 1 ; i <= 20; i ++) {
			System.out.println("i = " + i);
			if(i % 2 == 0 || i % 3 ==0) {
				continue;
			}
			sum += i;
			System.out.println("sum = " + sum);
		}
		
		System.out.println("1~20���� 2�Ǵ� 3�� ����� �ƴ� ���� �� �� = " + sum);
	}

}
