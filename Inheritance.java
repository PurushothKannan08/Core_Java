package Core_Java;

//single inheritance
 /* public class Inheritance { //Parent class
	void eat() { // parent class method
		System.out.println("parentclass Eating");
	}

}
 class Dog extends Inheritance {  // child or sub class //inheritate parent class
	void bark() {  //child class method
		System.out.println("Barking");
	}
}
class test{  // it should be write another class //for reference we write in same class
public static void main(String[] args) {
	Dog p = new Dog(); // create the object for dog class
	p.bark(); // it access the child class method
	p.eat();// it inherit the parent class method	
}*/
	 


//Multilevel inheritance
 /* public class Inheritance { //GrantParent class
	  void eat() { // parent class method
		System.out.println("parentclass Eating");
	}

}
  class Dog extends Inheritance {  // Parent class  / no need to give the access modifier  //inheritate parent class
	void bark() {  //child class method
		System.out.println("Barking");
	}
}
	class BabyDog extends Dog {  // child or sub class //inheritate parent class
		void Weep() {  //child class method
			System.out.println("Weeping");
}
	}
class test{  // it should be write another class //for reference we write in same class
public static void main(String[] args) {
	BabyDog p = new BabyDog(); // create the object for dog class
	p.Weep();//it access the child class method
	p.bark(); // it inherit the parent class method
	p.eat();// it inherit the grandparent class method
}
}*/
	
	//Hierahical inheritance
    class Inheritance { //GrantParent class
		  void eat() { // parent class method
			System.out.println("parentclass Eating");
		}

	}
	  class Dog extends Inheritance {  // Parent class  / no need to give the access modifier /inheritate parent class
		void bark() {  //child class method
			System.out.println("Barking");
		}
	}
		class BabyDog extends Inheritance {  // child or sub class // inheritate grandparent class
			void Weep() {  //child class method
				System.out.println("Weeping");
	}
		}
		
	/*(class test{  // it should be write another class //for reference we write in same class
	public static void main(String[] args) {
		BabyDog p = new BabyDog(); // create the object for dog class
		p.Weep();//it access the child class method
		//p.bark(); // it inherit the parent class method//CT error because it will only inheritate the grandparent class
		p.eat();// it inherit the grandparent class method
	}
	}*/

