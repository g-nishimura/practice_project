package method.q05;

public class Triangle {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int base = 8;
		int height = 5;
		System.out.println("底辺：" + base);
		System.out.println("高さ：" + height);
		System.out.println("三角形の面積：" + getTriangleArea(base, height));
	}

	public static int getTriangleArea(int base, int height) {
		// TODO 自動生成されたメソッド・スタブ
		return base * height / 2;
	}
}
