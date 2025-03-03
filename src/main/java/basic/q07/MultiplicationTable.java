package basic.q07;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String text = "";
		for (int  row= 1; row <= 9; row++) {
			for (int column = 1; column <= 9; column++) {
				int multi = row * column;
				if (multi < 10) {
					text += " " + multi + " ";
				} else {
					text += multi + " ";
				}
			}
			text += "\n";
		}
		System.out.println(text);
	}

}
