
public class Encapsulation {
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main (String[] args){
		
		Encapsulation encp = new Encapsulation();
		encp.setName("Mareddy");
		encp.setAge(27);
		System.out.println(" Name : " +  encp.getName()  +  " Age : "+  encp.getAge());
		
	}

}
