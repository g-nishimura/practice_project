package method.q07;

public class SumNumbers2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int firstNum = 5;
		double secondNum = 3.3;
		System.out.println("第一引数（整数）：" + firstNum);
		System.out.println("第二引数（実数）：" + secondNum);
		System.out.println("加算結果：" + calculateSum(firstNum, secondNum));
	}

	public static int calculateSum(int firstNum, double secondNum) {
		return firstNum + (int) secondNum;
	}
}
