package meng.reflex.test5;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("str");
		list.add(200);

		List<String> list2 = new ArrayList<String>();
		list2.add("str");

		Class c1 = list.getClass();
		Class c2 = list2.getClass();
		System.out.println(c1 == c2);// true
		// 反射的操作都是在编译之后的操作

		// c1==c2结果返回true说明编译之后集合的泛型是去泛型化的
		// Java集合中的泛型 是防止错误输入的 只在编译阶段有效 绕过编译就无效了

		try {
			/**
			 * 验证：通过方法反射的操作绕过编译
			 */
			Method method = c2.getMethod("add", Object.class);
			method.invoke(list2, 200);
			System.out.println(list2);
			// 这样的话不能再使用foreach遍历
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
