package First_practice;

public class Ex3 {

	public static void main(String[] args) {
		int i=3;
		
		while (i<9) {
			int j=1;
				if(i%3==0 || i%5==0) {
					System.out.println("<" + i + ">단");
				}
					
		while (j<10) {
				System.out.println(i + "x" + j + "=" + (i * j));
				j++;
			}
			i++;
		}
	}

}
