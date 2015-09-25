package array;

/**
 * @file_name : ArrayMrSmith.java author : soomin0322@naver.com date : 2015. 9.
 *            25. story : 이중배열 예제
 */
public class ArrayMrSmith {
	public static void main(String[] args) {
		String[][] names = { { "Mr", "Mrs", "Ms" }, 
				{ "Smith", "jones", "Alex" },
				{ "hello", "hi", "good-bye", "사요나라" }, 
				};
		// Mr.Smith good-bye
		System.out.println(names[0][0] + names[1][0] + names[2][2]);
		// Ms Alex hello
		System.out.println(names[0][2] + names[1][2] + names[2][3]);
	}

}
