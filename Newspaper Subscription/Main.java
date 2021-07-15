public class Main {
  
  public static void main(String[] args) {
    	Newspaper n1 = new Newspaper("Today's News", "English", 34.9f);
	Newspaper n2 = new Newspaper("Berita Hari", "Malay", 45.9f); 
	Newspaper n3 = new Newspaper("Zao Pao", "Chinese", 47.5f); 
	Newspaper n4 = new Newspaper("Inru ceyti", "Tamil", 47.9f);
		
	System.out.println(n1 + "\n" + n2 + "\n" + n3 + "\n" + n4 + "\n");
		
	Subscription s1 =  new Subscription("Peter", "42 Simei Drive", 96667878, n1, false);
	Subscription s2 =  new Subscription("John", "12 Clementi Road", 98769876, n1, true);
		
	System.out.println(s1 + "\n" + s2 + "\n");
		
	s1.changeVersion();
	s2.changeVersion();
		
	System.out.println(s1 + "\n" + s2 + "\n");
		
	Publisher p1 = new Publisher();
		
	System.out.println(p1.addNewspaper(n1));
	System.out.println(p1.addNewspaper(n2));
	System.out.println(p1.addNewspaper(n3));
	System.out.println(p1.addNewspaper(n4));
		
	p1.displayNewspaperList(); 
  }
}
