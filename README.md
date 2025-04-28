# Lab 9 - Sierpinski Triangle (CMPS 367)

## Overview

This project implements the recursive Sierpinski Triangle using Java Graphics and Swing.  
The user is prompted to enter the number of recursion levels between 1 and 10.  
The program then draws a Sierpinski Triangle, dynamically setting random colors for each drawn triangle to enhance visual appearance.

## How to Run

1. Compile both `Main.java` and `TrianglePanel.java`:

    ```bash
    javac Main.java TrianglePanel.java
    ```

2. Run the program:

    ```bash
    java Main
    ```

3. When prompted, enter an integer between 1 and 10 to select the number of recursion levels.

4. The Sierpinski Triangle will be drawn based on the input provided.

## Files Included

- `Main.java` — Entry point of the program; handles user input and sets up the GUI window.
- `TrianglePanel.java` — Custom JPanel that handles the recursive drawing of the Sierpinski Triangle.

## Key Features

- **Recursive Drawing**: Implements classic recursive division of a triangle into smaller triangles.
- **Dynamic Colorization**: Each triangle is filled with a randomly generated color for aesthetic variety.
- **User Input**: Allows dynamic adjustment of recursion depth at runtime.
- **Object Oriented Design**: Separates GUI setup from drawing logic for clean architecture.

## External References

- Sierpinski triangle recursion concept based on course examples from the Spring 25' semester of CMPS 367, and common online resources such as GeeksForGeeks Java Graphics tutorials.
- Java API documentation for [`Graphics2D`](https://docs.oracle.com/en/java/javase/17/docs/api/java.desktop/java/awt/Graphics2D.html) and [`Color`](https://docs.oracle.com/en/java/javase/17/docs/api/java.desktop/java/awt/Color.html) classes.

## Author

John Warren

CMPS 367 Advanced Topics 
Spring 2025
