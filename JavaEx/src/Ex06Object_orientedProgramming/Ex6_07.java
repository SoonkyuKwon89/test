package Ex06Object_orientedProgramming;
/*
 * 참조형 반환타입
 * 매개변수 뿐만 아니라 반환타입도 참조형이 될 수 있다. 반환타입이 참조형이라는 이야기는 반환하는 값의 타입이 참조형이라는
 * 얘긴데 , 모든 참조형 타입의 값은 '객체의 주소'이므로 그저 정수값이 반환되는 것일 뿐 특별한 것이 없다.
 */
class Data3 {
	int x;
}
public class Ex6_07 {
	public static void main(String[] args) {
		Data3 d = new Data3();
		d.x = 10;
		
		Data3 d2 = copy(d);
		System.out.println("d.x = " + d.x);
		System.out.println("d2.x = " + d2.x);
	}
	static Data3 copy(Data3 d) {
		Data3 tmp = new Data3();
		
		tmp.x = d.x;
		
		return tmp;
	}

}
