package Ex07Object_orientedProgramming2;
/*참조변수 super
 * 참조타입이란? 객체의 번지를 참조하는 타입 - 배열, 열거, 클래스, 인터페이스
 * super는 자손 클래스에서 조상 클래스로부터 상속받은 멤버를 참조하는데 사용되는 참조변수이다.
 * 
 * this 와 super의 차이점?
 * this는 자신의 멤버를 구별할때 사용한다.
 * super는 조상의 멤버를 구별할때 사용한다.
 */

class Parent01 { int x = 10; /*super.x*/ }

class Child01 extends Parent01 {
	int x = 20; //this.x 멤버변수 생성
	
	void method() {
		System.out.println("x = " + x); //멤버변수 출력
		System.out.println("this.x = " + this.x); // 자신의 멤버변수 출력 즉 현재클래스 멤버변수를 출력
		System.out.println("super.x = " + super.x); //조상의 멤버변수 출력 즉 상속받은 멤버변수를 출력
	}
}

public class Ex7_04 {
	public static void main(String[] args) {
		Child01 c = new Child01(); //인스턴스 생성
		c.method(); // 메서드 실행
	}
}


