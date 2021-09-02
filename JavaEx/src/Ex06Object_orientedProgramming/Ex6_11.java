package Ex06Object_orientedProgramming;
/*
 * 생성자-2
 * 생성자도 메서드처럼 매개변수를 선언하여 호출 시 값을 넘겨받아서 인스턴스의 초기화 작업에 사용할 수 있다.
 * 원래대로라면 인스턴스를 생성할 때 인스턴스 변수들을 따로 초기화 해줘야 하지만, 매개벼수가 있는 생성자를 사용한다면
 * 인스턴스를 생성하는 동시에 원하는 값으로 초기화를 할 수 있게된다.
 * 
 * 인스턴스를 생성한 다음에 인스턴스 변수의 값을 변경하는 것보다 매개변수를 갖는 생성자를 사용하는 것이 코드를 보다 더 간결하고 직관적으로 만든다.
 * 
 * 인스턴스를 생성할 때 결정해야 하는 2가지
 * 1.클래스 - 어떤 클래스의 인스턴스를 생성 할 것인가?
 * 2.생성자 - 선택한 클래스의 어떤 생성자로 인스턴스를 생성할 것인가?
 */
class Car {
	String color; // 색상
	String gearType; // 변속기 종류
	int door; //문의 갯수
	
	Car() {} // 기본 생성자
	
	Car(String c , String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}
}

public class Ex6_11 {
	public static void main(String[] args) {
		
		Car c1 = new Car(); //기본 생성자로 인스턴스를 만들었기 때문에 변수를 일일히 설정해줘야 함
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car c2 = new Car("black" , "manual" , 4); //매개변수가 있는 생성자를 사용했기 때문에 변수를 선언하지 않아도 된다.
		
		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door = " + c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door = " + c2.door);
	}

}
