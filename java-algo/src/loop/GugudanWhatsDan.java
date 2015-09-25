package loop;

import java.util.Scanner;

public class GugudanWhatsDan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("단을 입력해주세요");
		int dan = scanner.nextInt();
		int result = 0;
		for (int i = 1; i < 10; i++) {
			result = i * dan;
		}
		for (int j = 1; j < 10; j++) {
			System.out.println(dan + "*" + j + "=" + result);
		}
	}

}
