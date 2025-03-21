package Core_Java;

public class Operator {
	
	public static void main(String[] args) {
    //Arithmetic operator
		System.out.println("Arithmetic operator");
		int a = 20;
		int b = 10;
		System.out.println("addition value is "+ (a+b));
		System.out.println("subtraction value is "+ (a-b));
		System.out.println("Multiplication value is "+ (a*b));
		System.out.println("division value is " + (a/b));
		System.out.println("modulus value is " + (a%b));
		
	 // Assignment Operator
		System.out.println("Assignment Operator");
		int c = 10;
		int d = 20;
		c+=4;// c = c+4 / 10+4 = 14
		d-=4;//d = d-4 / 20-4 = 16
		System.out.println(c);
		System.out.println(d);
		
  // Relational operator - it will return only boolean value
		System.out.println("Relational operator");
		int e =10,f=13; // create multiple variable by using comma but it should having same data type
		System.out.println("e value is " +e+  " f value is " +f); // merge the two output by using plus symbol
		System.out.println(e==f); // ==  equal operator
		System.out.println(e!=f);  // != not equal operator
		System.out.println(e>f); // >greater than 
		System.out.println(e>=f); // >greater than or equal to
		System.out.println(e<f); // >less than 
		System.out.println(e<=f); // >less than or equal to
		
	//Logical operator
		System.out.println("Logical operator");
		System.out.println((3>5)&&(5>8));// And operator- false
		System.out.println((3<5)&&(5<8));// And operator- true
		System.out.println((3>5)||(5<8));// OR operator true
		System.out.println((3<5)||(5<8));// OR operator true
		System.out.println(!(5>3));// NOT operator - false - it supposed to be true  but we are using NOt operator so false
		System.out.println(!(5==7));// NOT operator - true - it supposed to be false  but we are using NOt operator so true
   
	//Ternary operator
		System.out.println("Ternary operator");
		int g = 5;
		int h = 10;
		int minimum = g<h?g:h; // g<h - relational operator ? -ternary operator  first value:second value  true first value ,false - second value
		int maximum = g>h?g:h;
		System.out.println(minimum);
		System.out.println(maximum);
		
	 // unary operator / increment or decrement operator
		System.out.println("unary operator / increment or decrement operator");
		
		int i = 10;
		System.out.println(i++);//post increment  output = 10 in memory 11
		System.out.println("memory"+i);
		System.out.println(++i);//pre increment output 12 , i value-> 11+1 = 12
		System.out.println(--i);//Pre decrement output 11 , i - 12 , 12-1=11
		System.out.println(i--); // post decrement output 11 ,in memory 10
		System.out.println("memory"+i);
		
	}
}

