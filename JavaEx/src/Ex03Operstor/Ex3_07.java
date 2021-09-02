package Ex03Operstor;

public class Ex3_07 {
	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 2_000_000;
		
		long c = a * b;
		
		System.out.println(c); //- 1454759936
		
		/*
		 * long 선언을 했음에도 숫자가 예상한것처럼 나오지 않은 이유
		 * a * b는 int값이기 때문에 두 수의 곱 또한 int형태로 저장되므로 범위를 벗어나게 된다.
		 * 그렇기에 이미 범위가 벗어난 값을 저장한 것이므로 예상한 값이 나오지 않게 된 것이다.
		 */
		
		long d = 1_000_000 * 1_000_000;	//오버플로우 발생
		long e = 1_000_000 * 1_000_000L; // long타입으로 변환되어 계산되므로 제 값이 나온다.
		
		System.out.println("d = " + d);
		System.out.println("e = " + e);
	}
	
}
