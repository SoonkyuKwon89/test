package Ex06Object_orientedProgramming;
/*
 * static 메서드와 인스턴스 메서드
 * 변수와 마찬가지로 메서드 앞에 static이 붙으면 클래스메서드이고 붙어있지 않다면 인스턴스 메서드이다.
 * 클래스메서드도 클래스변수처럼 객체를 생성하지 않고 '클래스 이름.메서드 이름(매개변수)'와 같은 식으로 호출이 가능하다.
 * 인스턴스 메서드는 반드시 객체를 생성해야지만 호출할 수 있다.
 * 
 * 인스턴스 메서드는 메서드의 작업을 수행하는데 인스턴스 변수를 필요로 하는 메서드이다. 다시말해 메서드 중에서 인스턴스와
 * 관계없는 메서드를 클래스 메서드로 정의하는것이다.
 * 물론 인스턴스 변수를 사용하지 않는다고 해서 반드시 클래스 메서드로 정의해야하는것은 아니지만 특별한 이유가 없는 한 
 * 클래스메서드로 정의하는 것이 일반적이다.
 * 
 * #클래스 영역에 선언된 변수를 멤버변수라고 한다. 멤버변수중에 static이 붙은 변수를 클래스변수라고 하며 붙지 않은 것을
 * 인스턴스 변수라고 한다. 멤버변수는 클래스변수와 인스턴스 변수 모두를 통칭하는 말이다.
 */

class MyMath2 {
	long a, b;
	
	//인스턴스 변수 a,b만을 이용해서 작업하므로 매개변수가 따로 필요하지 않다.
	long add() {
		return a + b;
	}
	long subtract() {
		return a - b;
	}
	long multiply() {
		return a * b;
	}
	double divide() {
		return a / b;
	}
	
	//인스턴스 변수와는 상관없이 매개변수만으로도 작업 가능하다.
	static long add(long a , long b) {	//a , b는 지역변수
		return a + b;
	}
	static long subtract(long a , long b) {
		return a - b;
	}
	static long multiply(long a , long b) {
		return a * b;
	}
	static double divide(long a , long b) {
		return a / (double)b;
	}
}

public class Ex6_08 {
	public static void main(String[] args) {
		//클래스 메서드 호출. 인스턴스 생성없이 호출 가능
		System.out.println(MyMath2.add(200l,100l));//이 경우 메서드에 static이 붙어있지 않다면 오류가 난다.
		System.out.println(MyMath2.subtract(200l,100l));
		System.out.println(MyMath2.multiply(200l,100l));
		System.out.println(MyMath2.divide(200l,100l));
		
		MyMath2 mm = new MyMath2(); //인스턴스를 생성
		mm.a = 200l;
		mm.b = 100l;
		//인스턴스 메서드는 인스턴스를 호출 한 뒤에만 사용 가능함
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
	}

}


















































