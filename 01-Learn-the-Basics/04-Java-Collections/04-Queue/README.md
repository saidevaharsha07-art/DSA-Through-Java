# Queue in Java

## What is Queue?

Queue is a linear data structure that follows:

**FIFO (First In First Out)**

The element inserted first is removed first.

Example:

```text
Front                Rear
↓                     ↓
10 → 20 → 30 → 40

Remove → 10
```

---

## Package

```java
import java.util.Queue;
import java.util.LinkedList;
```

---

## Declaration

```java
Queue<Integer> queue = new LinkedList<>();
```

---

## Features of Queue

- Follows FIFO Principle
- Dynamic Size
- Allows Duplicates
- Allows Null Values (LinkedList implementation)
- Used for Scheduling and Processing Tasks

---

## Important Methods

### add()

Adds element to rear.

```java
queue.add(10);
```

Time Complexity: O(1)

---

### offer()

Adds element to rear.

```java
queue.offer(20);
```

Time Complexity: O(1)

---

### remove()

Removes front element.

```java
queue.remove();
```

Time Complexity: O(1)

---

### poll()

Removes and returns front element.

```java
queue.poll();
```

Time Complexity: O(1)

---

### peek()

Returns front element without removing.

```java
queue.peek();
```

Time Complexity: O(1)

---

### element()

Returns front element.

```java
queue.element();
```

Time Complexity: O(1)

---

### isEmpty()

Checks whether queue is empty.

```java
queue.isEmpty();
```

---

### size()

Returns number of elements.

```java
queue.size();
```

---

## Queue Operations

### Insert

```text
Front            Rear
↓                 ↓
10 → 20 → 30 → 40
```

---

### Remove

```text
Remove → 10
```

Remaining:

```text
Front       Rear
↓            ↓
20 → 30 → 40
```

---

### Peek

```text
Returns 20
```

Queue remains unchanged.

---

## Time Complexities

| Operation | Complexity |
|------------|------------|
| add() | O(1) |
| offer() | O(1) |
| remove() | O(1) |
| poll() | O(1) |
| peek() | O(1) |
| size() | O(1) |

---

## Advantages

- Fast Insertion
- Fast Deletion
- Easy Implementation
- Useful for Scheduling

---

## Disadvantages

- Limited Access
- Cannot Access Middle Elements Directly

---

## Real Life Applications

- CPU Scheduling
- Printer Queue
- Ticket Booking Systems
- Task Scheduling
- BFS Traversal
- Network Packet Processing

---

## Common Interview Questions

### Which principle does Queue follow?

FIFO (First In First Out)

---

### Which operation inserts an element?

add() or offer()

---

### Which operation removes an element?

remove() or poll()

---

### Which operation returns front element?

peek()

---

### Can Queue contain duplicate values?

Yes.

---

### Which classes implement Queue?

- LinkedList
- PriorityQueue
- ArrayDeque

---

## Revision Notes

- Linear Data Structure
- Follows FIFO
- add()/offer() → Insert
- remove()/poll() → Delete
- peek() → View Front
- O(1) Insert/Delete
- Used in BFS
- Used in Scheduling Problems