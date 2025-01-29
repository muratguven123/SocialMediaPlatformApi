# Social Platform API

The Social Platform API is a web application developed using Jakarta EE, Spring MVC, Spring Data JPA, and Java SDK version 17. It's designed to provide administration space for managing users, posts, comments, likes, and subreddits.

## Getting Started

To get a local copy up and running, follow these simple steps.

### Prerequisites

Ensure you have the following software installed on your computer

- Java version "17.0.1"
- IntelliJ IDEA 2024.1.1, Ultimate Edition
- Spring MVC
- Jakarta EE 
- Spring Data JPA

### Installing

Clone or download this repository. Import the project into IntelliJ IDEA and resolve any dependencies.

## Project Structure

The `controller` package contains the following controllers:

- `UserController`: Manages user related operations.
- `PostController`: Handles all post related operations.
- `CommentController`: Provides services for managing comments.
- `LikeController`: Manages likes on the platform.
- `UserSubredditsController`: Handles subreddit subscriptions for users.
- `SubredditsController`: Responsible for operations related to subreddits.

## API Specifications

Each of the controllers exposes various REST endpoints to interact with the underlying service.
For example, to manage comments in the `CommentController`:

- `/comment/{commentid}`: Fetch all comments (GET).
- `/comment`: Fetch comments by post id and comment id (GET).
- `/comment`: Create a new comment (POST).
- `/comment/{commentid}`: Update a comment (PUT).
- `/comment/{commentid}`: Delete a comment (DELETE).

You can check the corresponding controller class files for the details on other endpoints.

## Built With

- [Jakarta EE](https://jakarta.ee/)
- [Spring MVC](https://spring.io/guides/gs/serving-web-content/)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)

## Author

* **Your Name**

## License

This project is licensed under the XYZ License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* [IntelliJ IDEA 2024.1.1, Ultimate Edition](https://www.jetbrains.com/idea/)
