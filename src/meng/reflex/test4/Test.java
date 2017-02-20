package meng.reflex.test4;

import java.lang.reflect.Method;

/**
 * 动态调用方法
 */
public class Test {

	public static void main(String[] args) {
		Foo foo = new Foo();
		Class<?> c = foo.getClass();

		try {
			// getMethod 获取public的方法
			// getDeclaredMethod(name, parameterTypes);获取自己声明的方法
			// Method method = c.getMethod("print",
			// new Class[] { int.class, int.class });
			
			Method method = c.getMethod("print", int.class, int.class);
			// 方法的反射操作
			Object obj = method.invoke(foo, new Object[] { 10, 5 });// 如果没有返回值则返回null
			System.out.println(obj);

			Method method2 = c.getMethod("print", new Class[] { String.class,
					String.class });
			Object obj2 = method2
					.invoke(foo, new Object[] { "Hello", "World" });
			System.out.println(obj2);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
