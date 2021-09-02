package Ex06Object_orientedProgramming;
/*
 * static �޼���� �ν��Ͻ� �޼���
 * ������ ���������� �޼��� �տ� static�� ������ Ŭ�����޼����̰� �پ����� �ʴٸ� �ν��Ͻ� �޼����̴�.
 * Ŭ�����޼��嵵 Ŭ��������ó�� ��ü�� �������� �ʰ� 'Ŭ���� �̸�.�޼��� �̸�(�Ű�����)'�� ���� ������ ȣ���� �����ϴ�.
 * �ν��Ͻ� �޼���� �ݵ�� ��ü�� �����ؾ����� ȣ���� �� �ִ�.
 * 
 * �ν��Ͻ� �޼���� �޼����� �۾��� �����ϴµ� �ν��Ͻ� ������ �ʿ�� �ϴ� �޼����̴�. �ٽø��� �޼��� �߿��� �ν��Ͻ���
 * ������� �޼��带 Ŭ���� �޼���� �����ϴ°��̴�.
 * ���� �ν��Ͻ� ������ ������� �ʴ´ٰ� �ؼ� �ݵ�� Ŭ���� �޼���� �����ؾ��ϴ°��� �ƴ����� Ư���� ������ ���� �� 
 * Ŭ�����޼���� �����ϴ� ���� �Ϲ����̴�.
 * 
 * #Ŭ���� ������ ����� ������ ���������� �Ѵ�. ��������߿� static�� ���� ������ Ŭ����������� �ϸ� ���� ���� ����
 * �ν��Ͻ� ������� �Ѵ�. ��������� Ŭ���������� �ν��Ͻ� ���� ��θ� ��Ī�ϴ� ���̴�.
 */

class MyMath2 {
	long a, b;
	
	//�ν��Ͻ� ���� a,b���� �̿��ؼ� �۾��ϹǷ� �Ű������� ���� �ʿ����� �ʴ�.
	long add() {
		return a + b;
	}
	long subtract() {
		return a - b;
	}
	long multiply() {
		return a * b;
	}
	double divide() {
		return a / b;
	}
	
	//�ν��Ͻ� �����ʹ� ������� �Ű����������ε� �۾� �����ϴ�.
	static long add(long a , long b) {	//a , b�� ��������
		return a + b;
	}
	static long subtract(long a , long b) {
		return a - b;
	}
	static long multiply(long a , long b) {
		return a * b;
	}
	static double divide(long a , long b) {
		return a / (double)b;
	}
}

public class Ex6_08 {
	public static void main(String[] args) {
		//Ŭ���� �޼��� ȣ��. �ν��Ͻ� �������� ȣ�� ����
		System.out.println(MyMath2.add(200l,100l));//�� ��� �޼��忡 static�� �پ����� �ʴٸ� ������ ����.
		System.out.println(MyMath2.subtract(200l,100l));
		System.out.println(MyMath2.multiply(200l,100l));
		System.out.println(MyMath2.divide(200l,100l));
		
		MyMath2 mm = new MyMath2(); //�ν��Ͻ��� ����
		mm.a = 200l;
		mm.b = 100l;
		//�ν��Ͻ� �޼���� �ν��Ͻ��� ȣ�� �� �ڿ��� ��� ������
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
	}

}


















































