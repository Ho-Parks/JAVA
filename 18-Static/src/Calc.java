public class Calc {
// ------ 싱글톤 객체 생성을 위한 준비 시작 ------
	public static Calc current;

	public static Calc getInstance() {
		if (current == null) {
			current = new Calc();
		}
		return current;
	}

	public static void freeInstance() {
		// 객체애 null을 대입하면 메모리에서 삭제된다.
		current = null;
	}

	// 기본 생성자를 private 로 은닉하게 되면 new를 통한 객체 생성이 금지된다.
	private Calc() {
		super();
	}
	// ------싱글톤 객체 생성을 위한 준비 끝 ------

	// 이 클래스가 구현해야 하는 기능
	public void plus(int x, int y) {
		int z = x + y;
		System.out.println(x + "+" + y + "=" + z);
	}

	public void minus(int x, int y) {
		int z = x - y;
		System.out.println(x + "-" + y + "=" + z);
	}
}
