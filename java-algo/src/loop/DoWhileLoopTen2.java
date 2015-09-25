package loop;

import java.util.Scanner;

/**
 * @file_name : WhileLoop.java author : soomin0322@naver.com date : 2015. 9. 24.
 *            story :
 */
public class DoWhileLoopTen2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 0;

		do {
			i++;
			System.out.print(i + "\t");
			if (i == 10) {
				return;

			}
		} while (true);

	}

}
