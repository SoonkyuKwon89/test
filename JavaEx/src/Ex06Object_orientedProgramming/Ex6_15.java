package Ex06Object_orientedProgramming;

//��������� �ʱ�ȭ ���� 2
public class Ex6_15 {
	//����� �ʱ�ȭ(������ ���ÿ� ����-����)
	static int[] arr = new int[10];
	//static�� ���̴� ����? �޸� �ε� ���� ó������ ����ؾ� �ϱ� ����
	//Ŭ���� �ʱ�ȭ ��
	//1~10 ������ �������� �迭 arr�� �����Ѵ�.
	static {
		for (int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10) + 1;			
		}
	}
	//���� �޼���
	public static void main(String[] args) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"] : " + arr[i]);
		}
	}	
}
