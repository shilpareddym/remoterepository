
public class MinNumber {
		   
		   public static void main(String[] args) {
		      int a = 11;
		      int b = 6;
		      System.out.println("there is no change in a and b values a = " + a + " b = " + b);
		      int c = minFunction(a, b); // invoking a method
		      System.out.println("print min value from a & b = " + c);
		   }

		private static int minFunction(int a, int b) {
			int min;
			if(a>b)
			min=b;
			else
				min=a;
			
			
			return min;
		}

		
		 
		  
		   
		}


