package Ex06Object_orientedProgramming;

/*
 * 생성자에서 다른 생성자 호출하기 - this()
 * 같은 클래스 멤버들 간에 서로 호출할 수 있는 것처럼 생성자 간에도 서로 호출이 가능하다. 단,2가지 조건을 만족시켜야 한다.
 * -생성자의 이름으로 클래스이름 대신 this를 사용한다.
 * -한 생성자에서 다른 생성자를 호출할 때는 반드시 첫 줄에서만 호출이 가능하다.
 * 
 *  Car(String color){
 *  	door = 5;
 *  	Car(color, "auto" , 4); //첫번째 줄이 아님, this사용 안함 = 에러!
 *  
 *  }
 */

class Car2 {
	String color; // 색상
	String gearType; //변속기 종류 - auto , manual
	int door;	//문의 갯수
	
	Car2(){ // 생성자, Car2(String color, String gearType, int door)를 호출한다.
		this("white","auto",4);
	}
	
	Car2(String color){ // 생성자 오버로딩 , Car2(String color, String gearType, int door)를 호출한다.
		this(color , "manual" , 4);
	}
	
	Car2(String color, String gearType, int door){ //호출당하는 생성자 오버로딩
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

public class Ex6_12 {
	public static void main(String[] args) {
		Car2 c1 = new Car2(); //생성자 호출
		Car2 c2 = new Car2("blue"); //생성자 오버로딩 1번 호출
		
		System.out.println("c1의 color = " + c1.color +", gearType = " +c1.gearType + ", door = " + c1.door);
		System.out.println("c2의 color = " + c2.color +", gearType = " +c2.gearType + ", door = " + c2.door);
	}

}

/*
 * 객체 자신을 가리키는 참조변수 - this
 * 생성자의 매개변수로 설정된 변수와 지역변수의 이름이 다를경우 이름만 가지고도 구별이 되기 때문에 아무런 문제가 없지만, 생성자의 매개변수로 선언된
 * 변수의 이름이 인스턴스 변수와 같을 경우 두 변수의 구별이 힘들다. 그럴때 인스턴스 변수 앞에 사용해 주는것이 this이다.
 * 
 * ex)
 * Car(String c, String g, int d){ //생성자의 매개변수 c의 값을 지역변수 color에 저장한다. 이름이 다르기 때문에 문제가 없음
 * color = c;
 * gearType = g;
 * door = d;
 * }
 * 
 * Car(String color, String gearType , int door){ //매개변수의 이름과 지역변수의 이름이 같을경우 구별할 수가 없다.
 * 	color = color;
 * 	gearType = gearType;
 *  door = door
 * }
 *  Car(String color, String gearType , int door){ //지역변수의 이름에 this룰 붙여 매개변수와 지역변수를 서로 구별한다.
 * 	this.color = color;
 * 	this.gearType = gearType;
 *  this.door = door
 * }
 * 
 * this와 this()는 비슷하게 생겼지만 완전히 다른 것이다.
 */
