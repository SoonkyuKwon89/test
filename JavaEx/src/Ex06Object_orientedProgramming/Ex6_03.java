package Ex06Object_orientedProgramming;
/*
 * 클래스 변수와 인스턴스 변수
 * 변수의 종류에는 크게 클래스 변수, 인스턴스 변수, 지역변수 3가지의 변수가 있다.
 * 
 * 지역변수
 * 멤버변수를 제외한 나머지 변수들
 * 메서드 내에서만 선언되어 메서드 내에서맘ㄴ 사용 가능하며 , 메서드가 종료됨과 동시에 소멸되어 사용할 수 없다.
 * for 또는 while문 안에 생성되었던 변수들을 생각하면 이해하기 쉽다.
 * 
 * 인스턴스 변수
 * 클래스 영역에 생성되며 , 인스턴스를 생성할때 만들어진다. 그렇기 때문에 인스턴스 변수의 값을 읽어오거나 저장하기 위해서는
 * 먼저 인스턴스를 생성해야만 한다. 인스턴스마다 별도의 저장공간을 가지기 때문에 , 같은 변수라도 서로 다른 값을 가질 수 있다.
 * 
 * 클래스 변수
 * 인스턴스 변수앖에 static이 붙은 변수. 클래스 변수는 모든 인스턴스가 공통된 값을 공유하게 된다.한 클래스의 모든 인스턴스가
 * 공통적인 값을 유지해야 하는 값일 경우 클래스 변수로 선언해야 한다.
 * 클래스 변수는 인스턴스 변수와 달리 인스턴스를 생성하지 않고 사용 가능하며 클래스 이름.클래스 변수와 같은 형식으로
 * 사용한다.
 */

public class Ex6_03 {
	
	static class Card	{
		String kind;
		int number;
		static int width = 100;
		static int height = 250;
	}
	
	public static void main(String[] args) {
		System.out.println("Card.width = " + Card.width);	//static 변수 확인 가능하게 출력
		System.out.println("Card.height = " + Card.height);
		
		Card c1 = new Card(); //card 인스턴스를 생성
		c1.kind = "heart"; // 멤버필드 설정
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은 "+c1.kind+" , "+c1.number+"이며, 크기는 ("+c1.width+" , " +c1.height+ ")");
		System.out.println("c2은 "+c2.kind+" , "+c2.number+"이며, 크기는 ("+c2.width+" , " +c2.height+ ")");
		System.out.println();
		System.out.println("c1의 width와 height의 값을 각각 50 , 80으로 변경합니다.");
		
		c1.width = 50;
		c1.height = 80;
		
		System.out.println("c1은 "+c1.kind+" , "+c1.number+"이며, 크기는 ("+c1.width+" , " +c1.height+ ")");
		System.out.println("c2은 "+c2.kind+" , "+c2.number+"이며, 크기는 ("+c2.width+" , " +c2.height+ ")");
		
	}
}
