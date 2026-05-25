#  Two Pointers Technique

## Definition

Two Pointers is an optimization technique where two pointers are used to traverse an array or string from different positions.

Instead of using nested loops, two pointers help reduce the time complexity.

Time Complexity:
- O(n)

Space Complexity:
- O(1)

---

## Why Use Two Pointers?

Without Two Pointers:

```java
for(int i = 0; i < n; i++) {
    for(int j = i + 1; j < n; j++) {

    }
}
```

Time Complexity:

```text
O(n²)
```

Using Two Pointers:

```text
O(n)
```

Much faster for large inputs.

---

# Basic Idea

Use two pointers:

```text
Left Pointer  → Starts from beginning

Right Pointer → Starts from end
```

Example:

```text
Index : 0 1 2 3 4 5

Array : 1 2 3 4 5 6

        ↑       ↑
      left    right
```

Move pointers based on the condition.

---

# Example 1 : Pair Sum

Problem:

Find two numbers whose sum equals target.

Array:

```text
1 2 3 4 6 8
```

Target:

```text
10
```

---

## Approach

```text
left = 0
right = n - 1
```

Check:

```text
1 + 8 = 9
```

Less than target

Move left

```text
2 + 8 = 10
```

Found answer

---

## Java Program

```java
int arr[] = {1, 2, 3, 4, 6, 8};

int target = 10;

int left = 0;
int right = arr.length - 1;

while(left < right) {

    int sum = arr[left] + arr[right];

    if(sum == target) {
        System.out.println(arr[left] + " " + arr[right]);
        break;
    }
    else if(sum < target) {
        left++;
    }
    else {
        right--;
    }
}
```

Output:

```text
2 8
```

---

# Example 2 : Reverse an Array

Array:

```text
1 2 3 4 5
```

Swap first and last elements.

---

## Process

```text
1 2 3 4 5

Swap 1 and 5

5 2 3 4 1

Swap 2 and 4

5 4 3 2 1
```

---

## Java Program

```java
int arr[] = {1, 2, 3, 4, 5};

int left = 0;
int right = arr.length - 1;

while(left < right) {

    int temp = arr[left];
    arr[left] = arr[right];
    arr[right] = temp;

    left++;
    right--;
}

for(int num : arr) {
    System.out.print(num + " ");
}
```

Output:

```text
5 4 3 2 1
```

---

# Example 3 : Check Palindrome

String:

```text
MADAM
```

---

## Process

```text
M == M

A == A

D
```

All characters match.

Palindrome.

---

## Java Program

```java
String str = "MADAM";

int left = 0;
int right = str.length() - 1;

boolean palindrome = true;

while(left < right) {

    if(str.charAt(left) != str.charAt(right)) {
        palindrome = false;
        break;
    }

    left++;
    right--;
}

System.out.println(palindrome);
```

Output:

```text
true
```

---

# Working Diagram

```text
Array:

1 2 3 4 5 6

↑         ↑
L         R

Move pointers towards each other

1 2 3 4 5 6
  ↑     ↑

1 2 3 4 5 6
    ↑ ↑

Done
```

---

# Types of Two Pointers

## 1. Opposite Direction

```text
Left → Start

Right → End
```

Used for:

- Pair Sum
- Reverse Array
- Palindrome

---

## 2. Same Direction

```text
Slow Pointer
Fast Pointer
```

Used for:

- Remove Duplicates
- Move Zeros
- Sliding Window Problems

Example:

```text
Slow → i

Fast → j
```

---

# Applications

### 1. Pair Sum Problems

Find two numbers with given sum.

### 2. Reverse Array

Reverse array efficiently.

### 3. Palindrome Checking

Compare characters from both ends.

### 4. Remove Duplicates

Efficiently remove duplicates from sorted arrays.

### 5. Sliding Window Problems

Foundation for many advanced array problems.

---

# Key Points

- Uses two indices instead of nested loops.
- Reduces time complexity significantly.
- Works best on sorted arrays.
- Can move in opposite or same direction.
- Commonly asked in interviews.

---

## Interview Definition

Two Pointers is a technique that uses two indices to traverse a data structure efficiently, reducing unnecessary comparisons and improving time complexity.

---

## Quick Example

Array:

```text
1 2 3 4 6 8
```

Target:

```text
10
```

Process:

```text
1 + 8 = 9

Move left

2 + 8 = 10
```

Answer:

```text
2 8
```

---

## Memory Trick

```text
Need two values?

Use two pointers.

Sum small?
Move left.

Sum large?
Move right.

Equal?
Answer found.
```

### One-Line Idea

👉 Two Pointers = "Use two indices intelligently instead of checking every pair."