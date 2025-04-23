package com.xworkz.toString.movie;

public class MovieDto {
    private String title;
    private String genre;
    private int releaseYear;
    private String director;
    private int durationMinutes;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    @Override
    public String toString() {
        return "MovieDto :-" +
                "\nTitle = " + this.title +
                "\nGenre = " + this.genre +
                "\nRelease Year = " + this.releaseYear +
                "\nDirector = " + this.director +
                "\nDuration (minutes) = " + this.durationMinutes;
    }
}
