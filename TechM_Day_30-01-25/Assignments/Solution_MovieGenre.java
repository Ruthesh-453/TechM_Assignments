package arrays;

import java.util.*;

class Movie1 {
    private String movieName;
    private String company;
    private String genre;
    private int budget;

    public Movie1(String movieName, String company, String genre, int budget) {
        this.movieName = movieName;
        this.company = company;
        this.genre = genre;
        this.budget = budget;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}

class Solution_MovieGenre {

    public static Movie1[] getMovieByGenre(Movie1[] movies, String searchGenre) {

        int count = 0;
        for (Movie1 movie : movies) {
            if (movie.getGenre().equalsIgnoreCase(searchGenre)) {
                count++;
            }
        }

        if (count == 0) {
            return new Movie1[0];
        }

        Movie1[] result = new Movie1[count];
        int index = 0;

        for (Movie1 movie : movies) {
            if (movie.getGenre().equalsIgnoreCase(searchGenre)) {
                result[index++] = movie;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Movie1[] movies = new Movie1[4];

        for (int i = 0; i < 4; i++) {
            String movieName = scanner.next();
            String company = scanner.next();
            String genre = scanner.next();
            int budget = scanner.nextInt();
            movies[i] = new Movie1(movieName, company, genre, budget);
        }

        String searchGenre = scanner.next();

        Movie1[] genreMovies = Solution_MovieGenre.getMovieByGenre(movies, searchGenre);

        for (Movie1 movie : genreMovies) {
            if (movie.getBudget() > 80000000) {
                System.out.println("High Budget Movie");
            } else {
                System.out.println("Low Budget Movie");
            }
        }

        scanner.close();
    }
}

