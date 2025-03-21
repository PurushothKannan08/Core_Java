package Core_Java;

import java.util.*;

public class UserInput_Scanner {

	public static void main(String[] args) {
		
		//Scanner 
		Scanner myObj=new Scanner(System.in); //Create the object for scanner class
		System.out.println("enter the name");
		String name =myObj.nextLine();//read the user input for String
		System.out.println("enter the age");
		int age =myObj.nextInt();//read the user input for int
		System.out.println("enter the Salary");
		double Salary = myObj.nextDouble();//read the user input for double
		System.out.println("name "+name+" age "+age+" Salary "+Salary);
		
		
		
		//Taking input from user through Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");
		int Reversenumber=sc.nextInt();;   // to get the value from the console
		int  reverse=0;  // input for the reverse number
		while(Reversenumber!=0) {  //condition = loop will run till the condition is false
			int remainder= Reversenumber % 10;   //modulus by 10   - it will return the remainder value 
			reverse = reverse*10 + remainder;
			Reversenumber = Reversenumber /10; // divide by 10 - it will remove the last value and return the whole number.
			
		}
		System.out.println("reverse number "+reverse);

	}

}
