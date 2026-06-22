# 🎯 Insertion Sort

## Problem Statement

Sort an array in ascending order using Insertion Sort.

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

Build the sorted portion of the array one element at a time.

Pick an element and insert it into its correct position in the already sorted part.

---

## Algorithm

1. Start from index 1.
2. Store current element in temp.
3. Compare with previous elements.
4. Shift larger elements one position right.
5. Insert temp at correct position.
6. Repeat for all elements.

---

## Dry Run

Array:

```text
5 3 8 1 2
```

Pass 1:

```text
3 5 8 1 2
```

Pass 2:

```text
3 5 8 1 2
```

Pass 3:

```text
1 3 5 8 2
```

Pass 4:

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

• Shifting Elements

• Building Sorted Portion

• Stable Sorting Algorithm

• In-Place Sorting

• Efficient for Small Arrays

---

## Revision Formula

```java
while(j >= 0 && arr[j] > key)
```

Shift elements to the right.