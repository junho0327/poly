package opentutorials;

public class Operator2 {

	public static void main(String[] args) {
		//형변환
		int a = 10;
        int b = 3;
          
        float c = 10.0F;
        float d = 3.0F;
          
        System.out.println(a/b);
        System.out.println(c/d);
        System.out.println(a/d);
        
         //단항연산자
        int i = 3;
        i++;
        System.out.println(i); // 4 출력
        ++i;
        System.out.println(i); // 5 출력
        System.out.println(++i); // 6 출력
        System.out.println(i++); // 6 출력
        System.out.println(i); // 7 출력
        
	}

}
