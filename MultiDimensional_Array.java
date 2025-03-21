package Core_Java;

public class MultiDimensional_Array {

	public static void main(String[] args) {
		
		//1.Multidimensional Array - Way1
		
		/*System.out.println("Multidimensional Array - Way1");
		int arr[][]= {{1,2,4},{4,4,9},{9,2,4}};  // to initialize and declare the value
		//System.out.println(arr.length);
		 for(int i=0;i<arr.length;i++) {  // loop for  row
			 //System.out.println("array i "+arr[i].length);
				for(int j=0;j<arr[i].length;j++) { // loop for  column
					//System.out.println("array j "+arr[j].length);
					 System.out.println(arr[i][j]);  // to print the value
				}
				System.out.println(); // to print the new line
			 }*/
		
		//2.Multidimensional Array - Way1 || enhanced loop
		
		/*System.out.println("Multidimensional Array - Way1 || enhanced loop");
	       /*int multi[][]= {{1,2,4,7},{4,4,9},{9,2,4}}; // array length is not equal || to initialize and declare the value
	         for(int k[]:multi) {  // for each loop - to fetch the element from the arr[][] and stored in k[]
		    for(int s:k) {    //for each loop - to fetch the element from the k[] and passed to the variable
				 System.out.print(s);
			}
			System.out.println();
		 }*/
		
		
		//3.Multidimensional Array - Way2
		
		/*System.out.println("Multidimensional Array - Way2");  // array default value is "0"
		int arr[][]= new int[3][4];  // to initialize and declare the value
		//System.out.println(arr.length);
		 for(int i=0;i<arr.length;i++) {  // loop for  row
			 //System.out.println("array i "+arr[i].length);   // length count from 1 
				for(int j=0;j<arr[i].length;j++) { // loop for  column  
					//System.out.println("array j "+arr[j].length);
					 System.out.print(arr[i][j]);  // to print the value
				}
				System.out.println(); // to print the new line
			 }*/
		
		//4. 2-dimensional Array || generate the random value
		
		/*System.out.println("2 dimensional Array || generate the random value");
		int arr[][]= new int[3][4];  // Initialize the value
		 for(int i=0;i<arr.length;i++) {  // for row 
				for(int j=0;j<arr[i].length;j++) { // for column
					 arr[i][j]= (int)(Math.random()*10);  /// to assign the value through Random function and random function only return float value.
					 
					System.out.print(arr[i][j] +" ");// to print the value
				}
		 }
		 System.out.println(); // for print next line
		System.out.println("To print the value through the Enhance loop"); // Highlighting the topic
		 for(int p[]:arr) {  // to fetch the value from arr[] and stored in p[]
			 for(int k:p) {  // to fetch the value from p[] and stored in k
				 System.out.print(k +" ");  //to print the k value
				 
			 }
			 System.out.println();
		 }*/
		
		
		//5. Jagged Array-forloop
		 
		 /*System.out.println("Jagged Array-forloop");
		 int arrs[][]= {{1,2,4,6,5},{4,4,9},{9,2,4}};  // to initialize and declare the value
			//i for row, J for column
			 for(int i=0;i<arrs.length;i++) {  // loop for  row  arr_for.length count the overall array length 
				System.out.println("arr[i] "+ arrs[i].length);	// to print the length of i(index) of array length
				 for(int j=0;j<arrs[i].length;j++) { // loop for column arr_for[i].length count the i index array.
						 System.out.print(arrs[i][j]);  // to print the value
					}
					System.out.println(); // to print the new line
				 }*/
		
		//6.Jagged Array-enhancedloop
		
		System.out.println("Jagged Array-enhancedloop");
		 int arrs[][]= {{1,2,4,6,5},{4,4,9},{9,2,4}};  // to initialize and declare the value
			for(int k[]:arrs){
			for (int s:k){
			 System.out.print(s+" "); 
				 }
			System.out.println();
				 }
		
		
		 //7. 3-dimensional Array || generate the random value
			
		 /*System.out.println("3 dimensional Array || generate the random value");
			int arr[][][]= new int[2][2][2];  //to Initialize 
			for(int i=0;i<arr.length;i++) {  // for row
				 for(int j=0;j<arr[i].length;j++) {//for column
					for(int k=0;k<arr[i][j].length;k++) { //inner box
						 arr[i][j][k]= (int)(Math.random()*10);  // to assign the random value
						System.out.println(i+" , "+j+" , "+k+"    "+arr[i][j][k]+"  value "); //print the assigned value
					}
				
				 }
			 }
			System.out.println(); // for print next line
			System.out.println("To print the value through the nested for loop"); // Highlighting the topic
			for(int i=0;i<arr.length;i++) {  // for row
				 for(int j=0;j<arr[i].length;j++) {//for column
					for(int k=0;k<arr[i][j].length;k++) { //inner box 
						System.out.print(+arr[i][j][k]+"  "); //print the assigned value
					}
				 }
				 System.out.println();
			 }
			 /*System.out.println(); // for print next line
			System.out.println("To print the value through the Enhance loop"); // Highlighting the topic
			 for(int p[][]:arr) {  // to fetch the value from arr[][][] and stored in p[][]
				 for(int k[]:p) {  // to fetch the value from k[][] and stored in p[][]
					 for(int s:k) { // to fetch the value from k[] and stored in s
					 System.out.print(s +"  ");  //to print the s value
					 
				 }
						 
					 }
				 System.out.println();
					 }*/
			 
				
			 }
		
	}
	
	



       
       
       
       
       
       


	




