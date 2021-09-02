package Ex07Object_orientedProgramming2;
/*상속
 * 상속이란? 기존의 클래스를 재사용하여 새로운 클래스를 작성하는 것
 * 상속을 통해서 클래스를 작성하면 보다 적은 양의 코드로 새로운 클래스를 작성할 수 있고
 * 코드를 공통적으로 관리할 수 있기 때문에 코드의 추가 및 변경이 매우 용이
 * =코드의 재사용성을 높이고 코드의 중복을 제거
 * 
 * 상속을 구현하는 법
 * 새로 작성하고자 하는 클래스의 이름 뒤에 상속받고자 하는 클래스의 이름을 'extends'와 
 * 함께 써주면 됨
 * 
 * ex) class Parent{ }
 * 	   class Child extends Parent {
 * 		// . . .
 * }
 * 상속해주는 클래스를 조상 클래스라고 하고 상속받는 클래스는 자손 클래스라고 한다.
 * 
 * 자손 클래스는 부모 클래스의 모든 멤버를 상속받기 때문에 child클래스는 parent클래스의 멤버들을 포함한다.
 * 
 * 부모 클래스에 멤버변수를 추가하면 자동으로 자식 클래스에 멤버변수가 추가된 것 같은 효과를 얻는다.
 * ==============================================================================
 * -자손 클래스는 조상 클래스의 모든 멤버를 상속받는다.
 * (단, 생성자와 초기화 블럭은 상속되지 않는다.)
 * -자손 클래스의 멤버 개수는 조상 클래스보다 항상 같거나 많다.
 */

class Tv {
	boolean power; //전원상태(on/off)
	int channel; //채널
	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}
}

class SmartTv extends Tv { //SmartTv는 Tv에 자막을 보여주는 기능을 추가
	boolean caption; //캡션(자막) 상태(on/off)
	void displayCaption(String text) {
		if (caption) {
			System.out.println(text);
		}
	}
}
public class Ex7_01 {
	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		stv.channel = 10;
		stv.channelUp();
		System.out.println(stv.channel);
		stv.displayCaption("Hello, world");
		stv.caption = true; //캡션 기능을 켠다.
		stv.displayCaption("Hello, world");
	}

}
