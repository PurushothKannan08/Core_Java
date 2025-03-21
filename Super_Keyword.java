package Core_Java;

//refer the parent class object(instance)variable
/*public class Super_Keyword { // parent class
	String colour ="White";
}
class Animal extends Super_Keyword{ //Child class
	String colour ="black";
	void printcolour() {
		System.out.println(colour);  // to print the child class variable
		System.out.println(super.colour);// to print the parent class variable by using the super keyword.
	}
}*/


//To invoke parent class method
/*public class Super_Keyword { // parent class
	
	void eat() {
		System.out.println("Parent class eating");
	}
}
class Animal extends Super_Keyword{ //Child class
	void eat() {   //child class method-1
		System.out.println("child class eating");
	}
	void bark() { //child class method-2
		System.out.println("Barking");
	}
	void work() { //child class method-3
		super.eat(); // to invoke the parent class by using the super keyword.
		bark();  // to print the child class method
				
	}
	public static void main(String[] args) {
		Animal p=new Animal();  // creating the object for child class
		p.work(); // it will invoke the child class method
		//p.eat(); // if we want to call the child class eat method
	}
}*/

//To invoke the parent class constructor 
 public class Super_Keyword { // parent class constructor
	Super_Keyword() {	// parent class constructor
		System.out.println("Parent class is created");
		}
}
 class Animal extends Super_Keyword{ //Child class constructor
	Animal(){ //Child class constructor
		//super();// no need to use the super keyword because the "super" is default in constructor
		System.out.println("Animal is created");
	}
	/*public static void main(String[] args) {
		Animal p=new Animal();  // creating the object for child class and constructor call happened automatically 
	}*/
	
}
	
