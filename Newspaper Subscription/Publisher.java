public class Publisher {
	
	private Newspaper [] newspaperList;
	private int newspaperCount;
	private final int MAXNEWSPAPER = 4;
	
	public Publisher() {
		newspaperList = new Newspaper[MAXNEWSPAPER];
		newspaperCount = 0;
	}
	
	public boolean addNewspaper(Newspaper newspaper) {
		if(newspaperCount == MAXNEWSPAPER) {
			return false;
		}
		else {
			newspaperList[newspaperCount] = newspaper;
			newspaperCount++;
			return true;
		}
	}
	
	public boolean changeNewspaper(String name, float newRate) {
		for(int i = 0; i < newspaperCount; i++) {
			if(newspaperList[i].getName().equals(name)) {
				newspaperList[i].setRatePerMonthPrint(newRate);
				return true;
			}
		}
		return false;
	}
	
	public boolean removeNewspaper(String name) {
		for(int i = 0; i < newspaperCount; i++) {
			if(newspaperList[i].getName().equals(name)) {
				for(int j = i; j < newspaperCount - 1; j++) {
					newspaperList[j] = newspaperList[j + 1];
				}
				newspaperCount--;
				return true;
			}
		}
		return false;
	}
	
	public Newspaper searchNewspaper(String name) {
		for(int i = 0; i < newspaperCount; i++) {
			if(newspaperList[i].getName().equals(name)) {
				return newspaperList[i];
			}
		}
		return null;
	}
	
	public void displayNewspaperList() {
		for(int i = 0; i < newspaperCount; i++) {
			System.out.println((i+1) + ". " + newspaperList[i]);
		}
	}
	
}
