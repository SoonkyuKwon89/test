package Ex03Operstor;
/*
 * Math.round로 반올림하기
 * 반올림 하기 위한 메서드는 Math.round이다. 이 메서드는 소수점 첫째자리에서 반올림한 결과를 정수로 반환한다.
 * 만약 소수점 첫째자리가 아닌 다른 자리에서 반올림을 하고 싶다면 10의 n제곱으로 적절히 곱하고 나누어야 한다.
 */
public class Ex3_08 {
	public static void main(String[] args) {
		double pi = 3.141592;
		double shortPi = Math.round(pi*1000) / 1000.0; //소수점 4째자리에서 반올림한다.
		System.out.println(shortPi); //3.142 출력
		//만약 여기서 1000을 곱한 후 1000으로 나누게 되면 정수와 정수의 계산에 의해 3만 출력된다. 주의할 것
	}

}
