package Ex06Object_orientedProgramming;
/*
 * 객체의 생성과 예제
 * 같은 클래스로부터 생성되었을지라도 각 인스턴스의 속성은 서로 다른 값을 유지할 수 있으며 , 메서드의 내용은
 * 모든 인스턴스에 대해 동일하다.
 */
public class Ex6_02 {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println("t1의 채널값은 "+ t1.channel + "입니다.");
		System.out.println("t2의 채널값은 "+ t2.channel + "입니다.");
		
		t1.channel = 7;
		System.out.println("t1의 채널값을 7로 변경하였습니다.");
		
		System.out.println("t1의 채널값은 "+ t1.channel + "입니다.");
		System.out.println("t2의 채널값은 "+ t2.channel + "입니다.");
		
		
	}

}
