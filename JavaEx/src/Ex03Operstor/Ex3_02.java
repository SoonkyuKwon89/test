package Ex03Operstor;
/*
 * 증감연산자 ++ --
 * 값을 1 늘리거나 줄이는 연산자 앞에 쓰느냐 뒤에 쓰느냐에 따라 전위형과 후위형으로 나뉜다.
 * 
 *  전위형 - 값이 참조되기전에 증감시킴
 *  ex) j = ++i; //i에 1을 더해서 j에 대입한다.
 *  
 *  후위형 - 값을 대입 후 증감시킴
 *  ex) j = i-- // i를 j에 대입한 후 i값을 1 감소
 */
public interface Ex3_02 {
	public static void main(String[] args) {
		int i = 5 , j = 0;
		
		j = i++;
		System.out.println("j = i++; 실행 후, i = " + i + ", j = " + j);
		
		i = 5;
		j = 0;
		
		j = ++i;
		System.out.println("j = ++i; 실행 후, i = " + i + ", j = " + j);
	}

}
