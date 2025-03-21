package Core_Java;

// Autoboxing - primitive data  converting into object 
/*public class Wrapper{
	public static void main (String args[]) {
	int a =20;   //Primitive date variable
	Integer i = Integer.valueOf(a);//autoboxing, int converting  into Integer explicit
	Integer j = a; //autoboxing, compiler will write Integer.valueof(a) internally 
	System.out.println(a+" "+i+" "+j);
	}
	}*/


//Unboxing  -  Object converting into primitive data   - integer is a class it's mainly used for wrapper class
public class Wrapper{
	public static void main (String args[]) {
	Integer a = new Integer(3); // object value
	int i = a.intValue(); //Unboxing,Integer converting into int explicit
	Integer j = a; //Unboxing, compiler will write a.inValue() internally =
	System.out.println(a+" "+i+" "+j);
	}
	}


//call by value concept
/*public class Wrapper{ 
	int data = 50; //instance variable  // instance variable and local variable is different
	void add(int data) {   // datatype  variablename(to get the value from the argument
		data= data+100;  // local variable
		//System.out.println("value from method"+data); for reference 
	}
	public static void main (String args[]) {
		Wrapper op = new Wrapper(); // create the object for class
	System.out.println("before change "+op.data); // print the instance  variable value
	op.add(50);// passing the value to local variable through parameterized constructor
	System.out.println("before change "+op.data);// print the instance  variable value
		}
}*/