package _4_5.Override;

public class Manager extends Employee {
private double bonus=1500.0;

public double getBonus() {
	return bonus;
}

public void setBonus(double bonus) {
	this.bonus = bonus;
}

public Manager() {
}
@Override
public void  test (){
System.out.println("这是子类德方法");
}


}
