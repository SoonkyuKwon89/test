package Ex04Statement;
//1~20까지의 정수 중에서 2또는 3의 배수가 아닌 수의 총 합을 구하시오

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
		
		System.out.println("1~20까지 2또는 3의 배수가 아닌 수의 총 합 = " + sum);
	}

}
