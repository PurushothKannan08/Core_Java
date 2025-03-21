package Core_Java;

public class ThisKeyword {
	
	
	
//1.refer current class object/variable
	/*int a=10;  //Instance variable
	void add(int a) {     // parameter constructor a value and instance variable is different
		this.a =this.a+20;   //it's refer to the current variable
		a=a+20;     //Local variable
		System.out.println(this.a);
		System.out.println(a);
	}

	public static void main(String[] args) {
		ThisKeyword k= new ThisKeyword();
		k.add(20);
	}*/

//2.To invoke the current class method by using this keyword
	/*void m() {
		System.out.println("M is invoked");
	}
	void p() {
		this.m();   // to invoke the current class method . it should first line of code inside the method definition.
		System.out.println("p method calling");
	}
	public static void main(String[] args) {
		ThisKeyword k= new ThisKeyword();
		k.p();
	}*/
	
	//3.To invoke the current class constructor by using the this keyword.
	
	/*ThisKeyword(){  //default constructor
		System.out.println("Hello default constructor");
	}
	ThisKeyword(int x){  // Parameterized constructor
		this();	  // to invoke the current class constructor . no need to refer the class name
		System.out.println("Hello Parameterized constructor");
	}
	public static void main(String[] args) {
	ThisKeyword k = new ThisKeyword(5);  // to create the object for class and automatically called the  parameterized constructor
	}*/
	
	//4.To passed as argument in the constructor call by using the this keyword.
	/*ThisKeyword(){  //default constructor
		this(5);//To passed as argument in the constructor call.it will redirect to the parameterized constructor
		System.out.println("Hello default constructor");
	}
	ThisKeyword(int x){  // Parameterized constructor
		System.out.println("Hello Parameterized constructor");
	}
	public static void main(String[] args) {
	ThisKeyword k = new ThisKeyword();  // to create the object for class and automatically called the constructor
	}*/
	
	//5.To passed as argument in the method by using the this keyword.
	void m(ThisKeyword love) {    // (class name object) object - k is passed as the parameter and it's user defined name
		System.out.println("M is invoked");
	}
	void p() {
		m(this);   //To passed as argument in the method by using the this keyword
		System.out.println("p method calling");
	}
	public static void main(String[] args) {
		ThisKeyword k= new ThisKeyword(); // create the object for the class
		k.p();  // call the method p
		
		}
	
}
