package Ex03Operstor;

public class Ex3_13 {
	public static void main(String[] args) {
		int x, y, z;
		int absX, absY, absZ;
		char signX ,signY, signZ;
		
		x = 10;
		y = -5;
		z = 0;
		
		absX = (x >= 0)? x : -x; // x�� ���� ������� ����� ����
		absY = (y >= 0)? y : -y;
		absZ = (z >= 0)? z : -z;
		
		signX = (x > 0)? '+' : ((x == 0) ? ' ' : '-'); //���ǿ����ڸ� ��ø
		signY = (y > 0)? '+' : ((y == 0) ? ' ' : '-');
		signZ = (z > 0)? '+' : ((z == 0) ? ' ' : '-'); //z = 0�̹Ƿ� ��ĭ�� ���� z�� 0����
													   //ũ�� �ʱ⶧���� �ڿ� ��ĭ�� ������ ����ȴ�.
		
		System.out.println("x = " + signX + absX);
		System.out.println("y = " + signY + absY);
		System.out.println("z = " + signZ + absZ);
	}

}
