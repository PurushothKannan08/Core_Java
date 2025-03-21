package Core_Java;

class Parent {  // parent class or super class
	public void Show1() {
		System.out.println("in Parenet class");
	}
}

class Child extends Parent {// child class or sub class
	void Show2() {
		System.out.println("in Child class");
	}
}

public class Upcasting_Downcasting {
	public static void main(String[] args) {
		//Parent a =(Parent)new Child(); // creating child object with the parent reference // upcasting - the parent class typecasting into the child class
		Parent a =new Child(); // instead above line we can write , because it will implicitly change
		a.Show1();
		if (a instanceof Child) {  // we checking whether the child is present or not
			//Child k = new Child();// creating child object with the child reference 
			Child k = (Child) a;// instead we can use the parent reference variable and typecast to the child class
			k.Show2();
		} else {
			System.out.println("ok");
		}
	}

}
