package com.xworkz.toString.movie;

public class MovieRunner {
    public static void main(String[] args) {
        MovieDto movie = new MovieDto();
        movie.setTitle("KGF");
        movie.setGenre("Action");
        movie.setReleaseYear(2021);
        movie.setDirector("Neel");
        movie.setDurationMinutes(148);

        System.out.println(movie);
    }
}
