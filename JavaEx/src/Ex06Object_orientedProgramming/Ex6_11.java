package Ex06Object_orientedProgramming;
/*
 * ������-2
 * �����ڵ� �޼���ó�� �Ű������� �����Ͽ� ȣ�� �� ���� �Ѱܹ޾Ƽ� �ν��Ͻ��� �ʱ�ȭ �۾��� ����� �� �ִ�.
 * ������ζ�� �ν��Ͻ��� ������ �� �ν��Ͻ� �������� ���� �ʱ�ȭ ����� ������, �Ű������� �ִ� �����ڸ� ����Ѵٸ�
 * �ν��Ͻ��� �����ϴ� ���ÿ� ���ϴ� ������ �ʱ�ȭ�� �� �� �ְԵȴ�.
 * 
 * �ν��Ͻ��� ������ ������ �ν��Ͻ� ������ ���� �����ϴ� �ͺ��� �Ű������� ���� �����ڸ� ����ϴ� ���� �ڵ带 ���� �� �����ϰ� ���������� �����.
 * 
 * �ν��Ͻ��� ������ �� �����ؾ� �ϴ� 2����
 * 1.Ŭ���� - � Ŭ������ �ν��Ͻ��� ���� �� ���ΰ�?
 * 2.������ - ������ Ŭ������ � �����ڷ� �ν��Ͻ��� ������ ���ΰ�?
 */
class Car {
	String color; // ����
	String gearType; // ���ӱ� ����
	int door; //���� ����
	
	Car() {} // �⺻ ������
	
	Car(String c , String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}
}

public class Ex6_11 {
	public static void main(String[] args) {
		
		Car c1 = new Car(); //�⺻ �����ڷ� �ν��Ͻ��� ������� ������ ������ ������ ��������� ��
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car c2 = new Car("black" , "manual" , 4); //�Ű������� �ִ� �����ڸ� ����߱� ������ ������ �������� �ʾƵ� �ȴ�.
		
		System.out.println("c1�� color=" + c1.color + ", gearType=" + c1.gearType + ", door = " + c1.door);
		System.out.println("c2�� color=" + c2.color + ", gearType=" + c2.gearType + ", door = " + c2.door);
	}

}
