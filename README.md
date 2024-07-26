# Math Operation Program in Java

## Description

This Java program allows users to perform basic arithmetic operations (addition, subtraction, multiplication, and division) on two numbers. The program prompts the user to input two numbers and the desired operation, then outputs the result.

## Features

- **Addition (sum)**
- **Subtraction (sub)**
- **Multiplication (mult)**
- **Division (div)** (with handling for division by zero)

## Usage

1. **Clone the Repository**
    ```bash
    git clone <repository-url>
    cd <repository-directory>
    ```

2. **Compile the Program**
    ```bash
    javac Math.java
    ```

3. **Run the Program**
    ```bash
    java Math
    ```

4. **Follow the Prompts**
    - Enter the first number when prompted.
    - Enter the second number when prompted.
    - Specify the operation you want to perform (`sum`, `sub`, `div`, or `mult`).

## Example

```plaintext
Enter number 1: 5
Enter number 2: 3
Which operation you want to perform? sum
The sum of 5.000000 and 3.000000 is 8.000000
```

## Code Explanation

The `Math` class contains the `main` method which performs the following steps:

1. **Create a Scanner object**: To read input from the user.
    ```java
    Scanner macha = new Scanner(System.in);
    ```

2. **Prompt for and read the first number**:
    ```java
    System.out.print("Enter number 1: ");
    double number1 = macha.nextDouble();
    macha.nextLine();
    ```

3. **Prompt for and read the second number**:
    ```java
    System.out.print("Enter number 2: ");
    double number2 = macha.nextDouble();
    macha.nextLine();
    ```

4. **Prompt for and read the operation**:
    ```java
    System.out.print("Which operation you want to perform? ");
    String operation = macha.nextLine();
    ```

5. **Perform the specified operation and print the result**:
    - Addition
    ```java
    if (operation.equals("sum")) {
        System.out.printf("The sum of %f and %f is %f", number1, number2, number1 + number2);
    }
    ```
    - Subtraction
    ```java
    else if (operation.equals("sub")) {
        System.out.printf("The subtraction of %f and %f is %f", number1, number2, number1 - number2);
    }
    ```
    - Multiplication
    ```java
    else if (operation.equals("mult")) {
        System.out.printf("The multiplication of %f and %f is %f", number1, number2, number1 * number2);
    }
    ```
    - Division (with zero-check)
    ```java
    else if (operation.equals("div")) {
        if (number2 == 0) {
            System.out.println("You can't divide any number by zero");
        } else {
            System.out.printf("The division of %f and %f is %f", number1, number2, number1 / number2);
        }
    }
    ```
    - Invalid operation
    ```java
    else {
        System.out.println("Our system can only perform few operations which are sum, sub, div and mult (for your operation to work correctly write them as they appear here). For further complex calculations visit other sources.");
    }
    ```

## Notes

- Ensure that you input the operation exactly as specified (`sum`, `sub`, `div`, `mult`) for the program to work correctly.
- The program handles division by zero by checking if the second number is zero before performing the division.

