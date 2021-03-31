package Java_exercise;

public class Ex06_07 {

	int bbbbb=0; //클래스 전체에서 사용되는 변수 (전액변수)
	
	public static void main(String[] args) {
		
		int hap = 0; //main 함수 실행되는 동안만 사영되는 변수
		int i;
		
		for (i=1;i<=10;i++) {
			
			/*int b - 0; -> for문 한번 돌때만 살아있는 변수 */
			hap = hap + i; 
		}
		System.out.println("1부터 10까지 합: " +hap);
	}

}