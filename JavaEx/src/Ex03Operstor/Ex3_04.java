package Ex03Operstor;
/*
 * 부호 연산자
 * 음수를 양수로 만들어주는 연산자.
 */
public class Ex3_04 {
	public static void main(String[] args) {
		int i = -10;
		i = +i;
		System.out.println(i); // -10
		
		i = -10;
		i = -i;
		System.out.println(i); // 10
	}

}
