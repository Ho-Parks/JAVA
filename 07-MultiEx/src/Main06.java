public class Main06 {

	public static void main(String[] args) {

		int sum = 0;
		int i = 0;

		while (true) {
			i++;
			if (i % 2 == 0) {
				continue;
			}
			if (i > 100) {
				break;
			}
			sum += i;
			System.out.println(i);
		}
		System.out.println(sum);
	}

}
