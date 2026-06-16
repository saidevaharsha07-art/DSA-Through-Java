# 🎯 Selection Sort

## Problem Statement

Sort an array in ascending order using Selection Sort.

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

Find the minimum element from the unsorted part of the array and place it at its correct position.

After every pass, one element gets fixed.

---

## Algorithm

1. Assume current index contains minimum.
2. Traverse remaining array.
3. Find actual minimum element.
4. Swap it with current index.
5. Repeat for all positions.

---

## Dry Run

Array:

```text
5 3 8 1 2
```

Pass 1:

```text
1 3 8 5 2
```

Pass 2:

```text
1 2 8 5 3
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
| Best | O(N²) |
| Average | O(N²) |
| Worst | O(N²) |

---

## Space Complexity

```text
O(1)
```

---

## Key Learnings

• Finding Minimum Element

• Reducing Swaps

• In-Place Sorting

• Selection Strategy

---

## Revision Formula

```java
int minIndex = i;
```

```java
if(arr[j] < arr[minIndex])
```

Update minimum index.