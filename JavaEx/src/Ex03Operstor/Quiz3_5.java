package Ex03Operstor;
/*
 * 화씨를 섭씨로 바꾸는 프로그램이다. Math.round()룰 사용하지 않고 소수점 셋째자리에서 반올림해라.
 * 공식 = 5/9 * (F - 32)
 */
public class Quiz3_5 {
	public static void main(String[] args) {
		
		int fahrenheit = 100;
		float celcius = (float) (((1.8 * (fahrenheit - 32 + 0.005) * 100))/100);
		
		System.out.println("Fahrenheit : " + fahrenheit);
		System.out.println("Celcius : " + celcius);
	}

}
