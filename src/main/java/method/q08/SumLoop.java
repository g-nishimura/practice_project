package method.q08;

public class SumLoop {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int min = 1;
		int max = 100;
		System.out.println("最小値：" + min);
		System.out.println("最大値：" + max);
		System.out.println("加算結果：" + sumLoop(min, max));
	}

	public static int sumLoop(int min, int max) {
		int sum = 0;
		for(int i = min; i <= max; i++) {
			sum += i;
		}
		return sum;
	}
}
