package Ex06Object_orientedProgramming;

/*
 * �����ڿ��� �ٸ� ������ ȣ���ϱ� - this()
 * ���� Ŭ���� ����� ���� ���� ȣ���� �� �ִ� ��ó�� ������ ������ ���� ȣ���� �����ϴ�. ��,2���� ������ �������Ѿ� �Ѵ�.
 * -�������� �̸����� Ŭ�����̸� ��� this�� ����Ѵ�.
 * -�� �����ڿ��� �ٸ� �����ڸ� ȣ���� ���� �ݵ�� ù �ٿ����� ȣ���� �����ϴ�.
 * 
 *  Car(String color){
 *  	door = 5;
 *  	Car(color, "auto" , 4); //ù��° ���� �ƴ�, this��� ���� = ����!
 *  
 *  }
 */

class Car2 {
	String color; // ����
	String gearType; //���ӱ� ���� - auto , manual
	int door;	//���� ����
	
	Car2(){ // ������, Car2(String color, String gearType, int door)�� ȣ���Ѵ�.
		this("white","auto",4);
	}
	
	Car2(String color){ // ������ �����ε� , Car2(String color, String gearType, int door)�� ȣ���Ѵ�.
		this(color , "manual" , 4);
	}
	
	Car2(String color, String gearType, int door){ //ȣ����ϴ� ������ �����ε�
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

public class Ex6_12 {
	public static void main(String[] args) {
		Car2 c1 = new Car2(); //������ ȣ��
		Car2 c2 = new Car2("blue"); //������ �����ε� 1�� ȣ��
		
		System.out.println("c1�� color = " + c1.color +", gearType = " +c1.gearType + ", door = " + c1.door);
		System.out.println("c2�� color = " + c2.color +", gearType = " +c2.gearType + ", door = " + c2.door);
	}

}

/*
 * ��ü �ڽ��� ����Ű�� �������� - this
 * �������� �Ű������� ������ ������ ���������� �̸��� �ٸ���� �̸��� ������ ������ �Ǳ� ������ �ƹ��� ������ ������, �������� �Ű������� �����
 * ������ �̸��� �ν��Ͻ� ������ ���� ��� �� ������ ������ �����. �׷��� �ν��Ͻ� ���� �տ� ����� �ִ°��� this�̴�.
 * 
 * ex)
 * Car(String c, String g, int d){ //�������� �Ű����� c�� ���� �������� color�� �����Ѵ�. �̸��� �ٸ��� ������ ������ ����
 * color = c;
 * gearType = g;
 * door = d;
 * }
 * 
 * Car(String color, String gearType , int door){ //�Ű������� �̸��� ���������� �̸��� ������� ������ ���� ����.
 * 	color = color;
 * 	gearType = gearType;
 *  door = door
 * }
 *  Car(String color, String gearType , int door){ //���������� �̸��� this�� �ٿ� �Ű������� ���������� ���� �����Ѵ�.
 * 	this.color = color;
 * 	this.gearType = gearType;
 *  this.door = door
 * }
 * 
 * this�� this()�� ����ϰ� �������� ������ �ٸ� ���̴�.
 */
