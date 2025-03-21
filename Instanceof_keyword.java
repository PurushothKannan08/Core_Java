package Core_Java;



public class Instanceof_keyword {

	public static void main(String[] args) {
		Instanceof_keyword k = new Instanceof_keyword();  // creating the object for the same class
		Wrapper l = new Wrapper();  // creating the object for the different class
		//System.out.println(variable_name instanceof Class_name); //syntax  / instanceof - keyword
		System.out.println(k instanceof Instanceof_keyword);  //to check whether the object is created for the given class or not
		//System.out.println(k instanceof FirstProgram);  
// it will return boolean value (true only) if the condition is false it will throw the compile time error
	}

}
