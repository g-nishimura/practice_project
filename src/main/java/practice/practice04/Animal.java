package practice.practice04;

public class Animal {
	private String name;
	private int age;

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void showinfo() {
		System.out.println("名前：" + this.getName());
		System.out.println("年齢：" + this.getAge());
	}

}
