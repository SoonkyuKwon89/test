package Ex03Operstor;
/*
 * 아래의 코드는 사과를 담는데 필요한 바구니의 갯수를 구하는 코드이다.만일 사과의 수가 123개이고 사과를 10개씩 담을 수 있다면
 * 13개의 바구니가 필요할 것이다. 코드를 완성해라
 */
public class Quiz3_3 {
	public static void main(String[] args) {
		int numOfApples = 123; //사과의 갯수
		int sizeOfBucket = 10; // 바구니 용량
		int numOfBucket =(numOfApples % sizeOfBucket == 0) ? (numOfApples / sizeOfBucket) : ((numOfApples / sizeOfBucket) + 1);//모든 사과를 담는데 필요한 바구니 갯수
				
		System.out.println("필요한 바구니의 갯수 : " + numOfBucket);
	}

}
