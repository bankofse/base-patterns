import java.util.ArrayList;

public class SpecialCase extends NormalCase{
	private String name;
	
	public SpecialCase(String name){
		this.name = name;
	}
	
	public String toString(){
		return name + ": deceased\n";
	}
	
	public static void main(String[] args){
		ArrayList<NormalCase> customers = new ArrayList<NormalCase>();
		for(int i = 0 ; i < args.length ; i += 2){
			String name = args[i];
			int age = Integer.valueOf(args[i+1]);
			NormalCase newCustomer;
			if(age == -1){
				newCustomer = new SpecialCase(name);
			}else{
				newCustomer = new NormalCase(name, age);
			}
			customers.add(newCustomer);
		}
		for(int i = 0 ; i < customers.size() ; i++){
			System.out.println(customers.get(i).toString());
		}
	}
	
}
