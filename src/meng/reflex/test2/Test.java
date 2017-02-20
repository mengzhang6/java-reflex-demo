package meng.reflex.test2;

public class Test {

	public static void main(String[] args) {
		// new 创建对象 是静态加载类，在编译时刻就需要加载所有的可能使用到的类。
		// 通过动态加载类可以解决这个问题

		try {
			// 动态加载类，在运行时加载 
			// meng.reflex.test2.Car
			Class<?> clazz = Class.forName(args[0]);
			Moveable moveable = (Moveable) clazz.newInstance();
			moveable.run();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
