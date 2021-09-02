package Ex02Variable;
/*
 * 변수 타입
 * 변수를 선얼할 때 변수에 저장할 값의 종류에 따라 변수의 타입을 소개해야 함
 * 
 * 정수형
 * int - 정수를 저장하기 위한 타입(20억 이하) // 표즌
 * long - 정수를 저장하기 위한 타입(20억 이상)
 * 
 * 실수헝
 * float - 실수를 저장하기 위한 타입(소수점 아래 7자리까지 오차없이 저장됨)
 * double - 실수를 저장하기 위한 타입(소수점 아래 15자리까지 오차없이 저장됨)
 * 
 * 문자
 * char - 문자를 저장하기 위한 타입(1개만 저장)
 * String - 문자열을 저장하기 위한 타입(2개 이상 , S는 대문자로 써야됨)
 * 
 * 상수와 리터럴
 * 상수란 한번 값이 정해지면 바꿀 수 없는 수를 말한다.
 * 상수를 정의하는 방법은 변수타입 앞에 final를 붙여주면 된다.
 * 상수명은 관례적으로 전부 대문자로 정의하며, 여러 단어가 붙어있는 경우_로 구별한다.
 * ex) final double PI = 3.14;
 * PI = 3.141592 // 변경 불가.
 * 
 * 리터럴
 * 원래 상수는 일반적으로 우리가 쓰는 값들을 칭하는 말이지만 이미 다른 의미로 쓰이고 있기때문에 프로그래밍에서는
 * 따로 리터럴이라는 용어를 사용한다. 사선적 의미로는 그 자체로 값을 의미하는 것이다.
 * 리터럴의 타입
 * 정수형 - 뒤에 L을 붙이면 long타입, 안붙이면 표준인 int타입이다.
 * 8진수나 16진수임을 나타내는 0 , 0x또한 리터럴에 포함된다.
 * 실수형 - 아무것도 없으면 기본인 double(d를 사용해도 무방) , f가 붙는다면 float형임은 나타낸다.
 * 문자나 문자열에 쓰이는 '' , "" 또한 리터럴 타입이다.
 */

public class Ex2_6 {
	public static void main(String[] args) {
		
		int 	x = 100;
		double	pi = 3.14;
		char	ch = 'a'; //문자 한개를 쓸때는 ''를 써도 상관없음
		String	str = "abc"; //문자열을 쓸 때에는 반드시 ""를 쓴다
		
		System.out.println(x);
		System.out.println(pi);
		System.out.println(ch);
		System.out.println(str);
		
		//-------------------------------------------------------
		int octNum = 010;// 8진수 10 10진수로 8
		int hexNum = 0x10; // 16진수 10 10진수로 16
		
		long big = 100_000_000_000L; //리터럴타입L을 붙임으로 long타입임을 나타냄
		long hex = 0xFFFF_FFFF_FFFF_FFFFL;//16진수도 가능하다
		
		float pi2 = 3.14f; // float타입을 나타내는 f는 생략이 불가능
		double rate = 1.618d;//double 타입을 나타내는 d는 생략가능
		
		String str2 = "";
		//char ch2 = ''; //에러. 작은타옴표 안에는 반드시 1개의 문자가 있어야 함
		char ch2 = ' ';
	}
}
