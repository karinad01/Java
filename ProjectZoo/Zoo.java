
public class Zoo {

	public static void main(String[] args) {

//		Animal animal1 = new Animal(12, "M", 23);
//		animal1.eat();
//		
//
//		Bird bird1 = new Bird(3, "F", 10);
//		bird1.eat();
//		bird1.sleep();
//		
//		Chicken chick1 = new Chicken(1,"M", 7);
//		chick1.fly();
		
	//	Animal sparrow1 = new Sparrow(1, "M", 4);
//		sparrow1.move();
		
	//	Animal fish1 = new Fish(1, "M", 2);
//		fish1.move();
		
//		moveAnimal(fish1);
//		moveAnimal(sparrow1); //Polymorphism dinamically programming
//		
		Flyable flyingBird = new Sparrow (1, "m", 4);
	}
	
	public static void moveAnimal(Animal animal) {
		animal.move();
	}
	
	
	
}
