package Ex06Object_orientedProgramming;
//연습문제 6-4에서 작성한 클래스메서드 getDestance()를 MyPoint클래스의 인스턴스메서드로 정의하시오
class MyPoint{
	int x;
	int y;
	
	MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public double getDistance(int x1 , int y1) {
		double distance = Math.sqrt(((x1 - x)*(x1 - x))+((y1 - y)*(y1 - y)));
		return distance;
	}
	
}

public class Quiz6_06 {
	public static void main(String[] args) {
		MyPoint p = new MyPoint(1,1);
		
		//p와 (2,2)의 거리를 구한다.
		System.out.println(p.getDistance(2,2));
	}

}
