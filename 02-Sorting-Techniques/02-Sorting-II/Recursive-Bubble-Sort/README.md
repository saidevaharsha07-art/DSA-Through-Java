# 🎯 Recursive Bubble Sort

## Problem Statement

Sort an array using Recursive Bubble Sort.

Instead of using nested loops, use recursion to perform passes.

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

Bubble the largest element to the end in one pass.

Then recursively sort the remaining array.

---

## Algorithm

1. Perform one Bubble Sort pass.
2. Largest element moves to the end.
3. Recursively sort first (n-1) elements.
4. Stop when n = 1.

---

## Dry Run

Array:

```text
5 3 8 1 2
```

Pass 1:

```text
3 5 1 2 8
```

Pass 2:

```text
3 1 2 5 8
```

Pass 3:

```text
1 2 3 5 8
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

• Base Case

• Recursive Reduction

• Bubble Sort Logic

---

## Revision Formula

```java
bubbleSort(arr, n - 1);
```