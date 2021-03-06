public class ValueObject {
	private DatePair start;
	private DatePair end;
	
	public ValueObject(int startMonth, int startDay, int endMonth, int endDay){
		start = new DatePair(startMonth, startDay);
		end = new DatePair(endMonth, endDay);
	}
	
	public DatePair getStart(){
		return start;
	}
	
	public DatePair getEnd(){
		return end;
	}
	
	public String toString(){
		return "Begins: " + start.toString() + "\nEnds: " + end.toString() + "\n";
	}
	
	public boolean equals(ValueObject other){
		if((this.start.equals(other.start)) & (this.end.equals(other.end)))
			return true;
		return false;
	}
	
	public static void main(String[] args){
		ValueObject dr = new ValueObject(0, 1, 4, 31);
		System.out.println(dr.toString());
	}
}
