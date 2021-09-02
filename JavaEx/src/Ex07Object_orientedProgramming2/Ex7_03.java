package Ex07Object_orientedProgramming2;
/*
 * Object 클래스 - 모든 클래스의 조상
 * Objext 클래스는 모든 클래스 상속계층도의 최상위에 있는 조상클래스이다. 다른 클래스로부터 상속받지 않는 모든 클래스들은
 * 자동적으로 object 클래스로부터 상속받게 함으로 이것이 가능해진다.
 * ex)
 * class Tv { //extends Object가 자동 추가됨
 * 	. . .
 * }
 * 
 * class SmartTv extends Tv {
 *  . . .
 * }
 * SmartTv -> Tv -> Object 순으로 상속받는다.
 *
 * *이미 어떤 클래스로부터 상속받도록 작성된 클래스에 대해서는 컴파일러가 extends Object를 추가하지 않는다.
 * 자바의 모든 클래스들은 Object클래스를 상속받기 때문에 Object 정의된 모든 멤버들을 사용할 수 있다.
 * 주요 메서드 - toString(), equals(Object o) 등...
 * 
 * =====================================================================================================
 * 
 * 오버라이딩(overriding)
 * 조상 클래스로부터 상속받은 메서드의 내용을 변경하는 것
 * ex)
 * class Point {
 * int x;
 * int y;
 * 		String getLocation() {
 * 			return "x :: + x + ", y :" + y;
 * 		}
 * }
 * 
 * class Point3D extends Point {
 * int z;
 * 		String getLocation() {	//오버라이딩
 * 			return "x :" + x + ", y :" + y + " , Z :" +z;
 * 
 * 오버라이딩을 하는 이유?
 * 상속 받은 메서드가 내가 기대한대로 작동하지 않는 경우, 새로 메서드를 만드는 것보다 상속받은 메서드를
 * 재활용 해서 다시 쓰는 것이 더 경제적이다.
 * point 클래스를 사용하던 사람들은 getLocation()을 호출하면 점의 좌표를 얻을 수 있다고 기대할 것이다.
 * 그렇기 때문에 새로 점의 위치를 나타내는 메서드를 제공하는 것보다 오버라이딩을 하는 것이 바른 선택이다.
 * 
 * ================================================================================================
 * 오버라이딩의 조건
 * 오버라이딩은 메서드의 내용만을 새로 작성하는 것이므로 메서드의 선언부(메서드 이름, 매개변수, 반환타입)는 조상의 것과
 * 완전히 일치해야 한다.
 * 다만, 접근 제어자와 예외(exception)는 제한된 조건 하에서만 다르게 변경할 수 있다.
 * 
 * 1.접근 제어자(public, default, protected, private)는 조상 클래스의 메서드보다 좁은 범위로 변경할 수 없다.
 * 접근제어자의 접근범위를 넓은 것에서 좁은 것 순으로 나열하면 public, protected, (default), private이다.
 * 
 * 2.조상 클래스의 메서드보다 많은 수의 예외를 선언할 수 없다.
 * ex)
 * class Parent {
 * 		void parentMethod() throws IOException, SQLException {
 *  	. . .
 *  	}
 *  }
 *  
 *  class Child extends Parent {
 *  	void parentMethod() throws IOException {
 *		. . . 
 *  	}
 *  }
 *  
 *  *정리*
 *  1.선언부가 조상 클래스의 메서드와 일치해야한다.
 *  2.접근 제어자를 조상 클래스의 메서드보다 좁은 범위로 변경할 수 없다.
 *  3.예외는 조상 클래스의 메서드보다 많이 선언할 수 없다.
 *  
 *  ====================================================================================================
 *  오버라이딩과 오버로딩의 차이
 *  오버로딩(overloading) - 기존에 없던 새로운 메서드를 정의하는 것(new)
 *  오버라이딩(overriding) - 상속받은 메서드의 내용을 변경하는 것(change, modify)
 */
//아래 코드를 보고 오버로딩과 오버라이딩 구별하기

class Parent {
	void parentMethod() {}
}

class Child extends Parent {
	void parentMethod() {}		//오버라이딩
	void parentMethod(int i) {}	//오버로딩
	
	void childMethod() {}		
	void childMethod(int i) {}	//오버로딩
	// void childMethod() {}	//중복 정의. 에러
	//오버라이딩은 상속받은 메서드로만 가능하다.
	
}

public class Ex7_03 {

}
