package Ex06Object_orientedProgramming;
/*
 * ������ ��ȯŸ��
 * �Ű����� �Ӹ� �ƴ϶� ��ȯŸ�Ե� �������� �� �� �ִ�. ��ȯŸ���� �������̶�� �̾߱�� ��ȯ�ϴ� ���� Ÿ���� �������̶��
 * ��䵥 , ��� ������ Ÿ���� ���� '��ü�� �ּ�'�̹Ƿ� ���� �������� ��ȯ�Ǵ� ���� �� Ư���� ���� ����.
 */
class Data3 {
	int x;
}
public class Ex6_07 {
	public static void main(String[] args) {
		Data3 d = new Data3();
		d.x = 10;
		
		Data3 d2 = copy(d);
		System.out.println("d.x = " + d.x);
		System.out.println("d2.x = " + d2.x);
	}
	static Data3 copy(Data3 d) {
		Data3 tmp = new Data3();
		
		tmp.x = d.x;
		
		return tmp;
	}

}
