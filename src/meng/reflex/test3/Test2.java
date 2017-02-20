package meng.reflex.test3;

import meng.reflex.test2.Car;

public class Test2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String str = "mengzhang";
		Car car = new Car();
//		ClassUtil.printMethod(car);
//		ClassUtil.printField(car);
		ClassUtil.printConstructor(str);
	}

}
