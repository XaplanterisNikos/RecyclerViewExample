# James Bond Movies RecyclerView Example

This Android project demonstrates the use of `RecyclerView` with two activities, showcasing a list of James Bond movies along with their details, release dates, a search bar for filtering movies, and swipe-to-delete functionality.

## Features

- **RecyclerView** to display a list of James Bond movies.
- **Two Activities**:
  - **MainActivity**: Displays the list of movies with a search bar.
  - **DetailActivity**: Shows detailed information about a selected movie.
- **Search Functionality**: Filter movies by their title.
- **Swipe-to-Delete**: Remove movies from the list with a swipe gesture.

## Screenshots

![Main Activity](screenshots/main_activity.png)
![Detail Activity](screenshots/detail_activity.png)

## Getting Started

### Prerequisites

- Android Studio 4.0 or later
- Gradle 6.1.1 or later

### Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/yourusername/JamesBondMoviesRecyclerView.git
    ```
2. Open the project in Android Studio.
3. Build and run the project on an emulator or physical device.

## Project Structure

```plaintext
JamesBondMoviesRecyclerView/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/jamesbondmovies/
│   │   │   │   ├── adapter/
│   │   │   │   │   └── MovieAdapter.java
│   │   │   │   ├── model/
│   │   │   │   │   └── Movie.java
│   │   │   │   ├── ui/
│   │   │   │   │   ├── MainActivity.java
│   │   │   │   │   ├── DetailActivity.java
│   │   │   │   └── utils/
│   │   │   │       └── SwipeToDeleteCallback.java
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   │   ├── activity_main.xml
│   │   │   │   │   ├── activity_detail.xml
│   │   │   │   │   ├── item_movie.xml
│   │   │   │   ├── drawable/
│   │   │   │   │   └── ic_delete.xml
│   │   │   │   ├── values/
│   │   │   │       └── strings.xml
│   └── build.gradle
└── build.gradle
