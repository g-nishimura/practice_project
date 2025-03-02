package method.q05;

public class Triangle {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 8;
		int b = 5;
		System.out.println("底辺：" + a);
		System.out.println("高さ：" + b);
		System.out.println("三角形の面積：" + getTriangleArea(a, b));
	}

	public static int getTriangleArea(int a, int b) {
		// TODO 自動生成されたメソッド・スタブ
		return a * b / 2;
	}
}
