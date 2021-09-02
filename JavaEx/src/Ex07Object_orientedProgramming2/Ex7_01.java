package Ex07Object_orientedProgramming2;
/*���
 * ����̶�? ������ Ŭ������ �����Ͽ� ���ο� Ŭ������ �ۼ��ϴ� ��
 * ����� ���ؼ� Ŭ������ �ۼ��ϸ� ���� ���� ���� �ڵ�� ���ο� Ŭ������ �ۼ��� �� �ְ�
 * �ڵ带 ���������� ������ �� �ֱ� ������ �ڵ��� �߰� �� ������ �ſ� ����
 * =�ڵ��� ���뼺�� ���̰� �ڵ��� �ߺ��� ����
 * 
 * ����� �����ϴ� ��
 * ���� �ۼ��ϰ��� �ϴ� Ŭ������ �̸� �ڿ� ��ӹް��� �ϴ� Ŭ������ �̸��� 'extends'�� 
 * �Բ� ���ָ� ��
 * 
 * ex) class Parent{ }
 * 	   class Child extends Parent {
 * 		// . . .
 * }
 * ������ִ� Ŭ������ ���� Ŭ������� �ϰ� ��ӹ޴� Ŭ������ �ڼ� Ŭ������� �Ѵ�.
 * 
 * �ڼ� Ŭ������ �θ� Ŭ������ ��� ����� ��ӹޱ� ������ childŬ������ parentŬ������ ������� �����Ѵ�.
 * 
 * �θ� Ŭ������ ��������� �߰��ϸ� �ڵ����� �ڽ� Ŭ������ ��������� �߰��� �� ���� ȿ���� ��´�.
 * ==============================================================================
 * -�ڼ� Ŭ������ ���� Ŭ������ ��� ����� ��ӹ޴´�.
 * (��, �����ڿ� �ʱ�ȭ ���� ��ӵ��� �ʴ´�.)
 * -�ڼ� Ŭ������ ��� ������ ���� Ŭ�������� �׻� ���ų� ����.
 */

class Tv {
	boolean power; //��������(on/off)
	int channel; //ä��
	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}
}

class SmartTv extends Tv { //SmartTv�� Tv�� �ڸ��� �����ִ� ����� �߰�
	boolean caption; //ĸ��(�ڸ�) ����(on/off)
	void displayCaption(String text) {
		if (caption) {
			System.out.println(text);
		}
	}
}
public class Ex7_01 {
	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		stv.channel = 10;
		stv.channelUp();
		System.out.println(stv.channel);
		stv.displayCaption("Hello, world");
		stv.caption = true; //ĸ�� ����� �Ҵ�.
		stv.displayCaption("Hello, world");
	}

}
