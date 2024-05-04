package main.java.movielisting;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String email;
    private List<Movie> favorites;

    public User(String email) {
        this.email = email;
        this.favorites = new ArrayList<>();
    }

    public String getEmail() {
        return email;
    }

    public void addFavorite(Movie movie) {
        if (!favorites.contains(movie)) {
            System.out.println("Movie added to your favorites.");
            favorites.add(movie);
        } else {
            System.out.println("Movie already exists in favorites.");
        }
    }

    public void removeFavorite(Movie movie) {
        favorites.remove(movie);
    }

    public List<Movie> getFavorites() {
        return favorites;
    }

    @Override
    public String toString() {
        return "Email: " + email + "\n" +
                "Favorites: " + (int)favorites.size() + " movies\n";
    }
}
