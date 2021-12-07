abstract class Animal {
  abstract void makeSound();

  public void eat() {
   System.out.println("the animal is eating!!!");


  }
}
class Cat extends Animal{

	@Override
	void makeSound() {
	System.out.println("the cat sounds as meow-meow");
		
	}}
	class Dog extends Animal{

		@Override
		void makeSound() {
		System.out.println("the dog sounds as Brak-Brak");
			
		}	
	
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Cat an=new Cat();
     Dog d=new Dog();
     an.makeSound();
     an.eat();
     d.makeSound();
     d.eat();

	}

}
