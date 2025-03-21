package Core_Java;

public class ControlStatement_loopingStatement {

	public static void main(String[] args) {
		// for loop
		System.out.println("for loop");
		int sum =0;
		for(int i=1;i<=6;i++) //Initialization;condition;increment or decrement
		{
			sum = sum+i;    // adding the i value and store into the sum variable
			System.out.println(sum);
		}
		System.out.println("sum of first 6 natual number " + sum);  // starts with 1 -  natural number , starts with 0 - whole number
		
		// nested for loop
				System.out.println("Nested for loop");
				
			for(int i=0;i<3;i++) {     //outer loop for Row
				for(int j=0;j<=6;j++) { //outer loop for column
					System.out.print(j);  // print the column value
				}
				System.out.println();   // print the next line post done the inner loop
			}	
				
		// while loop
				System.out.println("Whie loop");
			int k = 1;  //initialization
			while(k<=5) {  // condition
				System.out.println(k); // Execution
			 k++;  //increment
			}
			
		//do while loop
			System.out.println("do Whie loop");
			int m = 2;  //initialization
			do {
				System.out.print("even number is ");
				System.out.println(m); // it should print one time even the condition is false
				m=m+2; //increment/decrement 
			}
			while(m<10);// condition 
		
			//break (jumping statement)
			System.out.println("break (jumping statement)");
			for(int i=0;i<3;i++) {     //outer loop for Row
				for(int j=0;j<=5;j++) { //outer loop for column
					if(j==3) {
						break;  // break the inner loop(because the break statement present in innerloop) when the if condition is true
					}
					System.out.print(j);  // print the column value
				}
				System.out.println();   // print the next line post done the inner loop
			}
			
			//continue (jumping statement)
			System.out.println("Continue (jumping statement)");
			for(int i=0;i<3;i++) {     //outer loop for Row
				for(int j=0;j<4;j++) { //outer loop for column
					if(j==2) {
						continue; // it jumps to the next value when if condition true 
					}
					System.out.print(j);  // print the column value
				}
				System.out.println();   // print the next line post done the inner loop
			}
			
		
			
	}
}


