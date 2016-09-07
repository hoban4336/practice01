package practice01;

public class Prob2 {

	public static void main(String[] args) {

		int total = 10;
		for (int i = 1; i < 9; i++) {
			for (int j = i; j < i + 10; j++) {
				System.out.print(j + "\t");
			}
			System.out.println("");
		}
	}

}
