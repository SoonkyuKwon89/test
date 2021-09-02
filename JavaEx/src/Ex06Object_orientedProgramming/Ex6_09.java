package Ex06Object_orientedProgramming;
/*
 * 오버로딩
 * 한 클래스 내에 같은 메서드 이름을 여러 개 정의하는 것
 * 오버로딩의 성립 조건
 * 1.메서드 이름이 같아야 한다.
 * 2.매개변수 또는 타입이 달라야 한다.
 * 3.반환 타입은 관계없다.
 * 
 * 위의 조건을 반족시키지 못하는 메서드는 중복 정의로 간주된다.
 * 
 */

class MyMath3 {
	int add (int a , int b) {
		System.out.print("int add(int a , int b) - ");
		return a + b;
	}
	long add (int a , long b) {
		System.out.print("long add(int a , long b) - ");
		return a + b;
	}
	long add (long a , int b) {
		System.out.print("long add(long a , int b) - ");
		return a + b;
	}
	long add (long a , long b) {
		System.out.print("long add(long a , long b) - ");
		return a + b;
	}
	
	int add(int[] a) {
		System.out.print("int add[] a - " );
		int result = 0;
		for (int i = 0;  i < a.length ; i++) {
			result += a[i];
			
		}
		return result;
	}
}

public class Ex6_09 {
	public static void main(String[] args) {
		MyMath3 mm = new MyMath3();
		System.out.println("mm.add(3, 3) 결과 : " + mm.add(3,3));
		System.out.println("mm.add(3L, 3) 결과 : " + mm.add(3L,3));
		System.out.println("mm.add(3, 3L) 결과 : " + mm.add(3,3L));
		System.out.println("mm.add(3L, 3L) 결과 : " + mm.add(3L,3L));
		
		int[] a = {100, 200, 300};
		System.out.println("mm.add(a) 결과 : " + mm.add(a));
	}
	

}
