
public class Ex03_09_1 {

	public static void main(String[] args) {
		int a, b, c, d;

		a = 100 + 100;
		b = 1 + 100;
		c = a + b - 100;
		d = a + b + c;
		System.out.println("a : "+a+" , b : "+b+", c : "+c+", d : "+d+"");


		a = b = c = d = 100;

		System.out.println("a : "+a+" , b : "+b+", c : "+c+", d : "+d+"");

		a = 100;
		a = a + 200;
		System.out.println("a : " + a);
	}

}
