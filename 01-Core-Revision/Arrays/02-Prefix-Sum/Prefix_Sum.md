# 📌 Prefix Sum

## Definition
Prefix Sum is a technique used to calculate cumulative sums of an array.

Each element in the prefix array stores the sum of all elements from the beginning up to that index.

Formula:

prefix[i] = prefix[i - 1] + arr[i]

Time Complexity:
- Building Prefix Sum Array → O(n)
- Range Sum Query → O(1)

---

## Example

Array:

```java
int arr[] = {2, 4, 6, 8, 10};
```

### Building Prefix Sum Array

```java
int arr[] = {2, 4, 6, 8, 10};

int prefix[] = new int[arr.length];

prefix[0] = arr[0];

for(int i = 1; i < arr.length; i++) {
    prefix[i] = prefix[i - 1] + arr[i];
}
```

Output:

```text
Array  : 2  4  6  8  10
Prefix : 2  6 12 20 30
```

---

## How Prefix Sum Works

Array:

```text
2   4   6   8   10
```

Calculations:

```text
prefix[0] = 2

prefix[1] = 2 + 4 = 6

prefix[2] = 6 + 6 = 12

prefix[3] = 12 + 8 = 20

prefix[4] = 20 + 10 = 30
```

Final Prefix Array:

```text
2 → 6 → 12 → 20 → 30
```

---

## Traversing Prefix Array

```java
for(int i = 0; i < prefix.length; i++) {
    System.out.print(prefix[i] + " ");
}
```

Output:

```text
2 6 12 20 30
```

---

# Range Sum Query

Find the sum of elements between index l and r.

Formula:

If l = 0

```text
Sum = prefix[r]
```

Otherwise

```text
Sum = prefix[r] - prefix[l - 1]
```

---

## Example

Array:

```text
2 4 6 8 10
```

Prefix:

```text
2 6 12 20 30
```

Find sum from index 1 to 3.

Normal Method:

```text
4 + 6 + 8 = 18
```

Using Prefix Sum:

```text
prefix[3] - prefix[0]

20 - 2 = 18
```

Answer:

```text
18
```

---

## Program for Range Sum Query

```java
int arr[] = {2, 4, 6, 8, 10};

int prefix[] = new int[arr.length];

prefix[0] = arr[0];

for(int i = 1; i < arr.length; i++) {
    prefix[i] = prefix[i - 1] + arr[i];
}

int l = 1;
int r = 3;

int sum;

if(l == 0) {
    sum = prefix[r];
}
else {
    sum = prefix[r] - prefix[l - 1];
}

System.out.println(sum);
```

Output:

```text
18
```

---

# Applications of Prefix Sum

### 1. Range Sum Queries

Used to find the sum of elements between two indices efficiently.

### 2. Competitive Programming

Frequently used in coding contests and interview problems.

### 3. Subarray Problems

Helps solve subarray sum-related questions efficiently.

### 4. Frequency Calculations

Used in cumulative frequency and counting problems.

---

# Key Points

- Prefix Sum stores cumulative sums.
- Built in one traversal of the array.
- Building Prefix Array takes O(n).
- Range Sum Query takes O(1).
- Useful for subarray and range query problems.

---

## Interview Definition

Prefix Sum is a technique where each element stores the sum of all previous elements including itself, allowing fast range sum calculations.

---

## Quick Example

```java
int arr[] = {1, 2, 3, 4};

int prefix[] = new int[arr.length];

prefix[0] = arr[0];

for(int i = 1; i < arr.length; i++) {
    prefix[i] = prefix[i - 1] + arr[i];
}
```

Output:

```text
Array  : 1 2 3 4
Prefix : 1 3 6 10
```

---

## Memory Trick

```text
Array:
1 2 3 4

Prefix:
1
1+2 = 3
1+2+3 = 6
1+2+3+4 = 10

Result:
1 3 6 10
```

### One-Line Idea

👉 Prefix Sum = Running Total of the Array.