package Core_Java;

public class recursion {
	 public static void main(String[] args) {
		    int result = sum(3);
		    System.out.println(result);
		  }
		  public static int sum(int k) {
		    if (k > 0) {
		    	System.out.println(k);
		      return k + sum(k - 1);
		    } else {
		      return 0;
		    }
		  }
}
