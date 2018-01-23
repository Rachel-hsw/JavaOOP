package _4_5.Override;

public class Employee {
private String name;
private int age;
private double salary=3000.0;
public Employee() {

}
public Employee(String name, int age, double salary) {

	this.name = name;
	this.age = age;
	this.salary = salary;
}
public double getSalary() {
	return salary;
}
public double getMonthlyIncome(double salary) {
	return salary;
}
public void  test (){
System.out.println("这是弗雷德方法");
}

}
