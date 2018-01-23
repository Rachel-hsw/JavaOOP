package _13_2_10.staticProxy;
/**
 * 客户
 * @author Administrator
 *
 */
public class Customer {

	public static void main(String[] args) {
		//最后客户通过中介公司生产一批服装
		ClothingFactory cf=new ProxyCompany(new LiNingCompany());
		System.out.println("--------------------我是好看的分割线----------------");
		//因为上面实例化的是ProxyCompany，所以这里调用的是ProxyCompany中的productClothing方法。然后又在productClothing方法中调用了LiNingCompany中的productClothing方法。
		cf.productClothing();

		ClothingFactory cf2=new ProxyCompany(new AdidsCompany());
	
		cf2.productClothing();

	}

}
