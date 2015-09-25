package loop;

import java.util.Scanner;

/**
 * @file_name : WhileLoop.java author : soomin0322@naver.com date : 2015. 9. 24.
 *            story :
 */
public class WhileLoopTen {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 1, sum = 0, key = 0;

		while (true) {
			System.out.println("업무 선택: \n" 
		+ "1.통장개설 2.잔액조회 3.입금 4.출금 5.정지");
			key = scanner.nextInt();
			i++; // ++i
			switch (key) {
			case 1: i++; break;
			case 2:return;
			default:break;
			}

		}
	}

}
