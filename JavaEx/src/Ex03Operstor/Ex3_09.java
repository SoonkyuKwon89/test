package Ex03Operstor;
/*
 * 나머지 연산자
 * 나눗셈 연산자와 마찬가지로 왼쪽의 피연산자를 오른쪽의 피연산자로 나누고 그 나머지를 결과로 반환한다.
 * 나눗셈처럼 0을 사용할 수 없고 정수와 실수 모두 허용한다.
 * 짝,홀수 , 배수 검사등에 주로 사용
 */
public class Ex3_09 {
	public static void main(String[] args) {
		int x = 10;
		int y = 8;
		
		System.out.println(x+"을 " +y+"로 나누면 몫은 " +x/y+"이고 나머지는 " +x%y+"입니다." );
		
		System.out.println();
		System.out.println(-10%8);
		System.out.println(10%-8);
		System.out.println(-10%-8);
		/*
		 * 나머지 연산자는 음수도 허용한다. 그러나 부호는 무시되므로 결과는 음수의 절대값을 나눈 나머지와 결과가 같다.
		 * 나머지 연산을 한 결과에 왼쪽의 피연산자의 부호를 붙인다고 생각하면 쉽다.
		 */
		
	}

}
