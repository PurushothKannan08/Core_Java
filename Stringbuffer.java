package Core_Java;

public class Stringbuffer {

	public static void main(String[] args) {
		
		/*// append() - to concates the given arguments with the existing string
		StringBuffer sb = new StringBuffer("Hello"); // create the object and add the value through literal
		sb.append(" Java");  // To add the value after the existing string and store in memory
		System.out.println(sb);
	    */
		
		/*//insert() - to insert the given string at the given position
		StringBuffer sb = new StringBuffer("Hello"); // create the object and add the value through literal
		sb.insert(3,"Java");  // To insert the value with the given index and existing string will rightshifted
		System.out.println(sb);
		*/
		
		
		/*//replace() - to replace the string to the specified the start and end index
		StringBuffer sb = new StringBuffer("Hello Java"); // create the object and add the value through literal
		sb.replace(1, 4, "Java"); // To replace the given string with help of starting and end index || only end index value not considered
		System.out.println(sb);
		*/
		
		/*//delete() - delete the string for the specified the start and end index
		StringBuffer k = new StringBuffer("Java");
		k.delete(0, 2);// to delete the string with help of start and end index value
		System.out.println(k);
		*/
		
		/*// reverse() = reverse the string
		StringBuffer k = new StringBuffer("Java");
		k.reverse();// to reverse the string and stored the value
		System.out.println(k);
		*/
		
		/*//capacity() - to returns the current capacity (memory) of the buffer
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());// default value is 16 bytes which mean it holds the 16 characters
		sb.append("Java is theokljk");  // length is 16
		System.out.println(sb.capacity());
		sb.append("language ");  // adding the 8 character and it will swap the next limit (old capacity*2)+2
		System.out.println(sb.capacity());//capacity value is 34
		*/
		
		//ensureCapacity() - to ensure the capacity size if the ensurecapacity is greater than current capacity it will automatically increase the nearest upper limit 
		StringBuffer sb = new StringBuffer();
		System.out.println("default "+ sb.capacity());
		sb.ensureCapacity(30); // to ensure the capacity is 30 , as per the formula the capacity has increased | (old capacity*2) +2 = (16*2)+2=34
		System.out.println("automatically change the capacity "+ sb.capacity());
		
		
		
	}

}
