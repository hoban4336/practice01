package practice01;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		boolean over = false;
		int ans_count = 0;
		int min = 1;
		int max = 100;

		Scanner scanner = new Scanner(System.in);
		Random r = new Random();

		while (true) {
			ans_count = 0;
			min = 1;
			max = 100;

			int target = r.nextInt(100) + 1;
			System.out.println("수를 결정하였습니다. 맞추어 보세요.");

			while (true) {

				System.out.println(min + "-" + max);
				System.out.print(++ans_count + " ] ");
				int guess = scanner.nextInt();

				if (guess > target) {
					System.out.println("더 낮게");
					max = guess;
				} else if (guess < target) {
					System.out.println("더 높게");
					min = guess;
				} else {
					System.out.println("맞았습니다. ㅎㅎ ");
					break;
				}

			}//-guessing
			System.out.println("다시하시겠습니까?(y/n)>>");
			String yn = scanner.next();
			if (yn.equalsIgnoreCase("n")) {
				break;
			}
		}//-while
		scanner.close();
		
	}
}
