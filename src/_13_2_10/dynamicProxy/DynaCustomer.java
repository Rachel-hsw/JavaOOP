package _13_2_10.dynamicProxy;

import _13_2_10.staticProxy.ClothingFactory;
import _13_2_10.staticProxy.LiNingCompany;
import _13_2_10.staticProxy.ProxyCompany;


public class DynaCustomer {

	public static void main(String[] args) {
	
		//静态代理的方式
		ClothingFactory cf=new ProxyCompany(new LiNingCompany());//StaticProxy.ProxyCompany@3830f1c0
		System.out.println("--------------------我是好看的分割线----------------");
		cf.productClothing();
		System.out.println("--------------------我是好看的分割线----------------");
		// 动态代理的方式
		ClothingFactory cf2 = (ClothingFactory) new DynaProxyHandler().newProxyInstance(new LiNingCompany());//StaticProxy.LiNingCompany@14899482
		System.out.println("--------------------我是好看的分割线----------------");
		cf2.productClothing();

	}
}
