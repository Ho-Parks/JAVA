public class Monster implements Fight, Move {
	public String name;

	public Monster(String name) {
		this.name = name;
	}

	@Override
	public void walk() {
		System.out.println(this.name + " >> " + "걷습니다.");

	}

	@Override
	public void run() {
		System.out.println(this.name + " >> " + "뜁니다.");

	}

	@Override
	public void jump() {
		System.out.println(this.name + " >> " + "점프를 합니다.");

	}

	@Override
	public void attack() {
		System.out.println(this.name + " >> " + "공격했습니다.");

	}

	@Override
	public void shield() {
		System.out.println(this.name + " >> " + "방어했습니다.");

	}

}
