package Ex04Statement;

public class Ex4_12 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		while(sum <= 100) {
			System.out.println(i + " - " + sum);
			sum += ++i; //sum�� i�� 1 ���� ���� ���� �� �ٽ� sum�� ����
		}
	}

}
