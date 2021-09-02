package Ex06Object_orientedProgramming;
/*
 * 메서드
 * 메서드란 ? - 특정 작업을 수행하는 일련의 문장들을 하나로 묶은 것
 * 메서드를 사용하기 위해서는 입력값과 출력값만 알면 되기 때문에 메서드를 블랙박스라고 하기도 한다.
 * 
 * 메서드의 선언부
 * 메서드의 선언부는 변환타입과 메서드 이름과 매개변수 선언으로 이루어져 있으며 메서드의 작업에 필요한 정보를 제공한다.
 * 
 * Ex) 변환타입	메서드 이름		매개변수선언(입력)
 * 		int		add			(int x , int y)
 * 
 * 매개변수는 메서드가 작업을 하기 위해 필요한 값을을 제공받기 위한 것이며 필요한 값의 개수만큼 변수를 선언할 수 있다
 * 변수와 변수 사이에는 쉼표를 사용하여 구분한다.
 * 매개변수의 타입은 생략이 불가능하다.
 * 
 * 반환타입은 메서드의 출력결과를 출력해야 할 경우 출력할 값의 타입을 적는다. 만약 출력할 필요가 없다면 void를 사용한다.
 * 메서드의 반환타입이 void가 아닐경우 , 구현부 안에는 반드시 'return 반환값'이 포함되어 있어야 한다. 이 문장은
 * 작업응ㄹ 수행한 결과인 반환값을 호출한 메서드로 전달하는 용도로 사용된다. 매개변수는 여러개를 사용할 수 있지만, 
 * return값은 반드시 단 하나의 값만 반환할 수 있다.
 * return하는 값은 반환타입과 일치하거나 자동 형변환을 할 수 있어야 한다.
 * 
 * 매서드 내에서 선언된 변수들은 그 메서드 내에서만 사용 가능하다. 이것을 지역변수라고 한다.
 * 
 * 메서드 호출
 * 메서드를 호출하는 방법은 다음과 같다.
 * Ex) 메서드 이름(값1 , 값2 , ...);
 * 메서드를 호출할때 괄호안에 지정해 준 값을을 인수 또는 인자라고 하는데 인자의 개수와 순서는 호출된 메서드에 선언된 매개변수와
 * 일치해야 한다. 또한 인자의 타입도 매개변수의 타입과 일치해야 한다.
 */

class MyMath {
	long add(long a , long b) {
		long result = a+b;
		return result;
		//위의 두 줄을 한줄로 하는 방법 = return a+b;
	}
	
	long subtrect(long a , long b) {
		return a-b;			
	}
	long multiply(long a , long b) {
		return a*b;
	}
	double divide(double a , double b) {
		return a/b;
	}
}

public class Ex6_04 {	
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5l, 3l);
		long result2 = mm.subtrect(5l,3l);
		long result3 = mm.multiply(5l, 3l);
		double result4 = mm.divide(5l,3l);
		
		System.out.println("add(5l , 3l) = "+result1);
		System.out.println("subtrect(5l , 3l) = "+result2);
		System.out.println("multiply(5l , 3l) = "+result3);
		System.out.println("divide(5l , 3l) = "+result4);
		
	}

}
