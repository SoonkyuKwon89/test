package Ex04Statement;
/*
 * if를 여러번 쓰는 경우
 * 조건이 맞을 경우만 줄력되고 나머지는 다 건너뛰게 된다.
 * 조건이 맞는 경우가 여러가지일 경우 여러번 출력 된다.
 */
public class Ex4_02 {
	public static void main(String[] args) {
		int x = 0;
		System.out.println("x = " + x + " 일 때, 참인 것은?");
		
		if(x == 0) System.out.println("x == 0"); //수행할 문장이 하나일 경우, 괄호 생략 가능
		if(x != 0) System.out.println("x != 0");
		if(!(x == 0)) System.out.println("!(x == 0)");
		if(!(x != 0)) System.out.println("!(x != 0)");
		
		x = 1;
		System.out.println("x = " + x + " 일 때, 참인 것은?");
		
		if(x == 0) System.out.println("x == 0"); 
		if(x != 0) System.out.println("x != 0");
		if(!(x == 0)) System.out.println("!(x == 0)");
		if(!(x != 0)) System.out.println("!(x != 0)");
		
		
	}

}
