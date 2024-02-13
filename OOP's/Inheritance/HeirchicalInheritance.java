class Animal{
	String name;
	String color;
	String food;

	void walk(){
		System.out.println(this.name+" is walking.");
		System.out.println("The color of it is "+this.color);
	}

	void haveFood(){
		System.out.println(this.name+" is having "+this.food);
	}

}

class Dog extends Animal{

}

class Cow extends Animal{

}

class Camel extends Animal{

}



class HeirchicalInheritance{
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.name = "dog1";
		dog1.color = "Black";
		dog1.food = "NonVeg food";
		dog1.walk();
		dog1.haveFood();

		System.out.println();

		Cow cow1 = new Cow();
		cow1.name = "cow1";
		cow1.color = "White";
		cow1.food = "Veg food";
		cow1.walk();
		cow1.haveFood();

		System.out.println();

		Camel camel1 = new Camel();
		camel1.name = "camel1";
		camel1.color = "Wood Brown";
		camel1.food = "Veg food";
		camel1.walk();
		camel1.haveFood();
	}
}