package Ex06Object_orientedProgramming;
/*��������6-1���� ������ StudentŬ������ ������ ���� ���ǵ� �� ���� �޼��� getTotal()��
*getAverage()�� �߰��Ͻÿ�
*
*1.�޼���� : getTotal
*��� : ����, ���� , ������ ������ ��� ���ؼ� ��ȯ�Ѵ�.
*��ȯŸ�� : int
*�Ű����� : ����
*
*2.�޼���� : getAverage
*��� : ������ ������� ���� ����� ���Ѵ�. �Ҽ��� ��°�ڸ����� �ݿø��Ұ�
*��ȯŸ�� : float
*�Ű����� : ����
*/
public class Quiz6_03 {
	public static void main(String[] args) {
		Student03 s = new Student03();
		s.name = "ȫ�浿";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("�̸� : " + s.name);
		System.out.println("���� : " + s.getTotal());
		System.out.println("��� : " + s.getAverage());
	}
}

class Student03 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	public int getTotal() {
		int tot = kor + eng + math;
		return tot;
	}
	
	public float getAverage() {
		float average = Math.round(((float)(getTotal()/3)*100)/100);
		return average;
	}
}


