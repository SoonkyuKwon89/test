package Ex06Object_orientedProgramming;
//������ ���� �������� �򵵷� StudentŬ������ �����ڿ� info()�� �߰��Ͻÿ�
public class Quiz6_02 {
	public static void main(String args[]) {
		Students s = new Students("ȫ�浿", 1, 1, 100, 60, 76);
		
		String str = s.info();
		System.out.println(str);
	}
}

class Students {
	String name; //�л��̸�
	int ban; //��
	int no; //��ȣ
	int kor; //��������
	int eng; //��������
	int math; //��������
	
	public Students(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public String info() {
		String tot =name+", "+ban+", "+no+", "+kor+", "+eng+", "+math+", "+
				(kor+eng+math)+", "+((kor+eng+math)/3);
		return tot;
	}

}
