
public class Ex03_12 {

	public static void main(String[] args) {
		char a, b, c, d, e;

		a = 'A'; // 65
		System.out.println("a : " + a + " | a�� ���ڰ�: " + (int) a);

		b = 'a'; // 97
		c = (char) (b + 1); // 97+1
		System.out.println("b : " + b + " | b�� ���ڰ�: " + (int) b);
		System.out.println("c : " + c + " | c�� ���ڰ�: " + (int) c);

		d = 90;
		System.out.println("d : " + d);

		d = '��'; // 44032
		e = (char) (d + 1); // 44032+1
		System.out.println("d : " + d + " | d�� ���ڰ�: " + (int) d);
		System.out.println("e : " + e + " ");
	}

}
