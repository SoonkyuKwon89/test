package Ex03Operstor;
/*
 * ���������� ++ --
 * ���� 1 �ø��ų� ���̴� ������ �տ� ������ �ڿ� �����Ŀ� ���� �������� ���������� ������.
 * 
 *  ������ - ���� �����Ǳ����� ������Ŵ
 *  ex) j = ++i; //i�� 1�� ���ؼ� j�� �����Ѵ�.
 *  
 *  ������ - ���� ���� �� ������Ŵ
 *  ex) j = i-- // i�� j�� ������ �� i���� 1 ����
 */
public interface Ex3_02 {
	public static void main(String[] args) {
		int i = 5 , j = 0;
		
		j = i++;
		System.out.println("j = i++; ���� ��, i = " + i + ", j = " + j);
		
		i = 5;
		j = 0;
		
		j = ++i;
		System.out.println("j = ++i; ���� ��, i = " + i + ", j = " + j);
	}

}
