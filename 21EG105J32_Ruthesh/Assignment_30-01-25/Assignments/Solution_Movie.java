package arrays;

import java.util.*;

class Movie {
    private int movieId;
    private String director;
    private int rating;
    private int budget;

    public Movie(int movieId, String director, int rating, int budget) {
        this.movieId = movieId;
        this.director = director;
        this.rating = rating;
        this.budget = budget;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}

class Solution_Movie {

    public static double findAvgBudgetByDirector(Movie[] movies, String director) {
        int totalBudget = 0;
        int count = 0;

        for (Movie movie : movies) {
            if (movie.getDirector().equalsIgnoreCase(director)) {
                totalBudget += movie.getBudget();
                count++;
            }
        }

        if (count == 0) {
            return 0;
        }

        return (double) totalBudget / count;
    }

    public static Movie getMovieByRatingBudget(Movie[] movies, int rating, int budget) {
        for (Movie movie : movies) {
            if (movie.getRating() == rating && movie.getBudget() == budget) {
               
                if (budget % rating == 0) {
                    return movie;
                }
            }
        }
        return null; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Movie[] movies = new Movie[4];

        for (int i = 0; i < 4; i++) {
            int movieId = scanner.nextInt();
            String director = scanner.next();
            int rating = scanner.nextInt();
            int budget = scanner.nextInt();
            movies[i] = new Movie(movieId, director, rating, budget);
        }

        String director = scanner.next();
        int rating = scanner.nextInt();
        int budget = scanner.nextInt();

        double avgBudget = Solution_Movie.findAvgBudgetByDirector(movies, director);
        if (avgBudget > 0) {
            System.out.println((int) avgBudget); 
        } else {
            System.out.println("Sorry - The given director has not yet directed any movie");
        }

        Movie movie = Solution_Movie.getMovieByRatingBudget(movies, rating, budget);
        if (movie != null) {
            System.out.println(movie.getMovieId()); 
        } else {
            System.out.println("Sorry - No movie is available with the specified rating and budget requirement");
        }

        scanner.close();
    }
}


