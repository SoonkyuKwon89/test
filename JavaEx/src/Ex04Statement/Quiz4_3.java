package Ex04Statement;
//1+(-2)+3+(-4)+...�� ���� ������ ��� ���س������� ����� ���ؾ� ������ 100�̻��� �Ǵ��� ���Ͻÿ�
public class Quiz4_3 {
	public static void main(String[] args) {
		int odd = 0;
		int even = 0;
		int sum = 0;
		
		while(sum <= 100) {
			++odd;
			--even;
			
			if(!(odd%2 == 0)) {
				sum += odd;
			} else if(odd%2 == 0) {
				sum += even;
			}
			System.out.println(odd + "�� sum : " + sum);
		}
	}

}
