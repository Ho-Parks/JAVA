public class Unit {
	private String name;

	public Unit(String name) {
		super();
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;

	}

	public void attack() {
		System.out.println(this.name + " >> 공격준비");
	}
}
