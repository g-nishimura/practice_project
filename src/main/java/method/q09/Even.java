package method.q09;

public class Even {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int n = 5;
		String txt = "";
		if(checkEven(n)){
			txt = n + "は偶数です。";
		} else {
			txt = n + "は奇数です。";
		}
		System.out.println(txt);
	}

	public static boolean checkEven(int n) {
		if(n % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}