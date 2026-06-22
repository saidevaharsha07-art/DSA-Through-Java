# 🎯 Quick Sort

## Problem Statement

Sort an array using Quick Sort.

Quick Sort works by selecting a pivot element and placing it in its correct position.

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

1. Select a Pivot.
2. Place pivot in its correct sorted position.
3. Elements smaller than pivot go left.
4. Elements greater than pivot go right.
5. Recursively sort left and right parts.

---

## Algorithm

1. Choose pivot.
2. Partition array.
3. Get pivot index.
4. Recursively sort left side.
5. Recursively sort right side.

---

## Dry Run

Array:

```text
5 3 8 1 2
```

Pivot = 5

Partition:

```text
3 1 2 5 8
```

Left:

```text
3 1 2
```

Right:

```text
8
```

Sort Left:

```text
1 2 3
```

Final:

```text
1 2 3 5 8
```

---

## Time Complexity

| Case | Complexity |
|--------|----------|
| Best | O(N log N) |
| Average | O(N log N) |
| Worst | O(N²) |

---

## Space Complexity

```text
O(log N)
```

---

## Key Learnings

• Divide and Conquer

• Partitioning

• Pivot Selection

• Recursive Sorting

• In-Place Sorting

---

## Revision Formula

```java
int pivotIndex = partition(arr, low, high);

quickSort(arr, low, pivotIndex - 1);
quickSort(arr, pivotIndex + 1, high);
```