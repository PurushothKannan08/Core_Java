package Core_Java;

public class ControlStatement_ConditionalStatement {
	public static void main (String args[]) {
		
		// if statement
		System.out.println("if statement");
		int a = 10;
		int b= 15;
		if(a+b>20) {   //a+b = 25 >20 we can write directly 
			System.out.println("a+b is greater than 20 ");
			
		//if else statement
			System.out.println("if else statement");
			
		 if(a>b){//condition
			 System.out.println("a is greater than b"); // condition true
		 }
		 else {
			 System.out.println("a is less than b");//condition false
		 }
		}
		
		//if-else if / else if ladder
		System.out.println("if-else if / else if ladder");
		String city = "Kumbakonam";
		if (city == "chennai") {     //condition-1 true execute
			System.out.println("City is chennai");
		}
		else if(city =="thanjavur") { //Condition-1 false it will start
			System.out.println("city is thanjavur");//Condition-2 true
		}
		 else {//Condition 2 false
		    System.out.println(city);
		}
		//nested if statement  we can use multiple if statement 
		System.out.println("nested if statement");
		
		String department = "mechanical,2nd year";
		if (department.endsWith("2nd year")) {//condition-1 true
			if(department.contains("electrical")) {//condition-2 true
				System.out.println("your department is electrical");
			}
			  else {//condition 2 false
				System.out.println("your department is not present");
			}
			 }
		   else  { //condition 1 false
			 System.out.println("your department is "+department);
		 }
		
		//Switch statement
		System.out.println("Switch statement");
		String name = "Purushoth"; // names are case sensitive
		switch(name) { //(expression or executed value
		case "Purushoth": // case-1 if matches with expression value 
			System.out.println("the value is Purushoth");
		
		break;// used to break the case -1 
		case "Purush": //case -2 if matches with expression value 
		 System.out.println("ok");
		 break;// used to break the case -2 
		 
		 default:// if the expression value is not match
		 System.out.println("name not matching");
		
		}
		
		
		
		
		
		
		}	
	}


