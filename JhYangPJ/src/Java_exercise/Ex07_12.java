package Java_exercise;

public class Ex07_12 {

	public static void main(String[] args) {

		int hap = 0;
		int i = 0;

		while(true) { 
	//	for (;;) {
			
			for (i = 1; i <= 100; i++) {
				hap += i;

				if (hap > 2000) {
					System.out.println("합계: " + hap);
					hap = 0;
				//	break;
					return;
				}
			}
			System.out.println("아직도 반복중...");
		}
	}
}
