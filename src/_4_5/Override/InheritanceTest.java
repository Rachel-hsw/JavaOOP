package _4_5.Override;

import java.util.ArrayList;
import java.util.List;

public class InheritanceTest {

	public static void main(String[] args) {
Manager manager=new Manager();
double sal=manager.getSalary();
Employee e=new Employee();
Employee w=new Manager();
List list = new ArrayList();
e.getSalary();
/**w.manager.getBonus();这句会出错，因为把子类对象（或子类的对象变量）赋值给父亲的对象变量的情况成为向上转型，向上转型是自动进行的，无需开发人员干预。
      此时的父类对象变量只可以访问父类中声明的成员，子类所特有的部分被隐藏。*/
//但是继承的时候，子类override方法会覆盖掉弗雷德方法，这里的输出为：这是子类德方法
w.test();
w.getSalary();
w=manager;
/*manager=(Manager) e;*/
manager=(Manager) w;
((Manager) w).getBonus();
System.out.println("经理的月薪为"+sal);
System.out.println("经理的奖金为"+manager.getBonus());

	}

}
