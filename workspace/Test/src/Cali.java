
public class Cali {
	//instance, local, static are printed from the given order in main method
int a =10;
int b = 30;
void add()
{
	
	System.out.println(a+b);
}
	
static void m1(){
 int g = 355;
System.out.println(g);
}
	public static void main(String[] args) {
		Cali c = new Cali();
		c.add();
		int d= 35;
		String s = "hello";
		float f =30.5f;
		System.out.println(d);
		System.out.println(f);
		System.out.println(s);
		c.m1();
		
	}

}
