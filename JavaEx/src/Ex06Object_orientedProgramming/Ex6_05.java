package Ex06Object_orientedProgramming;
/*
 * 기본형 매개변수와 참조형 매개변수
 * 자바에서는 메서드를 호출할 때 매개변수로 지정된 값을 메서드의 매개변수에 복사하여 넘겨준다.
 * 기본형 매개변수는 단순히 저장된 값만 얻어오지만 , 참조형 매개변수로 선언하면 값을 읽어오는 것은 물론 값을 변경하는것도 가능하다.
 * 
 * 매개변수란?
 * 메서드가 작업을 하기 위해서 필요한 값
 */

//기본형 매개변수
class Data{
	int x;
}

public class Ex6_05 {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " +d.x);
	}
	
	static void change(int x) {
		x = 1000;
		System.out.println("change() : x =" +x);
	}
}
