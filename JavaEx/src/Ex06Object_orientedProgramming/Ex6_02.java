package Ex06Object_orientedProgramming;
/*
 * ��ü�� ������ ����
 * ���� Ŭ�����κ��� �����Ǿ������� �� �ν��Ͻ��� �Ӽ��� ���� �ٸ� ���� ������ �� ������ , �޼����� ������
 * ��� �ν��Ͻ��� ���� �����ϴ�.
 */
public class Ex6_02 {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println("t1�� ä�ΰ��� "+ t1.channel + "�Դϴ�.");
		System.out.println("t2�� ä�ΰ��� "+ t2.channel + "�Դϴ�.");
		
		t1.channel = 7;
		System.out.println("t1�� ä�ΰ��� 7�� �����Ͽ����ϴ�.");
		
		System.out.println("t1�� ä�ΰ��� "+ t1.channel + "�Դϴ�.");
		System.out.println("t2�� ä�ΰ��� "+ t2.channel + "�Դϴ�.");
		
		
	}

}
