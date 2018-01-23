package _13_2_10.staticProxy;
/**
 * 专门为别人找服装厂的中介公司，收取一定的中介费
 * @author Administrator
 *
 */
public class ProxyCompany implements ClothingFactory {
private ClothingFactory cf;
//中介公司自己不会生产服装，需要找一家真正能做服务的公司


	public void productClothing() {
		System.out.println("收取10000元的中介费");
		cf.productClothing();
		
	}
public ProxyCompany(ClothingFactory cf) {
	this.cf = cf;
}

}
