# Triangle Number Pattern in Java

## Overview
This Java program generates a centered triangle pattern of numbers based on user input. The numbers in each row increase from 1 to the row index and then decrease back to 1. The pattern is aligned symmetrically using spaces for formatting.

## Pattern Example
For `n = 5`, the output is:
```
    1
   121
  12321
 1234321
123454321
```

## Code
```java
package number_patterns;

import java.util.Scanner;

public class Triangle_Pattern
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = s.nextInt();
        
        for(int i = 1; i <= n; i++)
        {
            int num = 1;
            
            for(int j = i; j <= n; j++)
            {
                System.out.print(" ");
            }
            
            for(int j = 1; j < i; j++)
            {
                System.out.print(num++);
            }
            
            for(int j = 1; j <= i; j++)
            {
                System.out.print(num--);
            }
            
            System.out.println();
        }
    }
}
```

## Explanation

### 1. **Scanner Class**
```java
Scanner s = new Scanner(System.in);
```
- The `Scanner` class is used to take user input.
- `System.in` reads the input from the console.
- `s.nextInt()` retrieves an integer value entered by the user.

### 2. **Variable Declaration**
```java
int n = s.nextInt();
```
- `n` stores the number of rows for the triangle pattern, entered by the user.

### 3. **Outer For Loop (Row Control)**
```java
for(int i = 1; i <= n; i++)
```
- Controls the number of rows in the pattern.
- Runs from `1` to `n`, where `n` is the input number.

### 4. **Printing Spaces (First Inner Loop)**
```java
for(int j = i; j <= n; j++)
{
    System.out.print(" ");
}
```
- Creates leading spaces to align the pattern centrally.
- The number of spaces decreases as `i` increases.

### 5. **Printing Increasing Numbers (Second Inner Loop)**
```java
int num = 1;
for(int j = 1; j < i; j++)
{
    System.out.print(num++);
}
```
- Prints numbers increasing from `1` up to `i-1`.
- `num++` increments `num` after printing.

### 6. **Printing Decreasing Numbers (Third Inner Loop)**
```java
for(int j = 1; j <= i; j++)
{
    System.out.print(num--);
}
```
- Prints numbers decreasing from `num` back to `1`.
- `num--` decrements `num` after printing.

### 7. **Printing a New Line**
```java
System.out.println();
```
- Moves to the next line after completing one row.

## Summary
- The program generates a triangle pattern of numbers with symmetry.
- Uses nested loops to control spaces, increasing numbers, and decreasing numbers.
- Demonstrates fundamental Java concepts such as loops, conditionals, and user input handling.

## Usage
1. Compile the program: `javac Triangle_Pattern.java`
2. Run the program: `java Triangle_Pattern`
3. Enter a number to define the pattern size.
4. Observe the structured triangle pattern in the console.

## Clone
```
git clone https://github.com/Ananthadatta02/Java-Trainagle_Patterns.git
```
