# Movie Library System 🎬

## 📌 Overview
This project is a **Movie Library System** implemented in **Java** using **OOP principles**. It allows users to manage a collection of movies, borrow and return them, and process different movie types with inheritance and polymorphism.

## 🛠 Technologies Used
- **Java** (Object-Oriented Programming)
- **IntelliJ IDEA** (IDE used for development)
- **Git & GitHub** (Version control)
- **UML** (Class design and structure)
- **File Handling** (Reading & Writing movie data from files)

## 🚀 Features
- **Movie Class**: Represents a general movie with attributes like title, starring actors, running time, country, and language.
- **Library Class**: Manages a collection of movies with functionalities like:
  - Adding a movie
  - Borrowing and returning movies
  - Listing available movies
- **Multiple Movie Categories**:
  - `Action`, `Romance`, `Comedy`, `Mystery`, `Rescue`, `RomanticComedy`, `HollywoodBlockbuster`
  - Implements `Cloneable` and `Comparable` interfaces
  - Overrides `toString` and `equals` methods
- **Exception Handling**: Custom `MovieException` for handling missing data
- **File Handling**:
  - Reads movie data from `movies.txt`
  - Sorts movies by type and running time
  - Writes sorted movies to `sorted_movies.txt`

## 📂 Project Structure
```
📦 MovieLibrarySystem
 ┣ 📜 Movie.java
 ┣ 📜 Library.java
 ┣ 📜 Action.java
 ┣ 📜 Romance.java
 ┣ 📜 Comedy.java
 ┣ 📜 Mystery.java
 ┣ 📜 Rescue.java
 ┣ 📜 RomanticComedy.java
 ┣ 📜 HollywoodBlockbuster.java
 ┣ 📜 MovieException.java
 ┣ 📜 Driver.java
 ┣ 📜 movies.txt
 ┣ 📜 sorted_movies.txt
 ┗ 📜 README.md
```

## 🔧 How to Run
1. **Clone the repository**:
   ```sh
   git clone <your-repo-link>
   ```
2. **Open the project in IntelliJ IDEA**
3. **Compile and run `Driver.java`**
4. **Check the console output and generated `sorted_movies.txt` file**

## 📌 Example Movies File (`movies.txt`)
```
Comedy: Minions, [Sandra Bullock, Jon Hamm], 91, USA, English.
Action: The Matrix, [Keanu Reeves, Laurence Fishburne], 120, USA, English.
Hollywood Blockbuster: Gladiator, [Russell Crowe, Joaquin Phoenix], 155, USA, English.
Mystery: Harry Potter, [Daniel Radcliffe, Rupert Grint, Emma Watson], 178, UK, English.
Action: Entrapment, [Sean Connery, Catherine Zeta-Jones], 113, USA, English.
Comedy: Dumb and Dumber, [Jim Carrey, Jeff Daniels], 107, USA, English.
Rescue: Avatar, [Sam Worthington, Zoe Saldana], 161, USA, English.
Romance: Titanic, [Leonardo DiCaprio, Kate Winslet, Billy Zane], 195, USA, English.

```

## 📜 License
This project is for educational purposes. Feel free to use and modify it!
