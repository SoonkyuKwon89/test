package Ex06Object_orientedProgramming;
/*
 * ������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�
 * �޼���� shuffle
 * ��� : �־��� �迭�� ��� ���� ��ġ�� �ٲٴ� �۾��� �ݺ��Ͽ� �ڼ��̰� �Ѵ�.
 * ó���� �迭�� ��ȯ�Ѵ�
 * ��ȯŸ�� : int[]
 * �Ű����� : int[]arr - �������� ��� �迭
 */
public class Quiz6_17 {
	public static int[] shuffle(int[] arr){
		for(int i = 0; i < arr.length; i++) {
			int x = (int)(Math.random()*arr.length);
			int y = (int)(Math.random()*arr.length);
			
			int tmp = arr[x];
			arr[x] = arr[y];
			arr[y] = tmp;
		}
		return arr;				
	}
	
	public static void main(String[] args) {
		int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}

}
