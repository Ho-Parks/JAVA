public class Army extends Unit {
	public Army(String name) {
		super(name);
	}

	@Override
	public void attack() {
		super.attack();
		System.out.println(this.getName() + " >> 지상공격 실행함");
	}

	public void tank() {
		System.out.println(this.getName() + " >> 탱크 공격");
	}
}
