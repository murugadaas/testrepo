package javatesting;

public class ArmStorng {

	public static void isArmStrong(int num) {
		int cube = 0;
		int r, t;
		t = num;

		while (num > 0) {
			r = num % 10;
			num = num / 10;
			cube = cube + (r * r * r);

		}
		if (t == cube) {
			System.out.println("The given number is Armstrong : ");
		} else {

			System.out.println("The given number not a  Armstrong :");
		}

	}

	public static void main(String[] args) {

		isArmStrong(153);
	}
}
