package _13_2_10.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/**
 * 动态代理类
 * @author Administrator
 *
 */
public class DynaProxyHandler implements InvocationHandler {
/*目标对象 */
	private Object  target;
	/* 创建一个目标对象的代理对象*/
	public Object newProxyInstance(Object target){
		this.target=target;
		/**
		 * 第一个参数：定义代理类的类加载器
		 * 第二个参数：代理类要实现的接口列表
		 * 第三个参数：指派方法调用的调用处理程序
		 */
		Proxy.newProxyInstance(
				this.target.getClass().getClassLoader(), 
                 this.target.getClass().getInterfaces(), this);
		//提供用来创建动态代理类和实例的静态方法
		return Proxy.newProxyInstance(
				this.target.getClass().getClassLoader(), 
                 this.target.getClass().getInterfaces(), this);
		
	}
	//从以上代码和结果可以看出，我们并没有显示的调用invoke()方法，但是这个方法确实执行了
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result=null;
		try {
			//目标对象上的方法调用之前可以添加其它代码。。
			result=method.invoke(this.target, args);//调用目标对象上的方法
			//目标对象上的方法调用之后可以添加其它代码
		} catch (Exception e) {
		throw e;
		}
		return result;//把方法的返回值返回给调用者
	}

}
