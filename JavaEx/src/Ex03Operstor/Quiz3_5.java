package Ex03Operstor;
/*
 * ȭ���� ������ �ٲٴ� ���α׷��̴�. Math.round()�� ������� �ʰ� �Ҽ��� ��°�ڸ����� �ݿø��ض�.
 * ���� = 5/9 * (F - 32)
 */
public class Quiz3_5 {
	public static void main(String[] args) {
		
		int fahrenheit = 100;
		float celcius = (float) (((1.8 * (fahrenheit - 32 + 0.005) * 100))/100);
		
		System.out.println("Fahrenheit : " + fahrenheit);
		System.out.println("Celcius : " + celcius);
	}

}
