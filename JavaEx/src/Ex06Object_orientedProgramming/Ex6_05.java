package Ex06Object_orientedProgramming;
/*
 * �⺻�� �Ű������� ������ �Ű�����
 * �ڹٿ����� �޼��带 ȣ���� �� �Ű������� ������ ���� �޼����� �Ű������� �����Ͽ� �Ѱ��ش�.
 * �⺻�� �Ű������� �ܼ��� ����� ���� �������� , ������ �Ű������� �����ϸ� ���� �о���� ���� ���� ���� �����ϴ°͵� �����ϴ�.
 * 
 * �Ű�������?
 * �޼��尡 �۾��� �ϱ� ���ؼ� �ʿ��� ��
 */

//�⺻�� �Ű�����
class Data{
	int x;
}

public class Ex6_05 {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " +d.x);
	}
	
	static void change(int x) {
		x = 1000;
		System.out.println("change() : x =" +x);
	}
}
