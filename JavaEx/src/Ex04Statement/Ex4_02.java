package Ex04Statement;
/*
 * if�� ������ ���� ���
 * ������ ���� ��츸 �ٷµǰ� �������� �� �ǳʶٰ� �ȴ�.
 * ������ �´� ��찡 ���������� ��� ������ ��� �ȴ�.
 */
public class Ex4_02 {
	public static void main(String[] args) {
		int x = 0;
		System.out.println("x = " + x + " �� ��, ���� ����?");
		
		if(x == 0) System.out.println("x == 0"); //������ ������ �ϳ��� ���, ��ȣ ���� ����
		if(x != 0) System.out.println("x != 0");
		if(!(x == 0)) System.out.println("!(x == 0)");
		if(!(x != 0)) System.out.println("!(x != 0)");
		
		x = 1;
		System.out.println("x = " + x + " �� ��, ���� ����?");
		
		if(x == 0) System.out.println("x == 0"); 
		if(x != 0) System.out.println("x != 0");
		if(!(x == 0)) System.out.println("!(x == 0)");
		if(!(x != 0)) System.out.println("!(x != 0)");
		
		
	}

}
