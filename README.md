# Understanding Algorithms and Big O Notation

Algorithms are fundamental to computer science and software development. They are step-by-step procedures or formulas for solving problems. To evaluate and compare algorithms, we often use **Big O notation**. This article will introduce you to the basics of algorithms and Big O notation, providing the foundational knowledge needed to analyze and optimize code.

## What is an Algorithm?

An **algorithm** is a finite set of instructions that, when followed, perform a specific task or solve a particular problem. Algorithms can range from simple (like adding two numbers) to complex (like sorting a list of millions of numbers).

### Key Characteristics of Algorithms

1. **Input**: The algorithm takes zero or more inputs.
2. **Output**: It produces at least one output.
3. **Definiteness**: Each step is clearly defined.
4. **Finiteness**: The algorithm terminates after a finite number of steps.
5. **Effectiveness**: Each step is basic enough to be performed, in principle, by a human using a pencil and paper.

## Introduction to Big O Notation

**Big O notation** is a mathematical concept used to describe the efficiency of an algorithm in terms of time and space. It specifically describes the worst-case scenario, providing an upper bound on the time or space required as a function of the input size.

### Common Big O Notations

1. **O(1)**: Constant time - The algorithm's performance is independent of the input size.
2. **O(log n)**: Logarithmic time - The performance increases logarithmically as the input size increases.
3. **O(n)**: Linear time - The performance increases linearly with the input size.
4. **O(n log n)**: Linearithmic time - A combination of linear and logarithmic growth.
5. **O(n^2)**: Quadratic time - The performance is proportional to the square of the input size.
6. **O(2^n)**: Exponential time - The performance doubles with each addition to the input data set.
7. **O(n!)**: Factorial time - The performance is a factorial function of the input size.

### Examples

1. **O(1)**: Accessing an element in an array by index.
2. **O(log n)**: Binary search in a sorted array.
3. **O(n)**: Iterating through a list.
4. **O(n log n)**: Efficient sorting algorithms like Merge Sort and Quick Sort.
5. **O(n^2)**: Simple sorting algorithms like Bubble Sort, Insertion Sort, and Selection Sort.
6. **O(2^n)**: Solving the Tower of Hanoi problem.
7. **O(n!)**: Solving the traveling salesman problem with a brute-force approach.

## Analyzing Algorithms with Big O

### Time Complexity

Time complexity is a function that describes the amount of computational time an algorithm takes relative to the input size. It helps determine the scalability of the algorithm.

### Space Complexity

Space complexity refers to the amount of memory an algorithm needs to run to completion. It's important when considering memory limitations and efficiency.

### Example Analysis

Let's analyze the time complexity of a simple algorithm that adds up all the elements of an array:

```kt
fun sumArray(arr: IntArray): Int {
    var total = 0
    for (num in arr) {
        total += num
    }
    return total
}
```

- **Input Size (n)**: The number of elements in the array.
- **Number of Operations**: The loop runs `n` times, each time performing a constant-time addition operation.
- **Time Complexity**: O(n), because the time it takes to complete the function grows linearly with the input size.
