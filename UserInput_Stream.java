package Core_Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput_Stream {

	public static void main(String[] args) throws IOException
	{
		int a;  //variable declaration
		float b,c;//variable declaration
		InputStreamReader read= new InputStreamReader(System.in); // to read the user input
		BufferedReader key = new BufferedReader(read); // Temporary memory and it store the keybuffer value
		System.out.println("enter the 1 st number");//Stream default datatype is String
		
		a= Integer.parseInt(key.readLine()); // type casting the datatype(String to int) through wrapper class function(parse)
		System.out.println("enter the 2nd number");
		b= Float.parseFloat(key.readLine());// type casting the datatype (String to float) through wrapper class function(parse)
		c=a+b;
		System.out.println("Addition is " +c);
		//Syntax for type casting - Integer.parseInt(key.readLine())
		//Integer - give the datatype to which datatype needs to be convert(typecasting)
		//parseInt- wrapperclass_function(parse+datatype_first letter should be capital
		//key.readLine() - buffered_Reader object.readline());	 readline() - default function to read the user input	
	}

}
