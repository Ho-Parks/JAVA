public class AirForce extends Unit {

	public AirForce(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println(this.getName() + " >> 공중공격");
	}

	@Override
	public void move() {
		System.out.println(this.getName() + " >> 공중이동");
	}
}
