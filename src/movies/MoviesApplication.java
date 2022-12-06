package movies;

import java.util.Arrays;
import util.Input;

public class MoviesApplication {
    public static Movie[] movies = MoviesArray.findAll();

    public static void main(String[] args) {
            reset();

    }


    private static void printMenu() {
        System.out.print("""
                What would you like to do?
                                
                0 - exit
                1 - view all movies
                2 - view movies in the animated category
                3 - view movies in the drama category
                4 - view movies in the horror category
                5 - view movies in the sci-fi category
                            
                Enter your choice: \n""");
    }


    private static void reset(){
        printMenu();
        int answer = Input.getInt(0,5);
        if (answer == 0){
            return;
        }
        printMovie(answer);
        reset();
    }

    private static void printMovie(int choice) {
        switch(choice) {
            case 1:
                printMoviesByCategory("all");
                break;
            case 2:
                printMoviesByCategory("animated");
                break;
            case 3:
                printMoviesByCategory("drama");
                break;
            case 4:
                printMoviesByCategory("horror");
                break;
            case 5:
                printMoviesByCategory("scifi");
                break;
        }
    }

    private static void printMoviesByCategory(String category) {
        System.out.println("-------------------------");
        for(Movie movie: movies) {
            if(movie.getCategory().equals(category)) {
                String temp = movie.getName();
                System.out.println("\" " + temp + " \"");
            }
            if (category.equals("all")){
                System.out.println(movie);
            }
        }
        System.out.println("-------------------------");
    }
}
