# Array Traversal

## Definition
Array Traversal is the process of visiting and processing each element of an array exactly once.

**Time Complexity:** O(n)

---

## Example Array

```java
int arr[] = {10, 20, 30, 40, 50};
```

---

## Forward Traversal

```java
for(int i = 0; i < arr.length; i++) {
    System.out.print(arr[i] + " ");
}
```

### Output

```text
10 20 30 40 50
```

### Traversal Flow

```text
10 → 20 → 30 → 40 → 50
```

---

## Reverse Traversal

```java
for(int i = arr.length - 1; i >= 0; i--) {
    System.out.print(arr[i] + " ");
}
```

### Output

```text
50 40 30 20 10
```

### Traversal Flow

```text
50 → 40 → 30 → 20 → 10
```

---

# Applications of Array Traversal

## 1. Printing Array Elements

```java
for(int i = 0; i < arr.length; i++) {
    System.out.print(arr[i] + " ");
}
```

Output:

```text
10 20 30 40 50
```

---

## 2. Finding Sum of Elements

```java
int sum = 0;

for(int i = 0; i < arr.length; i++) {
    sum += arr[i];
}

System.out.println(sum);
```

Output:

```text
150
```

---

## 3. Finding Maximum Element

```java
int max = arr[0];

for(int i = 1; i < arr.length; i++) {
    if(arr[i] > max) {
        max = arr[i];
    }
}

System.out.println(max);
```

Output:

```text
50
```

---

## 4. Searching an Element (Linear Search)

```java
int key = 30;

for(int i = 0; i < arr.length; i++) {
    if(arr[i] == key) {
        System.out.println("Found at index " + i);
    }
}
```

Output:

```text
Found at index 2
```

---

# Key Points

- Traversal means visiting every element of an array.
- It is usually done using loops.
- Traversal can be forward or reverse.
- Used for printing, searching, counting, summing, finding minimum and maximum elements.
- Time Complexity = O(n).

---

## Interview Definition

Array Traversal is the process of visiting each element of an array one by one to perform a specific operation such as printing, searching, summing, counting, or updating values.

---

## Quick Example

```java
int arr[] = {1, 2, 3, 4, 5};

for(int i = 0; i < arr.length; i++) {
    System.out.print(arr[i] + " ");
}
```

Output:

```text
1 2 3 4 5
```