
public class swapVariables {

	public static void main(String[] args) {

		int a = 23;
		int b = 25;
		System.out.println("  Before swapping first statement will be this a =" + a + " b = " + b);
		/*invoke swap method, the values will be same, first step is it considers the method calling then it comes here */
		swapFunction(a,b);
	System.out.println("printing this will give same a and b no change in it, but this will be last stmt cause swap method is invoked");
	}

	private static void swapFunction(int a, int b) {
		System.out.println(" before swapping second prints  a =" + a + " b = " + b);
		int c = a;
		a=b;
		b=c;
		System.out.println("After Swapping a =" + a + " b = " + b);
		
		
	}

}
