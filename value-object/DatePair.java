public class DatePair {
	public int month;
	public int day;
	
	public DatePair(int month, int day){
		this.month = month;
		this.day = day;
	}
	
	public boolean equals(DatePair other){
		if((this.month == other.month) & (this.day == other.day))
			return true;
		return false;
	}
	
	public String toString(){
		String result = "";
		if(month == 0)
			result += "January, ";
		else if(month == 1)
			result += "February, ";
		else if(month == 2)
			result += "March, ";
		else if(month == 3)
			result += "April, ";
		else if(month == 4)
			result += "May, ";
		else if(month == 5)
			result += "June, ";
		else if(month == 6)
			result += "July, ";
		else if(month == 7)
			result += "August, ";
		else if(month == 8)
			result += "September, ";
		else if(month == 9)
			result += "October, ";
		else if(month == 10)
			result += "November, ";
		else if(month == 11)
			result += "December, ";
		result += Integer.toString(day);
		return result;
	}

}
