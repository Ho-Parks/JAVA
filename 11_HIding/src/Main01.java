class Student {
	// 은닉된 멤버변수 --> 현재 블록 안에서만 접근 가능함.
	private String name;
	private int age;

	// 은닉된 멤버변수에 값을 넣는 방법 --> 메서드를 사용
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// 은닉된 멤버변수의 값을 읽는 방법
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}

public class Main01 {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("JAVA학생");
		s.setAge(20);

		String name = s.getName();
		System.out.println("이름: " + name);

		int age = s.getAge();
		System.out.println("나이: " + age);
	}
}