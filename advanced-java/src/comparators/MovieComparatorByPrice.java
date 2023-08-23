package comparators;

import java.util.Comparator;

import comparables.Movie;

public class MovieComparatorByPrice implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		if(o1.getPrice() > o2.getPrice()) {
		return  1;
		}else if(o1.getPrice() < o2.getPrice()) {
			return -1;
		}else{
			return 0;
		}
	}
	
}
