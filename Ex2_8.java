package Ex02Variable;
/*
 * 두 수의 값 바꾸기
 *  = 기호는 수학적으로 쓰이는 것이 아닌 대입연산자로 쓰인 것이므로 두개의 값을 서로 바꾸기 위해서는 값을 임시로
 *  저장할 새로운 변수가 하나 더 필요하다.
 */
public class Ex2_8 {
	public static void main(String[] args) {
		int x = 10 , y = 5; //int x = 10; int y = 5; 를 한줄로 쓴 것
		System.out.println("x = "+ x);
		System.out.println("y = "+ y);
		
		int tmp = x; //1.x의 값을 tmp에 저장
		x = y;		 //2.y의 값을 x에 대입
		y = tmp;	 //3.tmp에 저장된 값을 y에 저장
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}

}
