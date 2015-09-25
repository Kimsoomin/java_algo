package array;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class ArrayCopy {
	public static void main(String[] args) {
		System.out.println("int형 배열복사");
		int[] dest1 = { 1, 2, 3, 4, 5 };
		int[] target1 = new int[3];
		System.arraycopy(dest1, 0, target1, 0, 2);
		for (int i = 0; i < target1.length; i++) {
			System.out.println((i + 1) + "\t");
		}
		System.out.println();
		System.out.println("char형 배열복사");
		char[] dest2 = { 'b', 'l', 'a', 'c', 'k', 'c', 'o', 'f', 'f', 'e', 'e' };
		char[] target2 = new char[6];
		System.arraycopy(dest2, 5, target2, 0, 6);
		System.out.println(new String(target2));

		System.out.println("String형 배열복사");
		String[] dest3 = { "ab", "bc", "cd" };
		String[] target3 = new String[2];
		System.arraycopy(dest3, 1, target3, 0, 2);
		for (int i = 0; i < target3.length; i++) {
			System.out.println(target2[i] + "\t");

		}

	}

}
