package method.q06;

public class Circle {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double a = 5.0;
		System.out.println("半径：" + a);
		System.out.println("円の面積：" + getCircleArea(a));
	}

	public static double getCircleArea(double a) {
		// TODO 自動生成されたメソッド・スタブ
		return a * a * 3.14;
	}
}
