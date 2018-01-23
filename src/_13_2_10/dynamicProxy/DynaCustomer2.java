package _13_2_10.dynamicProxy;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import _13_2_10.staticProxy.ClothingFactory;
import _13_2_10.staticProxy.LiNingCompany;
import _13_2_10.staticProxy.ProxyCompany;


public class DynaCustomer2 {

	public static void main(String[] args) {

		//动态代理的方式2
		ClothingFactory target=new LiNingCompany();//这里指定被代理类  
		InvocationHandler  ds=new DynaProxyHandler2(target);  
/*	        Class<?> cls=target.getClass();  */
	        //以下是一次性生成代理  
	          
	        ClothingFactory proxy=(ClothingFactory) Proxy.newProxyInstance(  
	        target.getClass().getClassLoader(), target.getClass().getInterfaces(), ds);  
	          
	        //这里可以通过运行结果证明proxy是Proxy的一个实例，这个实例实现了proxy接口  
	        System.out.println(proxy instanceof Proxy);  
	          
	        //这里可以看出proxy的Class类是$Proxy0,这个$Proxy0类继承了Proxy，实现了proxy接口  
	        System.out.println("proxy的Class类是："+proxy.getClass().toString());  
	          
	        System.out.print("proxy中的属性有：");  
	        Field[] field=proxy.getClass().getDeclaredFields();  
	        for(Field f:field){  
	            System.out.print(f.getName()+", ");  
	        }  
	          
	        System.out.print("\n"+"proxy中的方法有：");  
	          
	        Method[] method=proxy.getClass().getDeclaredMethods();  
	          
	        for(Method m:method){  
	            System.out.print(m.getName()+", ");  
	        }  
	          
	        System.out.println("\n"+"proxy的父类是："+proxy.getClass().getSuperclass());  
	          
	        System.out.print("\n"+"proxy实现的接口是：");  
	          
	        Class<?>[] interfaces=proxy.getClass().getInterfaces();  
	          
	        for(Class<?> i:interfaces){  
	            System.out.print(i.getName()+", ");  
	        }  
	  
	        System.out.println("\n\n"+"运行结果为：");  
	        proxy.productClothing();  

	}
}
