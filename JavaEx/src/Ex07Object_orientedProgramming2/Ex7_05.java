package Ex07Object_orientedProgramming2;
/*
 * super() - 조상의 생성자
 * this() 처럼 super()도 생성자이다. this()는 같은 클래스의 다른 생성자를 호출하는데 사용되지만,
 * super()는 조상의 생성자를 호출하는데 사용된다.
 */

class Point {
	int x , y;
	
	Point(int x, int y) { // 생성자 오버로딩
		this.x = x;
		this.y = y;
	}
}

class Point3D extends Point {
	int z;
	
	Point3D(int x, int y, int z){
		super(x,y);	//Point(int x, int y)를 호출
		this.z = z;
	}
}
public class Ex7_05 {
	public static void main(String[] args) {
		Point3D p = new Point3D(1, 2, 3);
		System.out.println("x = " + p.x + ",y = " + p.y + ",z = " + p.z);
	}

}
