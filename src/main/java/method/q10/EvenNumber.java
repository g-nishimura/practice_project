package method.q10;

import java.util.Arrays;

public class EvenNumber {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] array = { 3, 2, 5, 6, 7, 25, 10, 51, 88, 98 };
		System.out.println(Arrays.toString(array) + "には、偶数が" + getEvenNumbers(array) + "個あります。");
	}

	public static int getEvenNumbers(int[] array) {
		int even = 0;
		for (int i : array) {
			if (i % 2 == 0) {
				even++;
			}
		}
		return even;
	}
}
