# Assignment 2 – Basic Try-Catch Block

## Course Information

- **Student Name:** A. Hanuma Siva Prabhath
- **Course:** Programming in Java
- **Course Code:** CSA0920
- **Assignment:** Assignment 2
- **Assignment Set:** Direct-Descriptive
- **Question:** Q1 – Basic Try-Catch Block
- **Concepts:** try, catch, Arithmetic Exception

---

## Problem Statement

Write a Java program that accepts two integers from the user and divides the first by the second.

The division operation must be placed inside a try block. The program should catch the Arithmetic Exception when the divisor is zero and display a user-friendly error message instead of terminating unexpectedly.

---

## Objective

The objective of this assignment is to demonstrate Java exception handling using:

- `try`
- `catch`
- `ArithmeticException`

The program safely handles division by zero.

---

## Program Approach

1. Read two integers using the `Scanner` class.
2. Store the values as the dividend and divisor.
3. Perform the division inside a `try` block.
4. Catch `ArithmeticException` when the divisor is zero.
5. Display a suitable error message.
6. Close the Scanner after execution.

---

## Source Code

```java
import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int secondNumber = scanner.nextInt();

        try {
            int result = firstNumber / secondNumber;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }

        scanner.close();
    }
}
