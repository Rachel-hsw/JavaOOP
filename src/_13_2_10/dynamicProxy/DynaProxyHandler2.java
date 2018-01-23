package _13_2_10.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import _13_2_10.staticProxy.ClothingFactory;
/**
 * 动态代理类
 * @author Administrator
 *
 */
public class DynaProxyHandler2 implements InvocationHandler {
/*目标对象 ，这是动态代理的好处，被封装的对象是Object类型，接受任意类型的对象 */
	private Object  target;
	public DynaProxyHandler2(Object  target) {
		 this.target = target;  
	}
	
	//从以上代码和结果可以看出，我们并没有显示的调用invoke()方法，但是这个方法确实执行了  proxy:LiNingCompany; method: public abstract void _13_2_10.staticProxy.ClothingFactory.productClothing()
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result=null;
		try {
			//目标对象上的方法调用之前可以添加其它代码。。
			//method是调用的方法，target调用方法的对象，args是调用方法所需要传递的参数
			result=method.invoke(this.target, args);//调用目标对象上的方法
			//目标对象上的方法调用之后可以添加其它代码
		} catch (Exception e) {
		throw e;
		}
		return result;//把方法的返回值返回给调用者
	}

}
