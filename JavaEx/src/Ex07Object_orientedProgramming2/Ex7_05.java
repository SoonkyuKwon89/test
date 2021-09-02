package Ex07Object_orientedProgramming2;
/*
 * super() - ������ ������
 * this() ó�� super()�� �������̴�. this()�� ���� Ŭ������ �ٸ� �����ڸ� ȣ���ϴµ� ��������,
 * super()�� ������ �����ڸ� ȣ���ϴµ� ���ȴ�.
 */

class Point {
	int x , y;
	
	Point(int x, int y) { // ������ �����ε�
		this.x = x;
		this.y = y;
	}
}

class Point3D extends Point {
	int z;
	
	Point3D(int x, int y, int z){
		super(x,y);	//Point(int x, int y)�� ȣ��
		this.z = z;
	}
}
public class Ex7_05 {
	public static void main(String[] args) {
		Point3D p = new Point3D(1, 2, 3);
		System.out.println("x = " + p.x + ",y = " + p.y + ",z = " + p.z);
	}

}
