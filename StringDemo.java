package Core_Java;

public class StringDemo {

	public static void main(String[] args) {
		// Java default data type is "String"|| String is not primitive data type basically it's a class
		// Way of storing values through String
		/*
	    // 1. Literal
		String p = "Developer";  // Store the value inside the double quotation
		//2. new keyword
		char []ch = {'D','e','v','e','l','o','p','e','r'};   
		String k = new String(ch);// Store the value character array and passed the array object
		// or 
		String m = new String("Developer"); // it will create double object and refer one variable.
		
		System.out.println("print the value from Litreal : "+p);
		System.out.println("print the value from newkeyword : "+k);
		System.out.println("print the value from newkeyword : "+m);
		*/
		
		
		System.out.println("String default functions");
		String p = "Developer"; 
		String m = "Purushoth";
		System.out.println(p+m); // to join the two strings value by using + operator
		System.out.println(p.concat(m)); // to join the two strings value by using concat method
		System.out.println(p.charAt(6)); // to fetch the given index character 
		
		/*//CompareTo() - it will compare both strings lexigrapically
		String q = "Java"; 
		String r = "Java";	
		String s = "Javapoint";
		System.out.println(q.compareTo(r));// it will return zero ,both string lengths are equal
		System.out.println(q.compareTo(s));// q string length is less than s , it will return negative value
		System.out.println(s.compareTo(q));//s string length is greater than q , it will return positive value
		*/
		
		/*//contains() - to find whether the given characters are present or not
		String q = "Java"; 
		String r = "java";	
		String s = "Java";
		System.out.println(q.contains(r));  // it will return false - letters are case sensitive
		System.out.println(q.contains(s));  // it will return true - letters are case sensitive
		System.out.println(q.contains("va")); // it will return true - given characters are present
		System.out.println(q.contains("ok")); // it will return false - given characters are not present
        */
		
		
		/*//length - return the value of character count(length)
		String q = "Java"; 
		String r = "Purushoth";
		System.out.println(q.length());  // 4 - return count of present characters
		System.out.println(r.length());   //9-  return count of present characters
        */
		
		 /*//Substring
		String r = "Purushoth";
		System.out.println(r.substring(3, 5)); // starts from index- 3 and ends with before end value || only print 3,4 index value
		System.out.println(r.substring(3)); // starts from index- 3 and fetch entire value of the string
        */
		
		/*//equals() -  to check whether the both strings are equal or not || it will return boolean value
		String q = "JAVA"; 
		String r = "JAVA";
		String s = "java";
		System.out.println(q.equals(r)); // true
		System.out.println(q.equals(s)); // false - case sensitive
		System.out.println(q.equals("JAVA")); // true
		*/
		
		/*//endsWith() - to check whether the string endswith given suffix value  || it will return boolean value
		String s1="Purushoth";
		String s2=new String ("java.com");
		System.out.println(s1.endsWith("th"));//true
		System.out.println(s1.endsWith("Th")); // false , value is same but the case sensitive
		System.out.println(s2.endsWith(".com")); // true
		*/
		
		/*//equalsIgnoreCase() - to check the both string value is same or not || it will return boolean value
		String q1 = "JAVA"; 
		String r1 = "JAVA";
		String s3 = "java";
		System.out.println(q1.equalsIgnoreCase(r1));// true  value and case sensitive is same
		System.out.println(q1.equalsIgnoreCase(s3));// true  value is same and case sensitive is not same|| it will not consider the case sensitive
		*/
		
		/*// fortmat()  - returns the formated string 
		double  k = 987.8998;
		String l = String.format("%.2f", k); //0.3 denotes the precision (point value) | % to display the literal("")
		System.out.println("with decimal value " +l);
		String u = String.format("%#.0f", k); //# - no decimal point value but decimal point will print | % to display the literal("")
		System.out.println("decimal point only "+u);
		int  n = 987;
		String s = String.format("%010d", n); //(prefix)0 will print before the value for remaining value int ( int n -10)| % to display the literal("")
		System.out.println(s);
		String z = String.format("% 10d", n); // (prefix)space will print before the value for remaining value int ( int n -10)| % to display the literal("")
		System.out.println(z);
		String x = String.format("%-10d", n); // (suffix)space will print after the value for remaining value int ( int n -10)| % to display the literal("")
		System.out.println(x);
		String y = String.format("%-10d %2$s", n,"love"); // (suffix)space will print after the value for remaining value int ( int n -10), string argument will print after the space| % to display the literal("")
		System.out.println(y);
		*/
		
		
		/*// indexof() - to return the index value to specify the char or string occurrence
		String z = "java always java";
		System.out.println(z.indexOf('v'));   // to fetch the index value for the given char value
		System.out.println(z.indexOf('v',2)); // to fetch the index value of the char occurrence from the given index value 
        System.out.println(z.indexOf("va"));  // to fetch the index value for the given substring
        System.out.println(z.indexOf("va",3)); // to fetch the index value of the substring occurrence from the given index value
        */
		
		
		/*// isEmpty() - to check the given input string is empty or not \ return the boolean value
		String empty = ""; // true
		String empty1 = " ";// false - white space also calculate
		String value = "Java"; // false - string is present
		System.out.println(empty.isEmpty());
		System.out.println(empty1.isEmpty());
		System.out.println(value.isEmpty());
       */
		
		/*//join() - to join the string with delimiter
		String value = "Java";
		String value2 = "python";
		System.out.println(value.join("-", value,value2));// join the two strings with delimiter |passing the string object
		System.out.println(value.join("-","Java","python","c")); //join the two strings with delimiter | using the literal way
		*/
		
		/*//replace() - to replace the value
		String re = "the java is good";
		System.out.println(re.replace("is","was"));// is - existing string  was - replace the value
		System.out.println(re.replace('a','k'));// a - existing char  k - replace the value
		System.out.println(re.startsWith("th"));// return the boolean value whether the input value as prefix
		System.out.println(re.endsWith("e"));// return the boolean value whether the input value as suffix
	     */
		
		
		/*//Split() - to split the string against the given regex expression 
		String sp="the,java is good programming language";
		//String words[]= sp.split("\\s"); // \\s - whitespace - String passed into the array
		//for(String k :words) {
		for(String k:sp.split("\\s")) // no need to create array object explicit
		{   
			System.out.println(k);
		}*/
		
		
		String sp="the,JAVA is GOOD programming language";
		System.out.println(sp.toLowerCase());
		System.out.println(sp.toUpperCase());
				
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
