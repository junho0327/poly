package Java_exercise;

public class Ex08_04 {

	public static void main(String[] args) {
		
		int aa[] = { 100, 200, 300, 400 };
		int [] abc = { 100, 200, 300, 400 };

		int bb[] = new int[] { 100, 200, 300 };

		int cc[];
		cc = new int[] { 100, 200 };

		int dd[] = new int[1];
		dd[0] = 100;

		int i;

		for (i = 0; i < aa.length; i++) {
			System.out.println("aa[" + i + "]" + aa[i]);
		}

		for (i = 0; i < abc.length; i++) {
			System.out.println("aa[" + i + "]" + abc[i]);
		}

		for (i = 0; i < bb.length; i++) {
			System.out.println("aa[" + i + "]" + bb[i]);
		}

		for (i = 0; i < cc.length; i++) {
			System.out.println("aa[" + i + "]" + cc[i]);
		}
		
		for (i = 0; i < dd.length; i++) {
			System.out.println("aa[" + i + "]" + dd[i]);
		}
	}

}
