package _13_2_5.Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflecInvokeMethodTest {
	

	public static void main(String[] args) {
	
		try {
			//获取指定类名对应的Class对象
			Class clazz=Class.forName("Reflection13_2_5.Product");
			//利用无参构造方法创建一个Product的对象
			Product prod=(Product) clazz.newInstance();
			//clazz.getDeclaredMethod:获取此class表示的实体的所有方法。此处为获取名为setName,带一个参数为String类型的成员方法所对应的对象代表
			Method method1=clazz.getDeclaredMethod("setName", String.class);
			//在prod对象上调用setName，并传值给它，返回值是空
			Object returnValue=method1.invoke(prod, "爪哇");
			System.out.println("返回值："+returnValue);
			//获取名为displayInfo,不带参数的成员方法所对应的对象代表
			Method method2=clazz.getDeclaredMethod("displayInfo");
			//取消访问检查
			method2.setAccessible(true);
			//在prod对象上调用私有的displayInfo方法
			method2.invoke(prod);
		} catch (ClassNotFoundException e) {
		e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
