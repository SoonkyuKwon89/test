package Ex06Object_orientedProgramming;
/*
 * ��ü�� ������ ���
 * Ŭ�����κ��� �ν��Ͻ��� �����ϴ� ���
 * Ŭ������ ������;
 * ������ = new Ŭ������();
 * ex)
 * Tv t; - Tv Ŭ���� Ÿ���� �������� t�� ����
 * t = new Tv();Tv �ν��Ͻ��� ������ ��, ������ tv�ν��Ͻ��� �ּҸ� t�� ����
 * 
 * ���ٷ� �ٿ����⵵ ����
 * Tv t = new Tv();
 */

class Tv {
	//Tv�� �Ӽ�(�������)
	String color;	//����
	boolean power;	//����
	int channel;	//ä��
	
	//Tv�� ���(�޼���)
	void power() {	//Tv�� ������ ���ų� �Ѵ� �޼���
		power = !power;
	}
	
	void channelUp() {	//ä���� �ϳ��� ���̴� ����� �ϴ� �޼���
		++channel;
	}
	
	void channelDown() {	//ä���� �ϳ��� ���ߴ� ����� �ϴ� �޼���
		--channel;
	}
}//Tv class end

public class Ex6_01 {
	public static void main(String[] args) {
		Tv t;
		t = new Tv(); //Tv�ν��Ͻ��� �����ϱ� ���� ���� t�� �����ϰ� Tv�ν��Ͻ��� ����
		t.channel = 7;
		t.channelDown();
		System.out.println("���� ü���� " + t.channel +"�Դϴ�.");
		
	}

}
