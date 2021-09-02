package Ex03Operstor;
//사칙연산자
//우리가 알고있는 덧셈 뺄셈 곱셈 나눗셈등

//산술 변환
//연산 직전에 발생하는 자동 형변환
public class Ex3_06 {
	public static void main(String[] args) {
		int a = 10;
		int b = 4;
		
		System.out.printf("%d + %d = %d%n", a , b , a + b);
		System.out.printf("%d - %d = %d%n", a , b , a - b);
		System.out.printf("%d * %d = %d%n", a , b , a * b);
		System.out.printf("%d / %d = %d%n", a , b , a / b);
		System.out.printf("%d / %f = %f%n", a , (float)b , a / (float)b);//산술 변환
	}

}
