package Ex03Operstor;
/*비교 연산자
 * 비교 연산자는 두개의 피연산자를 비교하는 연산자이다.
 * 주로 조건문과 반복문의 조건식에 사용되며, 결과는 오직 true와 false가 나온다.
 * 
 * 대소비교 연산자
 * > < >= <=
 * 두 피연산자의 크기를 비교하는 연산자 참이면 true , 거짓이면 false를 결과로 반환
 * 
 * 등가비교 연산자
 * == !=
 * 두 피연산자의 값이 같은지 다른지 비교하는 연산자
 * 
 * 문자열을 비교할때 쓰는 메서드
 * 문자열끼리 비교할 때는 ==대신 equals()라는 메서드를 사용해야 한다.
 */

public class Ex3_10 {
	public static void main(String[] args) {
		String str1 = "abc"; //String 클래스만 new를 사용하지 않고 간단히 나타낼 수 있다.
		String str2 = new String("abc"); // 원래 이런식으로 객체를 생성해야 한다.
		
		System.out.println("\"abc\" == \"abc\" ? " +("abc"=="abc"));
		System.out.println("str1 == \"abc\" ? " +(str1=="abc"));
		System.out.println("str2 == \"abc\" ? " +(str2=="abc"));
		System.out.println("str1.equals(\"abc\") ? " +str1.equals("abc"));
		System.out.println("str2.equals(\"abc\") ? " +str2.equals("abc"));
		System.out.println("str1.equals(\"ABC\") ? " +str1.equals("ABC"));
		System.out.println("str1.equalsIgnoreCase(\"ABC\") ? " +str1.equalsIgnoreCase("ABC"));
	}

}
