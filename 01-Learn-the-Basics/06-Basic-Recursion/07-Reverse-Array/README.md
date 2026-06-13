# 07 - Reverse Array Using Recursion

## Problem Statement

Reverse an array using Recursion.

### Example

Input:

```text
[1, 2, 3, 4, 5]
```

Output:

```text
[5, 4, 3, 2, 1]
```

---

## Understanding the Problem

We need to reverse the array without using loops for the main logic.

The idea is:

```text
Swap first element with last element

Swap second element with second-last element

Swap third element with third-last element

Continue until both pointers meet
```

This is the same Two Pointer approach used in iteration.

---

## Recursive Thinking

Array:

```text
[1, 2, 3, 4, 5]
```

Step 1:

```text
Swap 1 and 5

[5, 2, 3, 4, 1]
```

Step 2:

```text
Swap 2 and 4

[5, 4, 3, 2, 1]
```

Step 3:

```text
Left pointer >= Right pointer

Stop
```

---

## Recursive Formula

```text
Swap(arr[left], arr[right])

Reverse remaining array

reverse(left + 1, right - 1)
```

---

## Algorithm

1. Create two pointers:
   
```text
left = 0

right = n - 1
```

2. Swap left and right elements.
3. Move left forward.
4. Move right backward.
5. Repeat recursively.
6. Stop when:

```text
left >= right
```

---

## Code

```java
import java.util.*;

public class Main {

    static void reverse(int[] arr, int left, int right) {

        if (left >= right) {
            return;
        }

        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        reverse(arr, left + 1, right - 1);
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};

        reverse(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}
```

---

## Dry Run

Array:

```text
[1, 2, 3, 4, 5]
```

Call:

```text
reverse(arr,0,4)
```

Swap:

```text
1 ↔ 5

[5,2,3,4,1]
```

Call:

```text
reverse(arr,1,3)
```

Swap:

```text
2 ↔ 4

[5,4,3,2,1]
```

Call:

```text
reverse(arr,2,2)
```

Condition:

```text
left >= right

2 >= 2

true
```

Stop recursion.

Final Output:

```text
[5,4,3,2,1]
```

---

## Call Stack Visualization

```text
reverse(0,4)

↓

reverse(1,3)

↓

reverse(2,2)

Base Case
```

Returning:

```text
reverse(2,2)

returns

reverse(1,3)

returns

reverse(0,4)

returns
```

---

## Recursion Tree

```text
reverse(0,4)

|

reverse(1,3)

|

reverse(2,2)

Base Case
```

---

## Base Case

```java
if(left >= right){
    return;
}
```

Purpose:

Stop when both pointers meet or cross.

---

## Why left >= right?

For Odd Length Array

```text
[1,2,3,4,5]
```

Middle element:

```text
3
```

No need to swap.

Pointers become:

```text
left = 2

right = 2
```

Stop.

---

For Even Length Array

```text
[1,2,3,4]
```

Pointers become:

```text
left = 2

right = 1
```

Cross each other.

Stop.

---

## Time Complexity

Every swap handles two elements.

Number of recursive calls:

```text
N / 2
```

Time Complexity:

```text
O(N)
```

---

## Space Complexity

Recursive calls stored in stack.

```text
O(N)
```

More accurately:

```text
O(N/2)
```

which simplifies to:

```text
O(N)
```

---

## Alternative Recursive Method

Using One Pointer:

```java
static void reverse(int[] arr, int i){

    if(i >= arr.length/2){
        return;
    }

    int temp = arr[i];
    arr[i] = arr[arr.length - i - 1];
    arr[arr.length - i - 1] = temp;

    reverse(arr, i + 1);
}
```

This is the version used by Striver.

---

## Why Striver Uses One Pointer?

Because:

```text
right = n - i - 1
```

can be calculated directly.

No need to pass two variables.

---

## Striver Version Dry Run

Array:

```text
[1,2,3,4,5]
```

i = 0

```text
swap 1 and 5
```

i = 1

```text
swap 2 and 4
```

i = 2

```text
i >= n/2

2 >= 2

Stop
```

Output:

```text
[5,4,3,2,1]
```

---

## Common Mistakes

### 1. Wrong Base Case

Wrong:

```java
if(left > right)
```

May perform unnecessary swaps.

Correct:

```java
if(left >= right)
```

---

### 2. Forgetting Pointer Updates

Wrong:

```java
reverse(arr,left,right);
```

Infinite Recursion.

Correct:

```java
reverse(arr,left+1,right-1);
```

---

### 3. Incorrect Swap

Always use:

```java
temp
```

variable properly.

---

### 4. Wrong Right Index

Correct:

```java
arr.length - i - 1
```

Not:

```java
arr.length - i
```

which causes:

```text
ArrayIndexOutOfBoundsException
```

---

## Interview Questions

### Q1. What is the recursive formula?

```text
Swap

reverse(left+1,right-1)
```

---

### Q2. Why stop at left >= right?

Because all required swaps are completed.

---

### Q3. Why is Time Complexity O(N)?

Every element is visited once.

---

### Q4. Why is Space Complexity O(N)?

Recursive calls occupy stack memory.

---

### Q5. Can it be solved iteratively?

Yes.

Using Two Pointers and a loop.

---

### Q6. Which approach is preferred?

Production:

```text
Iterative
```

Interview Learning:

```text
Recursive
```

---

### Q7. Why does Striver use one pointer?

To simplify recursion and calculate the second pointer mathematically.

---

## Real Interview Insight

This problem introduces:

```text
Recursion + Arrays
```

which is a major step forward from simple number recursion.

Understanding this helps with:

- String Reversal
- Palindrome Checking
- Two Pointer Problems
- Tree Traversals

---

## Key Learning

This problem teaches:

```text
Two Pointer Technique

Recursive Swapping

Array Manipulation

Base Case Design
```

These concepts are frequently used in coding interviews.

---

## Quick Revision Notes

```text
Goal:
Reverse Array

Method:
Two Pointers

Base Case:
left >= right

Recursive Call:
reverse(left+1,right-1)

Time Complexity:
O(N)

Space Complexity:
O(N)

Striver Version:
One Pointer

right = n - i - 1

Concepts:
✔ Recursion
✔ Arrays
✔ Two Pointers
✔ Swapping

Common Errors:
❌ Wrong Base Case
❌ Wrong Right Index
❌ Infinite Recursion
```