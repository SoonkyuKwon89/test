package Ex05Array;

import java.util.Arrays;

//1~9 ������ �ߺ����� ���� ���ڷ� �̷���� 3�ڸ� ���ڸ� ������ ���α׷��� �ϼ��ϼ���
public class Quiz5_03 {
	public static void main(String[] args) {
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		//�迭 ballArr�� ������ ��Ҹ� ��� ��ġ�� �ٲ۴�.
		for(int i = 0; i < ballArr.length ; i++) {
			int j = (int)(Math.random()*ballArr.length); //������ ����
			int tmp = 0;//tmp�� �ʱ�ȭ
			tmp = ballArr[j];
			ballArr[j] = ballArr[i];
			ballArr[i] = tmp;
		}
		
		
		//�迭 ballArr�� �տ��� 3���� ���� �迭 ball3�� �����Ѵ�.
		
		for(int a = 0 ; a < ball3.length; a ++) {
			ball3[a] = ballArr[a];
		}
		for(int i = 0; i < ball3.length; i++) {
			System.out.print(ball3[i]);
		}
	}
}
