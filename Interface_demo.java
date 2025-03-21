package Core_Java;

//syntax  / access_specifer interface name 
/* interface Interface_demo { //parent class 1
 * to inherit class to class / interface to interface - extends keyword
 * to inherit interface to class - implements keyword
	
	void print();  // it should only method declaration

}

interface Interface_demo1 { //Parent class 2
	void read();  // it should only method declaration
}
//syntax for implements - childCalss_name implement_keyword interface_name(parent class-1),interface_name(parent class-2)
class Check implements Interface_demo,Interface_demo1{ //child class- it will inheritate 2 parent class by using the interface concept
	public void print() { //parent class-1 method definition
		System.out.println("printing");
	}
	public void read() {//parent class-2 method definition
		System.out.println("Reading");
		}
	void work() {  // child class method definition / it's for our convinient
		print();
		read();
	}
public static void main (String args[]) {
		Check k = new Check();
	    k.read();		
	}
}*/

// we can inherit the interface to interface by using the extends keyword
interface Interface_demo { //parent class 1
	
	void print();  // it should only method declaration

}
interface Interface_demo1 extends Interface_demo { //Parent class 2 // we inherit parent interface using the extends keyword
	void read();  // it should only method declaration
}
class Check implements Interface_demo1{ //child class-  to  inheritate  parent class interface by using the interface concept
	public void print() { //parent class-1 method definition
		System.out.println("printing");
	}
	public void read() {//parent class-2 method definition
		System.out.println("Reading");
		}
	void work() {  // child class method definition / it's for our convinient
		print();
		read();
	}
public static void main (String args[]) {
		Check k = new Check();
	    k.read();		
	}
	
}