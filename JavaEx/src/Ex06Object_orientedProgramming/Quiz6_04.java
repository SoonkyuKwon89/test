package Ex06Object_orientedProgramming;
//�� ���� �Ÿ��� ����ϴ� getDistance()�� �ϼ��Ͻÿ�
public class Quiz6_04 {
	//�� �� (x, y)�� (x1, y1)���� �Ÿ��� ���Ѵ�.
	static double getDistance(int x, int y, int x1, int y1) {
		
		double distance = Math.sqrt(((x1 - x)*(x1 - x))+((y1 - y)*(y1 - y)));
		
		return distance;
	}
	
	public static void main(String[] args) {
		System.out.println(getDistance(1,1,2,2));
	}

}
