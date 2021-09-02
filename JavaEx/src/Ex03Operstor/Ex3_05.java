package Ex03Operstor;
/*
 * 형변환 연산자 - 변수, 또는 상수의 타입을 다른 타입으로 변환하는 것
 * (타입)피연산자
 * 형변환 연산자는 그저 피연산자의 값을 읽어서 지정된 타입으로 형변환하고 반환하는 것이기 때문에
 * 피연산자의 변수값은 형변환 후에도 아무런 변화가 없다.
 * 
 * 서로 다른 타입간에 대입이나 연산을 할때 , 형변환으로 타입을 일치시키는 것이 원칙이다. 우리가 형변환을 생략하면
 * 자바에서 알아서 형변환을 맞춰준다.
 */
public class Ex3_05 {
	public static void main(String[] args) {
		double d = 85.4;
		int score = (int)d;//실수를 정수로 형변환
		System.out.println("score = " + score);
		System.out.println("d = " + d);		
				
	}

}
