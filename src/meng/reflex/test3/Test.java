package meng.reflex.test3;

public class Test {

	public static void main(String[] args) {
		Class<?> c1 = int.class; // int的类类型
		Class<?> c2 = String.class;// String类的类类型
		Class<?> c3 = double.class;
		Class<?> c4 = Double.class;
		Class<?> c5 = void.class;

		System.out.println(c1.getName());
		System.out.println(c2.getName());
		System.out.println(c2.getSimpleName());// 不带包名
		System.out.println("-----");
		System.out.println(c3.getName());
		System.out.println(c4.getName());
		System.out.println(c5.getName());
	}

}
