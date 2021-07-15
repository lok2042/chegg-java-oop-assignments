package practiceProblems;

public class Holiday {
	
	private String name;
	private int day;
	private String month;
	
	public Holiday(String name, int day, String month) {
		this.name = name;
		this.day = day;
		this.month = month;
	}
	
	// Getters
	public String getName() {
		return name;
	}
	public int getDay() {
		return day;
	}
	public String getMonth() {
		return month;
	}
	
	public boolean isSameMonth(Holiday another) {
		return (month == another.getMonth());
	}
	
	public static double avgDate(Holiday [] holidays) {
		int sum = 0;
		int count = 0;
		for(int i = 0; i < holidays.length; i++) {
			sum += holidays[i].getDay();
			count++;
		}
		return (double) sum / count;
	}
	
	public String toString() {
		return "Holiday[name: " + name + ", day: " + day + ", month: " + month + "]";
	}
	
}

