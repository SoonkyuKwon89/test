package Ex04Statement;
//n번째까지 숫자의 합계를 구하는 조건문
public class Ex4_09 {
	public static void main(String[] args) {
		int sum = 0; //합계 저장할 변수
		
		for (int i = 1 ; i <= 5; i ++) {//1~5까지 숫자의 합을 구할 조건문
			sum += i;
			System.out.println("1부터 " + i + "까지의 합 : " + sum);
		}
	}

}
