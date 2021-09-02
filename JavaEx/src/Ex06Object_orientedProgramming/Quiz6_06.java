package Ex06Object_orientedProgramming;
//�������� 6-4���� �ۼ��� Ŭ�����޼��� getDestance()�� MyPointŬ������ �ν��Ͻ��޼���� �����Ͻÿ�
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
		
		//p�� (2,2)�� �Ÿ��� ���Ѵ�.
		System.out.println(p.getDistance(2,2));
	}

}
