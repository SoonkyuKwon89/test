package Ex04Statement;

public class Ex4_12 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		while(sum <= 100) {
			System.out.println(i + " - " + sum);
			sum += ++i; //sum에 i를 1 더한 값을 더한 뒤 다시 sum에 대입
		}
	}

}
