# 🎯 Bubble Sort

## Problem Statement

Sort an array in ascending order using Bubble Sort.

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

Compare adjacent elements.

If the left element is greater than the right element, swap them.

After each pass, the largest element moves to its correct position at the end.

---

## Algorithm

1. Traverse the array.
2. Compare adjacent elements.
3. Swap if they are in the wrong order.
4. Repeat for all passes.
5. Array becomes sorted.

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
O(1)
```

---

## Key Learnings

• Adjacent Comparison

• Swapping Elements

• Stable Sorting Algorithm

• In-Place Sorting

• Optimization using Swapped Flag

---

## Revision Formula

```java
if(arr[j] > arr[j + 1])
```

Swap them.