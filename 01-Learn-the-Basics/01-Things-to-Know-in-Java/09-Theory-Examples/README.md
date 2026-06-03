# 09 Theory Examples

## Introduction

Before starting Data Structures and Algorithms, it is important to understand some theoretical concepts.

These concepts help in:

- Writing efficient code
- Analyzing performance
- Optimizing solutions
- Cracking coding interviews

---

# Time Complexity

Time Complexity measures how the running time of an algorithm grows as the input size increases.

It is represented using Big O Notation.

---

## O(1) - Constant Time

The execution time remains the same regardless of input size.

### Example

```java
int x = arr[0];
```

---

## O(log n) - Logarithmic Time

The input size reduces by half in every step.

### Example

```java
Binary Search
```

---

## O(n) - Linear Time

Execution time grows directly with input size.

### Example

```java
for(int i = 0; i < n; i++){
    System.out.println(i);
}
```

---

## O(n log n)

Common in efficient sorting algorithms.

### Examples

```text
Merge Sort
Quick Sort (Average Case)
Heap Sort
```

---

## O(n²) - Quadratic Time

Usually occurs in nested loops.

### Example

```java
for(int i = 0; i < n; i++){
    for(int j = 0; j < n; j++){
        System.out.println(i + " " + j);
    }
}
```

---

## Complexity Order

```text
O(1)
O(log n)
O(n)
O(n log n)
O(n²)
O(n³)
O(2ⁿ)
O(n!)
```

Best → Worst

---

# Space Complexity

Space Complexity measures the extra memory used by an algorithm.

---

## O(1)

Uses constant extra space.

### Example

```java
int sum = 0;
```

---

## O(n)

Uses memory proportional to input size.

### Example

```java
int[] arr = new int[n];
```

---

# Dry Run

Dry Run means manually executing the code step by step.

---

## Example

```java
int sum = 0;

for(int i = 1; i <= 3; i++){
    sum += i;
}
```

### Dry Run Table

| i   | sum |
| --- | --- |
| 1   | 1   |
| 2   | 3   |
| 3   | 6   |

Output:

```text
6
```

---

# Brute Force Approach

The simplest solution that checks every possibility.

### Example

Finding the largest element:

```java
for(int i = 0; i < n; i++){
    // compare all elements
}
```

---

# Optimal Approach

The most efficient solution in terms of time and space complexity.

### Example

Finding largest element:

```java
int max = arr[0];

for(int num : arr){
    if(num > max){
        max = num;
    }
}
```

---

# Recursion Basics

Recursion is when a function calls itself.

### Example

```java
public static void print(int n){

    if(n == 0){
        return;
    }

    System.out.println(n);

    print(n - 1);
}
```

---

# Iteration vs Recursion

| Iteration   | Recursion           |
| ----------- | ------------------- |
| Uses loops  | Uses function calls |
| Faster      | Slightly slower     |
| Less memory | Uses stack memory   |

---

# Common DSA Terms

## Traversal

Visiting every element once.

### Example

```java
for(int num : arr){
    System.out.println(num);
}
```

---

## Searching

Finding an element in a collection.

### Examples

```text
Linear Search
Binary Search
```

---

## Sorting

Arranging data in order.

### Examples

```text
Bubble Sort
Selection Sort
Insertion Sort
Merge Sort
Quick Sort
```

---

## Hashing

Storing data for faster lookup.

### Example

```java
HashMap<Integer, Integer>
```

---

# Important Points

1. Always think about Time Complexity.
2. Prefer Optimal Solutions over Brute Force.
3. Practice Dry Runs regularly.
4. Understand Recursion before Trees and Graphs.
5. Learn Big O Notation early.

---

# Common Mistakes

### Ignoring Complexity

Wrong ❌

```java
O(n²) solution when O(n) is possible
```

---

### Not Dry Running Code

Many bugs can be found through dry runs.

---

# Interview Questions

### What is Time Complexity?

The amount of time an algorithm takes as input size increases.

### What is Space Complexity?

The amount of extra memory used by an algorithm.

### Difference Between Brute Force and Optimal?

- Brute Force → Simple but slower.
- Optimal → Efficient and faster.

### What is Dry Run?

Executing code manually step by step.

### What is Big O Notation?

A way to represent algorithm efficiency.

---

# Striver A2Z Connection

These concepts are used in every topic:

- Arrays
- Hashing
- Recursion
- Linked Lists
- Trees
- Graphs
- Dynamic Programming

Master these concepts before moving deeper into DSA.
