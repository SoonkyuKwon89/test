package Ex06Object_orientedProgramming;
//두 점의 거리를 계산하는 getDistance()를 완성하시오
public class Quiz6_04 {
	//두 점 (x, y)와 (x1, y1)간의 거리를 구한다.
	static double getDistance(int x, int y, int x1, int y1) {
		
		double distance = Math.sqrt(((x1 - x)*(x1 - x))+((y1 - y)*(y1 - y)));
		
		return distance;
	}
	
	public static void main(String[] args) {
		System.out.println(getDistance(1,1,2,2));
	}

}
