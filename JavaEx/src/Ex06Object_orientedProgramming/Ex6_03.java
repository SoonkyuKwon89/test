package Ex06Object_orientedProgramming;
/*
 * Ŭ���� ������ �ν��Ͻ� ����
 * ������ �������� ũ�� Ŭ���� ����, �ν��Ͻ� ����, �������� 3������ ������ �ִ�.
 * 
 * ��������
 * ��������� ������ ������ ������
 * �޼��� �������� ����Ǿ� �޼��� ���������� ��� �����ϸ� , �޼��尡 ����ʰ� ���ÿ� �Ҹ�Ǿ� ����� �� ����.
 * for �Ǵ� while�� �ȿ� �����Ǿ��� �������� �����ϸ� �����ϱ� ����.
 * 
 * �ν��Ͻ� ����
 * Ŭ���� ������ �����Ǹ� , �ν��Ͻ��� �����Ҷ� ���������. �׷��� ������ �ν��Ͻ� ������ ���� �о���ų� �����ϱ� ���ؼ���
 * ���� �ν��Ͻ��� �����ؾ߸� �Ѵ�. �ν��Ͻ����� ������ ��������� ������ ������ , ���� ������ ���� �ٸ� ���� ���� �� �ִ�.
 * 
 * Ŭ���� ����
 * �ν��Ͻ� �����׿� static�� ���� ����. Ŭ���� ������ ��� �ν��Ͻ��� ����� ���� �����ϰ� �ȴ�.�� Ŭ������ ��� �ν��Ͻ���
 * �������� ���� �����ؾ� �ϴ� ���� ��� Ŭ���� ������ �����ؾ� �Ѵ�.
 * Ŭ���� ������ �ν��Ͻ� ������ �޸� �ν��Ͻ��� �������� �ʰ� ��� �����ϸ� Ŭ���� �̸�.Ŭ���� ������ ���� ��������
 * ����Ѵ�.
 */

public class Ex6_03 {
	
	static class Card	{
		String kind;
		int number;
		static int width = 100;
		static int height = 250;
	}
	
	public static void main(String[] args) {
		System.out.println("Card.width = " + Card.width);	//static ���� Ȯ�� �����ϰ� ���
		System.out.println("Card.height = " + Card.height);
		
		Card c1 = new Card(); //card �ν��Ͻ��� ����
		c1.kind = "heart"; // ����ʵ� ����
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1�� "+c1.kind+" , "+c1.number+"�̸�, ũ��� ("+c1.width+" , " +c1.height+ ")");
		System.out.println("c2�� "+c2.kind+" , "+c2.number+"�̸�, ũ��� ("+c2.width+" , " +c2.height+ ")");
		System.out.println();
		System.out.println("c1�� width�� height�� ���� ���� 50 , 80���� �����մϴ�.");
		
		c1.width = 50;
		c1.height = 80;
		
		System.out.println("c1�� "+c1.kind+" , "+c1.number+"�̸�, ũ��� ("+c1.width+" , " +c1.height+ ")");
		System.out.println("c2�� "+c2.kind+" , "+c2.number+"�̸�, ũ��� ("+c2.width+" , " +c2.height+ ")");
		
	}
}
