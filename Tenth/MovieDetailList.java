package com.darshni;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class MovieDetailList {

	ArrayList<MovieDetail> movies;

	public MovieDetailList() {
		super();
		if(movies==null)
			movies=new ArrayList<MovieDetail>();
	}
	
	public boolean addMovie(MovieDetail movie){
		
		return movies.add(movie);
		
	}
	
	public boolean removeMovie(MovieDetail movie){
		return movies.remove(movie);
	}
	
	public void removeAllMovies(){
		movies.clear();
		
	}
	
	public void sort(String type) {
	
		Collections.sort(movies, new Comparator<MovieDetail>() {

			@Override
			public int compare(MovieDetail arg0, MovieDetail arg1) {
				
				if(type.equals("genre"))
					return arg0.getGenre().compareTo(arg1.getGenre());
				else if(type.equals("leadActor"))
					return arg0.getLeadActor().compareTo(arg1.getLeadActor());
				else if(type.equals("leadActories"))
					return arg0.getLeadActories().compareTo(arg1.getLeadActories());
				else
					return arg0.getMovieName().compareTo(arg1.getMovieName());
					
			}
		});
	}
	
	
	public String findMovieByMovieName(String movieName){
		
		Iterator<MovieDetail> iterator= movies.iterator();
		
		while(iterator.hasNext()){
			
			MovieDetail movieDetail=iterator.next();
			if(movieName.equals(movieDetail.getMovieName()))
				return movieDetail.toString();
		}
		return null;
	}
	
public String findMovieByGenre(String genre){
		
		Iterator<MovieDetail> iterator= movies.iterator();
		String allMovies="";
		while(iterator.hasNext()){
			MovieDetail movieDetail=iterator.next();
			if(genre.equals(movieDetail.getGenre()))
				allMovies+="\n"+ movieDetail.toString()+"\n";
		}
		return allMovies;
	}
	
	public void display() {

		Iterator<MovieDetail> iterator= movies.iterator();
	
		while(iterator.hasNext()){
			MovieDetail movieDetail=iterator.next();
			System.out.println(movieDetail.toString()+"\n");
		}
	}
}
