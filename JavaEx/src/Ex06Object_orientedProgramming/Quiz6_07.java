package Ex06Object_orientedProgramming;
/*
 * ������ ��ǻ�Ͱ����� ���縦 Ŭ������ ������ ���̴�. �� Ŭ������ ����߿� static�� �ٿ��� �ϴ� ����
 * � �͵��̰� �� ������ �����ΰ�?(��, ��� ������� ���ݷ°� ������ ���ƾ� �Ѵ�.)
 */
public class Quiz6_07 {
	int x = 0, y = 0; // ������ ��ġ��ǥ(x,y)
	int hp = 60; //����ü��
	static int weapon = 6; //���ݷ�
	static int armor = 0; //����
	
	void weaponUp() {
		weapon++;
	}
	
	void armorUp() {
		armor++;
	}
	
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
