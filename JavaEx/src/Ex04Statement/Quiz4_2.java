package Ex04Statement;
//1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 합을 구하시오

public class Quiz4_2 {
	public static void main(String[] args) {
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i = 1 ; i <= 10 ; i ++) {
			sum1+=i;
			sum2+=sum1;
			
			System.out.println("sum1 = " + sum1 + " - sum2 = " + sum2);
		}
		
		System.out.println("총 합 : " +sum2);
	}
}
