package Core_Java;

public class TypeCasting {

	public static void main(String[] args) {
		int  a = 10;
		double b = a;//Widening casting or implicit or automatic casting
		
		System.out.println("int value " + a);
		System.out.println("after typecasting (converted into double " + b);
		
		double c = 10.67d;
		int d = (int)c;//Narrowing casting or explicit or manual casting
		System.out.println("double value " + c);
		System.out.println("after typecasting (converted into int " + d);

	}

}
