package meng.reflex.test3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassUtil {

	/**
	 * 获取成员方法信息
	 */
	public static void printMethod(Object obj) {
		// 获取类的类类型
		Class<?> clazz = obj.getClass();
		// 获取类的名称
		System.out.println("类名称：" + clazz.getName());
		System.out.println("----------------------------");

		// 获取方法 （Method类，是方法对象的类类型）
		// 一个成员方法就是一个Method对象
		Method[] methods = clazz.getMethods();// 获取所有的public方法，包含从父类继承来的
		Method[] methodsDeclare = clazz.getDeclaredMethods();// 获取所有自己声明的方法
		for (Method method : methods) {
			// 获取方法的返回值类型的类类型
			Class<?> returnType = method.getReturnType();
			System.out.print(returnType.getName() + " ");
			// 获取方法名
			System.out.print(method.getName() + "(");
			// 获取方法的参数类型 的类类型
			Class<?>[] paramTypes = method.getParameterTypes();
			for (int i = 0; i < paramTypes.length; i++) {
				System.out.print(paramTypes[i].getName() + " args" + i);
				if (i < paramTypes.length - 1) {
					System.out.print(",");
				}
			}
			System.out.println(");");
		}
		System.out.println("----------------------------");
		for (Method method : methodsDeclare) {
			// 获取方法的返回值类型的类类型
			Class<?> returnType = method.getReturnType();
			System.out.print(returnType.getName() + " ");
			// 获取方法名
			System.out.print(method.getName() + "(");
			// 获取方法的参数类型 的类类型
			Class<?>[] paramTypes = method.getParameterTypes();
			for (int i = 0; i < paramTypes.length; i++) {
				System.out.print(paramTypes[i].getName() + " args" + i);
				if (i < paramTypes.length - 1) {
					System.out.print(",");
				}
			}
			System.out.println(");");
		}
	}

	/**
	 * 获取成员变量信息
	 */
	public static void printField(Object obj) {
		// 获取类的类类型
		Class<?> clazz = obj.getClass();
		// 获取类的名称
		System.out.println("类名称：" + clazz.getName());
		System.out.println("----------------------------");

		// 获取成员变量 （Field类，是成员变量对象的类类型）
		// 获取所有public成员变量
		Field[] fields = clazz.getFields();
		for (Field field : fields) {
			// 获取成员变量的类型的类类型
			Class<?> fieldType = field.getType();
			System.out.print(fieldType.getName() + " ");
			System.out.println(field.getName() + ";");
		}
		System.out.println("----------------------------");

		// 获取自己声明的成员变量
		Field[] fieldsDeclared = clazz.getDeclaredFields();
		for (Field field : fieldsDeclared) {
			// 获取成员变量的类型的类类型
			Class<?> fieldType = field.getType();
			System.out.print(fieldType.getName() + " ");
			System.out.println(field.getName() + ";");
		}

	}

	/**
	 * 获取构造方法信息
	 */
	public static void printConstructor(Object obj) {
		// 获取类的类类型
		Class<?> clazz = obj.getClass();
		// 获取类的名称
		System.out.println("类名称：" + clazz.getName());
		System.out.println("----------------------------");

		// 构造方法： Constructor类的对象
		Constructor<?>[] constructors = clazz.getConstructors();
		for (Constructor<?> constructor : constructors) {
			System.out.print(constructor.getName() + "(");
			// 获取构造方法的参数
			Class<?>[] paramTypes = constructor.getParameterTypes();
			for (int i = 0; i < paramTypes.length; i++) {
				System.out.print(paramTypes[i].getSimpleName() + " args" + i);
				if (i < paramTypes.length - 1) {
					System.out.print(",");
				}
			}
			System.out.println(");");
		}
	}

}
