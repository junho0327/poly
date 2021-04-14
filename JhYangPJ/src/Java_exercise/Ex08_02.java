package Java_exercise;

import java.util.Scanner;

public class Ex08_02 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int[] aa = new int[4];
		int hap=0;
		int i=0;

		System.out.println("1번째 숫자를 입력하세요 : ");
		aa[i++] = s.nextInt();

		System.out.println("2번째 숫자를 입력하세요 : ");
		aa[i++] = s.nextInt();

		System.out.println("3번째 숫자를 입력하세요 : ");
		aa[i++] = s.nextInt();

		System.out.println("4번째 숫자를 입력하세요 : ");
		aa[i++] = s.nextInt();

		hap = aa[0] + aa[1] + aa[2] + aa[3];

		System.out.println("hap : " + hap);

		for (int j = 0; j < aa.length; j++) {
			System.out.println("aa[" + j + "] : " + aa[j]);
		}
	}

}
