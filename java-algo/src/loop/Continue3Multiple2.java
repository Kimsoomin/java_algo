package loop;

/**
 * @file_name : Continue3Multiple.java author : soomin0322@naver.com date :
 *            2015. 9. 25. story : 3의 배수를 제외한 1부터 10까지 정수 출력
 */
public class Continue3Multiple2 {
	/**
	 * [결과]
	 * 
	 */
	public static void main(String[] args) {
		for (int i = 1; i < 11; i++) {
			if (i % 3 == 0) {
				continue;

			}
			System.out.println(i+"\t");

		}
	}

}
