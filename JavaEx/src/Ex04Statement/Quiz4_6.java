package Ex04Statement;
/*
 * 숫자로 이루어진 문자열 str이 있을 때 , 각 자리의 합을 출력하는 코드를 완성하여라.
 */

public class Quiz4_6 {
	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
		
		for(int i = 0; i < str.length(); i++) {
			sum += (str.charAt(i) - '0');
			
		}
		System.out.println("sum = " + sum);
	}

}
