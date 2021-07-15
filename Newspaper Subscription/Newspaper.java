package practiceProblems;

public class Newspaper {
	
	private String name;
	private String language;
	private float ratePerMonthPrint;
	
	public Newspaper(String name, String language, float ratePerMonthPrint) {
		this.name = name;
		this.language = language;
		this.ratePerMonthPrint = ratePerMonthPrint;
	}

	public String getName() {
		return name;
	}

	public String getLanguage() {
		return language;
	}

	public float getRatePerMonthPrint() {
		return ratePerMonthPrint;
	}
	
	public float getRatePerMonthOnline() {
		return 0.5f * ratePerMonthPrint;
	}

	public void setRatePerMonthPrint(float ratePerMonthPrint) {
		this.ratePerMonthPrint = ratePerMonthPrint;
	}
	
	public String toString() {
		return "Name: " + name + ", Language: " + language + 
			   ", Current Rate Print: $" + ratePerMonthPrint + "/mth, Online: $" + this.getRatePerMonthOnline() + "/mth"; 
	}
	
}
