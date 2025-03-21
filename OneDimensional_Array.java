package Core_Java;

import java.util.Scanner;

public class OneDimensional_Array {

	//traverse the array
	/*public static void main(String[] args) {
	 int a[] = new int[5];//declaration and instantiation
	 a[0]=10;// Initialization and assigning the value
	 a[1]=89;
	 a[2]=30;
	 a[3]=60;
	 a[4]=45;
	 for (int i=0;i<a.length;i++) { // length us the property of array
		System.out.println("index of "+i+" is "+a[i]); 
	 }
		}*/
	
	//Single line of code
	/*public static void main(String[] args) {
		int a[] = {10,89,30,60,45};//declaration,instantiation,Initialization and assigning the value
		for (int i=0;i<a.length;i++) { // length us the property of array
			System.out.println("index of "+i+" is "+a[i]); 
		 }
			}*/
	
	//Taking input from user
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // using the scanner class for taking input from user
		int a[]= new int[5]; // declare and instantiation
		for (int i=0;i<a.length;i++) { // using the loop because it continuous process
			System.out.println("Enter the "+i +" element");
			 a[i]= sc.nextInt(); // read the user input 
			}
		for (int i=0;i<a.length;i++) { // length us the property of array
			System.out.println("index of "+i+" is "+a[i]); 
		 }
			}

}
