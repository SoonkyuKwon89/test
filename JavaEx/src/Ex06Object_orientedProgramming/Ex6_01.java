package Ex06Object_orientedProgramming;
/*
 * 객체의 생성과 사용
 * 클래스로부터 인스턴스를 생성하는 방법
 * 클래스명 변수명;
 * 변수명 = new 클래스명();
 * ex)
 * Tv t; - Tv 클래스 타입의 참조변수 t를 선언
 * t = new Tv();Tv 인스턴스를 생성한 후, 생성된 tv인스턴스의 주소를 t에 저장
 * 
 * 한줄로 줄여쓰기도 가능
 * Tv t = new Tv();
 */

class Tv {
	//Tv의 속성(멤버변수)
	String color;	//색상
	boolean power;	//전원
	int channel;	//채널
	
	//Tv의 기능(메서드)
	void power() {	//Tv의 전원을 끄거나 켜는 메서드
		power = !power;
	}
	
	void channelUp() {	//채널을 하나씩 높이는 기능을 하는 메서드
		++channel;
	}
	
	void channelDown() {	//채널을 하나씩 낮추는 기능을 하는 메서드
		--channel;
	}
}//Tv class end

public class Ex6_01 {
	public static void main(String[] args) {
		Tv t;
		t = new Tv(); //Tv인스턴스를 참조하기 위한 변수 t를 선언하고 Tv인스턴스를 생성
		t.channel = 7;
		t.channelDown();
		System.out.println("현재 체널은 " + t.channel +"입니다.");
		
	}

}
