package Core_Java;

public class Arrayobject {
	int rolno; // instance variable
	String name;// instance variable
	float marks;// instance variable
	public static void main(String args[]) {
		Arrayobject s1=new Arrayobject();  // create the object
	s1.rolno = 1;  // assigning the value
	s1.name ="puru";
	s1.marks = 80;
	Arrayobject s2=new Arrayobject();
	s2.rolno = 2;
	s2.name ="Purushoth";
	s2.marks = 80;
	Arrayobject Enum_classs[]= new Arrayobject[2];  // Array will not create the object it will holds the variable reference
	Enum_classs[0] = s1;
	Enum_classs[1] = s2;
	for(int i =0;i<Enum_classs.length;i++) {
		System.out.println("Roll no : "+ Enum_classs[i].rolno+" name : "+Enum_classs[i].name+"         marks : " +Enum_classs[i].marks);
		
	}
	
	

}
}