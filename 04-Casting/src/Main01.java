public class Main01 {

	public static void main(String[] args) {
		short s = 100;
		int i = s;
		long l = i;
		float f = l;
		double d = f;

		System.out.println("s=" + s);
		System.out.println("i=" + i);
		System.out.println("l=" + l);
		System.out.println("f=" + f);
		System.out.println("d=" + d);

		System.out.println("----------------");

		int mypage1 = 20;
		double mypage2 = mypage1;

		System.out.println("mypage1=" + mypage1);
		System.out.println("mypage2=" + mypage2);

		System.out.println("----------------");

		char c1 = 'a';
		int num1 = c1;

		System.out.println("num1=" + num1);
	}

}
