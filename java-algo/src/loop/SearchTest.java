package loop;
/**
 * @file_name : SearchTest.java
 * author     : soomin0322@naver.com
 * date       : 2015. 9. 25.
 * story      : 특정 글자의 갯수 구하기
 */
public class SearchTest {
	/**
	 * [결과]
	 * 제시된 문장에서 특정 알파벳 존재 갯수
	 * "P는 9개 존재합니다" 로 출력
	 */
	public static void main(String[] args) {
		String dest = "peter piper picked a peck of pickled peperes";
		int pCount = 0;
		for (int i = 0; i < dest.length(); i++) {
			if (dest.charAt(i) == 'p' ) {
				pCount++;
			}
			
		}
		System.out.println("제시된 문자열에서는 p는 "+pCount+" 개 존재합니다.");
	}
}
