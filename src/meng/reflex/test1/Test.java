package meng.reflex.test1;

public class Test {

	public static void main(String[] args) {
		Foo foo = new Foo();
		// foo是Foo类的实例对象

		// Foo也是一个实例对象，是Class类的实力对象
		// 任何一个类都是Class类的实例对象

		// 第一种表现方式
		Class<?> c1 = Foo.class;
		// 第二种表现方式
		Class<?> c2 = foo.getClass();

		/**
		 * 官网解释：c1,c2都是Foo类的类类型（class type）
		 * <p>
		 * 一个类只可能是Class类的一个实例对象
		 */
		System.out.println(c1 == c2);

		// 第三种表现方式
		Class<?> c3 = null;
		try {
			c3 = Class.forName("meng.reflex.test1.Foo");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(c1 == c3);

		// 我们可以通过类的类类型创建该类的实例对象
		try {
			// 前提是要有无参的构造方法
			Foo foo2 = (Foo) c1.newInstance();
			foo2.run();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

}
