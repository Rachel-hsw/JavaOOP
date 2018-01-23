package _4_5.Override;

public class CastingTest {

	public static void main(String[] args) {
		Animal a = new Animal("动物");
		Cat c = new Cat("猫", "black");
		Dog d = new Dog("狗", "yellow");
		System.out.println(a instanceof Animal);
		System.out.println(c instanceof Animal);
		System.out.println(d instanceof Animal);
		System.out.println(a instanceof Cat);
		System.out.println(a instanceof Dog);
		/*c=(Cat) a;*/
		Animal an = new Dog("旺财", "yellow");
		System.out.println(an.getName());
		System.out.println(an instanceof Animal);
		System.out.println(an instanceof Dog);
		if (an instanceof Dog) {
			Dog temp = (Dog) an;
			System.out.println(temp.getFurColor());
		}
	}
	static class Animal {
		private String name;
		public Animal(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}

	}
	static class Cat extends Animal {
		private String eyesColor;

		public Cat(String n, String c) {
			super(n);
			eyesColor = c;
		}

		public String getEyesColor() {
			return eyesColor;
		}

	}

	static class Dog extends Animal {
		private String furColor;

		public String getFurColor() {
			return furColor;
		}

		public Dog(String n, String c) {
			super(n);
			furColor = c;
		}

	}
}
