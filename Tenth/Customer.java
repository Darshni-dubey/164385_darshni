package com.darshni;

public class Customer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MovieDetailList movieDetailsList=new MovieDetailList();
		movieDetailsList.addMovie(new MovieDetail("Dabang","Salman Khan","Sonakshi Sinha","Action"));
		movieDetailsList.addMovie(new MovieDetail("Zero","Shahruk Khan","Anushka Sharma","Romantic"));
		movieDetailsList.addMovie(new MovieDetail("Tiger","Salman Khan","Katrina","Spy"));
		movieDetailsList.addMovie(new MovieDetail("Dabang2","Salman Khan","Sonakshi Sinha","Action"));
		
		
		System.out.println(movieDetailsList.findMovieByMovieName("Dabang"));
		System.out.println(movieDetailsList.findMovieByGenre("Action"));
		System.out.println(movieDetailsList.removeMovie(new MovieDetail("Dabang2","Salman Khan","Sonakshi Sinha","Action")));
		movieDetailsList.display();
		movieDetailsList.sort("leadActories");
		movieDetailsList.display();
	}
}
