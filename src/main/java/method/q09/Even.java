package method.q09;

public class Even {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int num = 5;
		String txt = "";
		if (checkEven(num)) {
			txt = num + "は偶数です。";
		} else {
			txt = num + "は奇数です。";
		}
		System.out.println(txt);
	}

	public static boolean checkEven(int num) {
		return num % 2 == 0;
	}
}