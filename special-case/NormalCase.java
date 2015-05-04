
public class NormalCase{
	private String name;
	private int age;
	
	public NormalCase(){
		this.name = "";
		this.age = 0;
	}
	
	public NormalCase(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString(){
		return name + ": " + Integer.toString(age) + "\n";
	}
	
}
