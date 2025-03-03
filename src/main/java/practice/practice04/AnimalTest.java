package practice.practice04;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Dog dog = new Dog("ポチ", 2, "白");
		Sparrow sparrow = new Sparrow("チュン", 1, true);

		dog.showInfo();
		dog.cry();

		System.out.println("--------------------");

		sparrow.showInfo();
		sparrow.cry();
	}

}