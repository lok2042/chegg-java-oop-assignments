public class Main {

	public static void main(String[] args) {
    		Holiday h1 = new Holiday("Independence Day", 4, "July");
		System.out.println(h1);
		
		Holiday h2 = new Holiday("Christmas Day", 25, "December");
		System.out.println(h2);
		
		Holiday h3 = new Holiday("Hanukkah", 1, "December");
		System.out.println(h3);
		
		Holiday h4 = new Holiday("New Year Day", 1, "January");
		System.out.println(h4);
		
		System.out.println(h2.isSameMonth(h3));
		System.out.println(h1.isSameMonth(h4));
		
		Holiday [] holidays = {h1, h2, h3, h4};
		System.out.println(Holiday.avgDate(holidays));


		Movie m1 = new Movie("Casino Royale", "Eon Productions", "PG-13");
		System.out.println(m1);
		
		Movie m2 = new Movie("Avengers", "Marvel Studio");
		System.out.println(m2);
		
		Movie m3 = new Movie("Toys Story 3", "Pixar");
		System.out.println(m3);
		
		Movie [] movies = {m1, m2, m3};
		System.out.println(Arrays.toString(Movie.getPG(movies)));
  }
  
}
