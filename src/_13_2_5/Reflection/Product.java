package _13_2_5.Reflection;

public class Product {
private static long count=0;
private long id;
private String name="无名氏";
public Product() {
	System.out.println("默认的构造方法");
	id=++count;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	System.out.println("调用setName方法");
	this.name = name;
}

private void displayInfo() {//私有方法
	System.out.println(getClass().getName()+"[d="+id+",name="+name+"]");
	
}

}
