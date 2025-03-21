package Core_Java;

//final variable - can not change the variable value

/*public class Final_Keyword {
 	 final int Speed = 100;  //instance variable
		  void run() { //method definition
			Speed = 120; //Local variable
			System.out.println(Speed);
		  }

	public static void main(String[] args) {
		Final_Keyword p = new Final_Keyword(); // creating the object
		p.run();//to invoke the run method
	}
    //output - The final field Final_Keyword.Speed cannot be assigned
}*/



// Final method  - can not over-riding the method

/*public class Final_Keyword { //parent class 
	final void run() { //parent class method as a final /method definition 			
			System.out.println("Parent bike is running");
		  }
}
class Honda extends Final_Keyword {//child class
	void run() { //child class method /method definition 				
		System.out.println("Honda bike is running");
	  }
	
}

	/*public static void main(String[] args) {
		Honda p = new Honda(); // creating the object
		p.run();//to invoke the run method
	}*/
//output -CT error -  IncompatibleClassChangeError: class Core_Java.Honda overrides final method Core_Java.Final_Keyword.run()


//Final class - can not inherit the parent class

/*final public class Final_Keyword { //parent class as a final
	 void run() { //parent class method definition 			
			System.out.println("Parent bike is running");
		  }
}
class Honda extends Final_Keyword {//child class
	void run() { //child class method definition 				
		System.out.println("Honda bike is running");
	  }
	
}
public static void main(String[] args) {
		Honda p = new Honda(); // creating the object
		p.run();//to invoke the run method
		
		// output - compilation problem:The type Honda cannot subclass the final class Final_Keyword
	}*/
