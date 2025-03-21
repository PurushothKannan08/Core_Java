package Core_Java;

import java.util.Scanner;

public class Constructor {
	  int id;     //Variable declaration 
	  String name;//Variable declaration
	  int age;//Variable declaration
	  
	//Default Constructor
	 
		/*public Constructor() {   // Constructor  - class name and method name should same
			id =101;
			name = "Purushoth";
			//Scanner sc = new Scanner(System.in); // taking user input
			//System.out.println("Enter Name");
			//name = sc.nextLine();   //Read the user input
			//System.out.println("Enter ID");
			//id = sc.nextInt(); //Read the user input
					
		}	
		void display() { // it is the method definition
			System.out.println("Name is "+name +" id is "+id);
		}

		public static void main(String[] args) {
            System.out.println("default constructor");
			Constructor p = new Constructor();  //  default constructor create the object for the Constructor class and constructor method has called
			p.display(); // invoking the method (method calling) or method declaration
			
		}*/

	// Parameterized constructor
		
	/*public Constructor(int r,String n) { 
		name =n;// Argument/parameter is temporary holding value so that assigning to the variable
		id=r; // Argument/parameter is temporary holding value so that assigning to the variable
	}

	
	void display() { // it is the method definition
		System.out.println("Name is "+name +" id is "+id);
	}

	public static void main(String[] args) {
		System.out.println("parameterized constructor");
		Constructor p = new Constructor(12,"Purushoth");// parameterized constructor
		p.display(); // invoking the method (method calling) or method declaration
		}*/
		
		//Constructor Overloading
		/*public Constructor(int p,String k,int r) {
			id=p;
			name=k;
			age=r;
		}
		public Constructor(int p,String k) {
			id=p;
			name=k;
			
		}
		void display() {
			System.out.println("id "+id+" name "+name+" Age "+age );			
		}
		public static void main(String[] args) {
			Constructor p=new Constructor(2,"Purushoth",22);
			Constructor p1=new Constructor(4,"Checking");
			p.display();
			p1.display();
		
		}*/
	  
	  //Copy constructor
	  
	  public Constructor(int p,String k,int r) {
			id=p;
			name=k;
			age=r;
		}
		public Constructor(Constructor p) {   //Constructor-passing the object to the constructor
			id=p.id;   //we can access the variable
			name=p.name;
		}
		void display() {
			System.out.println("id "+id+" name "+name+" Age "+age );			
		}
		public static void main(String[] args) {
			Constructor p=new Constructor(2,"Purushoth",22);
			Constructor p1=new Constructor(p);   // passing the constructor  through the object
			p.display();
			p1.display();
		
		}
}
	