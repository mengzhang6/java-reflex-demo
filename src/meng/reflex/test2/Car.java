package meng.reflex.test2;

public class Car implements Moveable {

	private int num;
	private int age;
	public int count;

	public Car() {
	}

	public Car(int num, int age, int count) {
		super();
		this.num = num;
		this.age = age;
		this.count = count;
	}

	@Override
	public void run() {
		System.out.println("汽车运行");
	}
}
