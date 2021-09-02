package Ex03Operstor;

public class Ex3_13 {
	public static void main(String[] args) {
		int x, y, z;
		int absX, absY, absZ;
		char signX ,signY, signZ;
		
		x = 10;
		y = -5;
		z = 0;
		
		absX = (x >= 0)? x : -x; // x의 값이 음수라면 양수로 만듬
		absY = (y >= 0)? y : -y;
		absZ = (z >= 0)? z : -z;
		
		signX = (x > 0)? '+' : ((x == 0) ? ' ' : '-'); //조건연산자를 중첩
		signY = (y > 0)? '+' : ((y == 0) ? ' ' : '-');
		signZ = (z > 0)? '+' : ((z == 0) ? ' ' : '-'); //z = 0이므로 빈칸이 들어가고 z가 0보다
													   //크지 않기때문에 뒤에 빈칸이 변수에 적용된다.
		
		System.out.println("x = " + signX + absX);
		System.out.println("y = " + signY + absY);
		System.out.println("z = " + signZ + absZ);
	}

}
