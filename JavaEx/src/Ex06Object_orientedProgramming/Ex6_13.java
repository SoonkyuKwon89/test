package Ex06Object_orientedProgramming;
/*
 * 변수의 초기화
 * 변수의 초기화란? 변수를 선언하고 처음으로 값을 지정하는 것
 * 경우에 따라서 필수적이기도 하고 선택적이기도 하지만 가능하면 선언과 동시에 초기화해주는 것이 바람직하다.
 * 
 * 멤버변수는 초기화를 하지 않아도 자동으로 변수의 자료형에 맞는 기본값으로 초기화가 이루어지지만, 지역변수는 사용하기 전에 반드시 초기화해야 한다.
 * 
 * class InitTest {
 * 	int x;		//인스턴스 변수
 * 	int y = x;	//인스턴스 변수
 * 
 * 		void method1() {
 * 			int i;		//지역변수
 * 			int j = i;	//지역변수 i의 초기화가 이루어지지 않았으므로 에러가 난다.
 * 		}
 * }
 * 
 * 인스턴스 변수는 초기화하지 않아도 자동으로 초기화가 되기때문에 에러가 나지 않지만, 지역변수에서는 초기화하지 않고 사용했지깨문에 에러가 발생한다.
 * 즉 멤버필드(클래스변수와 인스턴스변수)의 배열의 초기화는 선택이지만, 지역변수의 초기화는 필수적으로 해야하는 것이다.
 * 
 * 각 타입의 기본값
 * 자료형			기본값
 * boolean		false
 * char			'\u0000'
 * byte,short,int 0
 * long			0L
 * float		0.0f
 * double		0.0d 또는 0.0
 * 참조형			null 
 */

public class Ex6_13 {
	
}
