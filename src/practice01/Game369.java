package practice01;

import java.util.Scanner;

public class Game369 {
	public static void main(String[] args) {

		for (int i = 1; i < 100; i++) {

			String num = String.valueOf(i);
			int st_len = num.length();
			int count = 0;
			char c;
			for (int j = 0; j < st_len; j++) {
				c = num.charAt(j);
				if (c == '3' || c == '6' | c == '9') {
					count++;
				}
			}
			if (count > 0) {
				System.out.print(num + "\t");
				for (int k = 0; k < count; k++) {
					System.out.print("짝");
				}
				System.out.println("");
			}
		}
	}
}
