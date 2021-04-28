package First_practice;

public class Ex1 {

	public static void main(String[] args) {
		int i;

		for (i = 1; i < 11; i++) {
			if (i % 3 == 0)
				System.out.println("[3의배수] " + i);
			else
				System.out.println(+i);
		}

		for (i = 1; i < 11; i++) {
			if (i % 3 == 0) {
				System.out.println("[3의 배수]");
			}
			System.out.println(i);
		}
	}

}
