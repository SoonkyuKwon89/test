package Ex04Statement;
/*
 * break��
 * break���� �ڽ��� ���Ե� ���� ����� �ݺ����� �����.
 * �ַ� if���� ���� ���Ǿ� Ư�� ������ �����ϰ� �Ǹ� �ݺ����� ����� �Ѵ�.
 */
public class Ex4_15 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		while(true) {//���ѹݺ�(break�� ������� �������� �ݺ��ȴ�.)
			if (sum > 100)
				break;
			++i;
			sum += i;			
		}
		System.out.println("i = " + i);
		System.out.println("sum = " + sum);
	}

}
