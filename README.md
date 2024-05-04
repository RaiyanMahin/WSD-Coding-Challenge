# Movie Listing Application

This is a simple movie app where users can register with their email address and perform various actions related to movies such as searching, adding to favorites, and viewing details.

## Features

- **Registration**: Users can register with their email address. No authentication is required.
- **Search**: Users can search for movies by title, cast, or category. All matching movies are returned in ascending order of movie title.
- **View Movie Details**: Users can view details for any movie including title, cast, category, release date, and budget.
- **Favorites**: Users can add movies to their favorites and remove movies from their favorites.
- **Personal Details**: Users can view their personal details and the movies they've added to their favorites.
- **Search Favorites**: Users can search only movies they've added to their favorites.

## Implementation Considerations

- **Unique Email**: Ensure no duplicate emails are allowed for registration.
- **Sorting**: Searched matching movies should be returned in ascending order of movie title.
- **Empty Favorites**: Users cannot search or remove movies if their favorites list is empty.
- **Valid Index**: When adding movies to favorites, ensure the input index is valid.
- **Clear Messages**: Display only relevant and clear messages at each step of the process.

## Constraints

- No database is used in this implementation.

## Running the Code

To start the application locally:

Compile the Java files inside the `src/main/java/movielisting` directory and launch the application, run the `MovieListingApp` class.

## Sample Output

-[# Check this File](https://github.com/RaiyanMahin/WSD-Coding-Challenge/blob/main/Sample%20Output.pdf)

Feel free to explore and extend the application for additional features and improvements.


## Contributor

👤 **Raiyan Bashir Mahin**

* LinkedIn: [@raiyanmahin](https://www.linkedin.com/in/raiyanmahin/)
* GitHub: [@RaiyanMahin](https://github.com/RaiyanMahin)


