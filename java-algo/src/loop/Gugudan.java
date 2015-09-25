package loop;

import java.util.Scanner;

/**
 * @file_name : Gugudan.java author : soomin0322@naver.com date : 2015. 9. 25.
 *            story : 책받침 구구단
 */
public class Gugudan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dan = 1;
		for (int i = 1; i < 10; i++) {
			for (dan = 2; dan < 6; dan++) {
				System.out.print(dan + "*" + i + "=" + dan * i + "\t");
			}
			System.out.println();

		}
		System.out.println();
		for (int i = 1; i < 10; i++) {
			for (dan = 6; dan < 10; dan++) {
				System.out.print(dan + "*" + i + "=" + dan * i + "\t");
			}
			System.out.println();

		}
	}
}
