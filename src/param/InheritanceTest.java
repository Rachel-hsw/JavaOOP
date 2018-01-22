package param;

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
w.getSalary();
w=manager;
/*manager=(Manager) e;*/
manager=(Manager) w;
((Manager) w).getBonus();
System.out.println("经理的月薪为"+sal);
System.out.println("经理的奖金为"+manager.getBonus());

	}

}
