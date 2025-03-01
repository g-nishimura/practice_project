package basic.q07;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String text = "";
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				int m = i * j;
				if (m < 10) {
					text += " " + m + " ";
				} else {
					text += m + " ";
				}
			}
			text += "\n";
		}
		System.out.println(text);
	}

}
