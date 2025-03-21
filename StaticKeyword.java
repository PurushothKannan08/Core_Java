package Core_Java;

public class StaticKeyword {
	/*int id; //instance variable
	String name;//instance variable
	static String college = "AEC"; //Static variable

	StaticKeyword (int p,String k) {
		id=p;
		name=k;
	}
	void display() {
		System.out.println("id "+id+" name "+name+" college "+ college );			
	}
	

	public static void main(String[] args) {
		StaticKeyword p1 = new StaticKeyword(21,"Purushoth");
		StaticKeyword p2 = new StaticKeyword(21,"Purushoth1");
		p1.display();
		//p2.college ="Love"; // not used to access with the object , it will work with warning message
		StaticKeyword.college="AVC";
		p2.display();
	}*/
		
		static int cube(int x)   // Static method
		{
			return x*x*x;  // it will return the  result where the method calling
		}
		public static void main(String[] args) {
			int Calculate = StaticKeyword.cube(5);  // input the value by the access through class name
			System.out.println(Calculate);
			
			
		}
				
		

	}

