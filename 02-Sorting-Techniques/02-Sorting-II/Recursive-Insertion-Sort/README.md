# 🎯 Recursive Insertion Sort

## Problem Statement

Sort an array using Recursive Insertion Sort.

Instead of using loops for every pass, recursively sort the first n-1 elements and insert the last element into its correct position.

---

## Example

### Input

```text
5 3 8 1 2
```

### Output

```text
1 2 3 5 8
```

---

## Approach

1. Recursively sort first (n-1) elements.
2. Store last element as key.
3. Shift larger elements to the right.
4. Insert key at correct position.

---

## Algorithm

1. If n <= 1 return.
2. Recursively sort first (n-1) elements.
3. Insert nth element into sorted portion.
4. Repeat until array becomes sorted.

---

## Dry Run

Array:

```text
5 3 8 1 2
```

Recursive Calls:

```text
[5]
[5 3]
[3 5 8]
[1 3 5 8]
[1 2 3 5 8]
```

Sorted ✅

---

## Time Complexity

| Case | Complexity |
|--------|----------|
| Best | O(N) |
| Average | O(N²) |
| Worst | O(N²) |

---

## Space Complexity

```text
O(N)
```

(Recursive Call Stack)

---

## Key Learnings

• Recursion

• Insertion Sort Logic

• Base Case

• Recursive Reduction

• Sorted Subarray Concept

---

## Revision Formula

```java
insertionSort(arr, n - 1);
```

Then insert:

```java
arr[n - 1]
```

into the sorted portion.