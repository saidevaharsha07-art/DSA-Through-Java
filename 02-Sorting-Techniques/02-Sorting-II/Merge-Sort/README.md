# 🎯 Merge Sort

## Problem Statement

Sort an array using Merge Sort.

Merge Sort follows the Divide and Conquer approach.

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

1. Divide the array into two halves.
2. Recursively sort both halves.
3. Merge the sorted halves.

---

## Algorithm

1. Find middle index.
2. Divide array into left and right parts.
3. Recursively sort left half.
4. Recursively sort right half.
5. Merge both sorted halves.

---

## Dry Run

Array:

```text
5 3 8 1 2
```

Divide:

```text
[5 3 8] [1 2]
```

Further Divide:

```text
[5 3] [8]
[1] [2]
```

Sort:

```text
[3 5]
[1 2]
```

Merge:

```text
[3 5 8]
[1 2]
```

Final Merge:

```text
[1 2 3 5 8]
```

---

## Time Complexity

| Case | Complexity |
|--------|----------|
| Best | O(N log N) |
| Average | O(N log N) |
| Worst | O(N log N) |

---

## Space Complexity

```text
O(N)
```

---

## Key Learnings

• Divide and Conquer

• Recursion

• Merging Sorted Arrays

• Stable Sorting Algorithm

• Consistent Performance

---

## Revision Formula

```java
mergeSort(low, mid);
mergeSort(mid + 1, high);
merge(low, mid, high);
```