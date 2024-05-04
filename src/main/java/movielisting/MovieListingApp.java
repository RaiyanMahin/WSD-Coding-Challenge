package main.java.movielisting;

import java.util.*;

public class MovieListingApp {
    private List<Movie> movies;
    private List<User> users;
    private User currentUser;

    public MovieListingApp() {
        movies = new ArrayList<>();
        users = new ArrayList<>();
        currentUser = null;
    }
    public static void main(String[] args) {
        MovieListingApp app = new MovieListingApp();

        // Some Sample movies have been added to the Application Console

        app.addMovie(new Movie("The Lord of the Rings: The Two Towers", "Elijah Wood, Ian McKellen", "Fantasy", "2002", 94000000));
        app.addMovie(new Movie("The Lord of the Rings: The Return of the King", "Elijah Wood, Ian McKellen", "Fantasy", "2003", 94000000));
        app.addMovie(new Movie("The Avengers", "Robert Downey Jr., Chris Evans", "Action", "2012", 220000000));
        app.addMovie(new Movie("Avatar", "Sam Worthington, Zoe Saldana", "Action", "2009", 237000000));
        app.addMovie(new Movie("Titanic", "Leonardo DiCaprio, Kate Winslet", "Romance", "1997", 200000000));
        app.addMovie(new Movie("Jurassic Park", "Sam Neill, Laura Dern", "Adventure", "1993", 63000000));
        app.addMovie(new Movie("Star Wars: Episode IV - A New Hope", "Mark Hamill, Harrison Ford", "Sci-Fi", "1977", 11000000));
        app.addMovie(new Movie("The Lion King", "Matthew Broderick, Jeremy Irons", "Animation", "1994", 45000000));
        app.addMovie(new Movie("Finding Nemo", "Albert Brooks, Ellen DeGeneres", "Animation", "2003", 94000000));
        app.addMovie(new Movie("Toy Story", "Tom Hanks, Tim Allen", "Animation", "1995", 30000000));
        app.addMovie(new Movie("Frozen", "Kristen Bell, Idina Menzel", "Animation", "2013", 150000000));
        app.addMovie(new Movie("The Incredibles", "Craig T. Nelson, Holly Hunter", "Animation", "2004", 92000000));
        app.addMovie(new Movie("The Dark Knight Rises", "Christian Bale, Tom Hardy", "Action", "2012", 250000000));
        app.addMovie(new Movie("Harry Potter and the Philosopher's Stone", "Daniel Radcliffe, Emma Watson", "Fantasy", "2001", 125000000));
        app.addMovie(new Movie("Harry Potter and the Chamber of Secrets", "Daniel Radcliffe, Emma Watson", "Fantasy", "2002", 100000000));
        app.addMovie(new Movie("Harry Potter and the Prisoner of Azkaban", "Daniel Radcliffe, Emma Watson", "Fantasy", "2004", 130000000));
        app.addMovie(new Movie("Harry Potter and the Goblet of Fire", "Daniel Radcliffe, Emma Watson", "Fantasy", "2005", 150000000));
        app.addMovie(new Movie("Harry Potter and the Order of the Phoenix", "Daniel Radcliffe, Emma Watson", "Fantasy", "2007", 150000000));
        app.addMovie(new Movie("Harry Potter and the Half-Blood Prince", "Daniel Radcliffe, Emma Watson", "Fantasy", "2009", 250000000));
        app.addMovie(new Movie("Harry Potter and the Deathly Hallows – Part 1", "Daniel Radcliffe, Emma Watson", "Fantasy", "2010", 125000000));
        app.addMovie(new Movie("Harry Potter and the Deathly Hallows – Part 2", "Daniel Radcliffe, Emma Watson", "Fantasy", "2011", 125000000));
        app.addMovie(new Movie("The Hobbit: An Unexpected Journey", "Martin Freeman, Ian McKellen", "Adventure", "2012", 180000000));
        app.addMovie(new Movie("The Hobbit: The Desolation of Smaug", "Martin Freeman, Ian McKellen", "Adventure", "2013", 225000000));
        app.addMovie(new Movie("The Hobbit: The Battle of the Five Armies", "Martin Freeman, Ian McKellen", "Adventure", "2014", 250000000));
        app.addMovie(new Movie("Spider-Man", "Tobey Maguire, Kirsten Dunst", "Action", "2002", 139000000));
        app.addMovie(new Movie("Spider-Man 2", "Tobey Maguire, Kirsten Dunst", "Action", "2004", 200000000));
        app.addMovie(new Movie("Spider-Man 3", "Tobey Maguire, Kirsten Dunst", "Action", "2007", 258000000));
        app.addMovie(new Movie("Iron Man", "Robert Downey Jr., Gwyneth Paltrow", "Action", "2008", 140000000));
        app.addMovie(new Movie("Iron Man 2", "Robert Downey Jr., Gwyneth Paltrow", "Action", "2010", 200000000));
        app.addMovie(new Movie("Iron Man 3", "Robert Downey Jr., Gwyneth Paltrow", "Action", "2013", 200000000));
        app.addMovie(new Movie("The Hunger Games", "Jennifer Lawrence, Josh Hutcherson", "Action", "2012", 78000000));
        app.addMovie(new Movie("The Hunger Games: Catching Fire", "Jennifer Lawrence, Josh Hutcherson", "Action", "2013", 130000000));
        app.addMovie(new Movie("The Hunger Games: Mockingjay – Part 1", "Jennifer Lawrence, Josh Hutcherson", "Action", "2014", 125000000));
        app.addMovie(new Movie("The Hunger Games: Mockingjay – Part 2", "Jennifer Lawrence, Josh Hutcherson", "Action", "2015", 160000000));
        app.addMovie(new Movie("Transformers", "Shia LaBeouf, Megan Fox", "Action", "2007", 150000000));
        app.addMovie(new Movie("Transformers: Revenge of the Fallen", "Shia LaBeouf, Megan Fox", "Action", "2009", 200000000));
        app.addMovie(new Movie("Transformers: Dark of the Moon", "Shia LaBeouf, Rosie Huntington-Whiteley", "Action", "2011", 195000000));
        app.addMovie(new Movie("Transformers: Age of Extinction", "Mark Wahlberg, Nicola Peltz", "Action", "2014", 210000000));
        app.addMovie(new Movie("Transformers: The Last Knight", "Mark Wahlberg, Anthony Hopkins", "Action", "2017", 217000000));
        app.addMovie(new Movie("Jurassic World", "Chris Pratt, Bryce Dallas Howard", "Action", "2015", 150000000));
        app.addMovie(new Movie("Jurassic World: Fallen Kingdom", "Chris Pratt, Bryce Dallas Howard", "Action", "2018", 170000000));
        app.addMovie(new Movie("The Martian", "Matt Damon, Jessica Chastain", "Sci-Fi", "2015", 108000000));
        app.addMovie(new Movie("Interstellar", "Matthew McConaughey, Anne Hathaway", "Sci-Fi", "2014", 165000000));
        app.addMovie(new Movie("Gravity", "Sandra Bullock, George Clooney", "Sci-Fi", "2013", 100000000));
        app.addMovie(new Movie("The Revenant", "Leonardo DiCaprio, Tom Hardy", "Adventure", "2015", 135000000));
        app.addMovie(new Movie("Mad Max: Fury Road", "Tom Hardy, Charlize Theron", "Action", "2015", 150000000));
        app.addMovie(new Movie("Guardians of the Galaxy", "Chris Pratt, Zoe Saldana", "Action", "2014", 170000000));
        app.addMovie(new Movie("Guardians of the Galaxy Vol. 2", "Chris Pratt, Zoe Saldana", "Action", "2017", 200000000)); 

        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            if (app.currentUser == null) {
                System.out.println("\nWelcome to Movie Listing Application ");
                System.out.println("\nAvailable Choices \n ");
                System.out.println("1. Register with your email");
                System.out.println("2. Login with your email");
                System.out.println("3. Exit the application");
                System.out.print("Enter your choice: ");
                int choice = getIntInput(scanner);
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter your email to register: ");
                        String emailToRegister = scanner.nextLine();
                        app.registerUser(emailToRegister);
                        break;
                    case 2:
                        System.out.print("Enter email to login: ");
                        String emailToLogin = scanner.nextLine();
                        app.loginUser(emailToLogin);
                        if (app.currentUser != null) {
                            System.out.println("Successfully Logged in!");
                        }
                        break;
                    case 3:
                        System.out.println("Exit the application.");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } else {
                System.out.println("\nYour available choices \n ");
                System.out.println("1. Search for any Movie");
                System.out.println("2. Add Movie to your Favorites");
                System.out.println("3. Remove Movie from your Favorites");
                System.out.println("4. View User Profile");
                System.out.println("5. Search Movies from Favorites");
                System.out.println("6. Logout");
                System.out.println("7. Exit");
                System.out.print("Enter your choice: ");
                int choice = getIntInput(scanner);
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter keyword for search: ");
                        String keyword = scanner.nextLine();
                        List<Movie> searchResult = app.searchMovies(keyword);
                        if (searchResult.isEmpty()) {
                            System.out.println("No movies found for the given keyword.");
                        } else {
                            System.out.println("Search results:");
                            for (Movie movie : searchResult) {
                                System.out.println(movie);
                            }
                        }
                        break;
                    case 2:
                        System.out.print("Enter movie title to add to your favorites: ");
                        String titleToAdd = scanner.nextLine();
                        List<Movie> moviesToAdd = app.searchMoviesByTitle(titleToAdd);
                        if (moviesToAdd.isEmpty()) {
                            System.out.println("Movie not found.");
                        } else {
                            System.out.println("Select a movie to add to your favorites:");
                            for (int i = 0; i < moviesToAdd.size(); i++) {
                                System.out.println((i + 1) + ". " + moviesToAdd.get(i).getTitle());
                            }
                            System.out.print("Enter your choice: ");
                            int movieChoice = getIntInput(scanner);
                            if (movieChoice > 0 && movieChoice <= moviesToAdd.size()) {
                                app.addToFavorites(app.currentUser, moviesToAdd.get(movieChoice - 1));

                            } else {
                                System.out.println("Invalid choice.");
                            }
                        }
                        break;
                    case 3:
                        User user = app.currentUser;
                        if (user.getFavorites().isEmpty()) {
                            System.out.println("No movies in favorites to remove.");
                        } else {
                            System.out.println("Favorite Movies:");
                            for (int i = 0; i < user.getFavorites().size(); i++) {
                                System.out.println((i + 1) + ". " + user.getFavorites().get(i).getTitle());
                            }
                            System.out.print("Enter index number of movie to remove from your favorites: ");
                            int indexToRemove = getIntInput(scanner);
                            if (indexToRemove > 0 && indexToRemove <= user.getFavorites().size()) {
                                app.removeFromFavorites(user, user.getFavorites().get(indexToRemove - 1));
                                System.out.println("Movie Successfully removed from favorites.");
                            } else {
                                System.out.println("Invalid index number. Please try again");
                            }
                        }
                        break;
                    case 4:
                        app.viewUserProfile(app.currentUser);
                        break;
                    case 5:
                        if (app.currentUser.getFavorites().isEmpty()) {
                            System.out.println("No movies in favorites to search, Nothing have been added till now.");
                            break;
                        }
                        System.out.print("Enter search keyword for favorites: ");
                        String keywordForFavorites = scanner.nextLine();
                        app.searchFavorites(app.currentUser, keywordForFavorites);
                        break;
                    case 6:
                        app.logoutUser();
                        System.out.println("Logged out Successfully!.");
                        break;
                    case 7:
                        System.out.println("Exit the application!");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }

    public void addMovie(Movie movie) {
        if (!movies.contains(movie)) {
            movies.add(movie);
        } else {
            System.out.println("Movie already exists. Please try different one!");
        }
    }

    public void registerUser(String email) {

        for (User user : users) {
            if (user.getEmail().equals(email)) {

                System.out.println("User already exists. Please log in!");
                return;
            }
        }

        User user = new User(email);
        users.add(user);
        System.out.println("User registered Successfully!");

    }

    public void loginUser(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                currentUser = user;
                return;
            }
        }
        System.out.println("User not found. Please register!");
    }

    public void logoutUser() {
        currentUser = null;
    }

    public List<Movie> searchMovies(String keyword) {
        List<Movie> result = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
                    movie.getCast().toLowerCase().contains(keyword.toLowerCase()) ||
                    movie.getCategory().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(movie);
            }
        }
        Collections.sort(result, (m1, m2) -> m1.getTitle().compareToIgnoreCase(m2.getTitle()));
        return result;
    }

    public List<Movie> searchMoviesByTitle(String title) {
        List<Movie> result = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getTitle().toLowerCase().contains(title.toLowerCase())) {
                result.add(movie);
            }
        }
        return result;
    }

    public void addToFavorites(User user, Movie movie) {
        user.addFavorite(movie);
    }

    public void removeFromFavorites(User user, Movie movie) {
        user.removeFavorite(movie);
    }

    public void viewUserProfile(User user) {
        System.out.println(user);
        System.out.println("Favorite Movies are:");
        for (Movie movie : user.getFavorites()) {
            System.out.println(movie);
        }
    }

    public void searchFavorites(User user, String keyword) {
        List<Movie> favorites = user.getFavorites();
        List<Movie> result = new ArrayList<>();
        for (Movie movie : favorites) {
            if (movie.getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
                    movie.getCast().toLowerCase().contains(keyword.toLowerCase()) ||
                    movie.getCategory().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(movie);
            }
        }
        System.out.println("Search result in favorite movies for '" + keyword + "':");
        for (Movie movie : result) {
            System.out.println(movie);
        }
    }

    private static int getIntInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
