# LinkedList in Java

## What is LinkedList?

LinkedList is a linear data structure provided by Java Collections Framework.

Elements are stored as nodes.

Each node contains:

- Data
- Address of Next Node

Doubly LinkedList nodes also contain:

- Address of Previous Node

---

## Package

```java
import java.util.LinkedList;
```

---

## Declaration

```java
LinkedList<Integer> list = new LinkedList<>();
```

```java
LinkedList<String> names = new LinkedList<>();
```

---

## Features of LinkedList

- Dynamic Size
- Maintains Insertion Order
- Allows Duplicate Elements
- Allows Null Values
- Fast Insertion and Deletion
- Part of Java Collections Framework

---

## Internal Working

LinkedList uses a Doubly Linked List internally.

Each node contains:

```text
Previous Address | Data | Next Address
```

Example:

```text
NULL <- 10 <-> 20 <-> 30 -> NULL
```

---

## Important Methods

### add()

Adds element at the end.

```java
list.add(10);
```

Time Complexity: O(1)

---

### addFirst()

Adds element at beginning.

```java
list.addFirst(5);
```

Time Complexity: O(1)

---

### addLast()

Adds element at end.

```java
list.addLast(50);
```

Time Complexity: O(1)

---

### get()

Returns element at given index.

```java
list.get(2);
```

Time Complexity: O(n)

---

### getFirst()

Returns first element.

```java
list.getFirst();
```

---

### getLast()

Returns last element.

```java
list.getLast();
```

---

### remove()

Removes element at given index.

```java
list.remove(1);
```

Time Complexity: O(n)

---

### removeFirst()

Removes first element.

```java
list.removeFirst();
```

Time Complexity: O(1)

---

### removeLast()

Removes last element.

```java
list.removeLast();
```

Time Complexity: O(1)

---

### set()

Updates element.

```java
list.set(1, 100);
```

Time Complexity: O(n)

---

### contains()

Checks whether element exists.

```java
list.contains(20);
```

Time Complexity: O(n)

---

### size()

Returns number of elements.

```java
list.size();
```

Time Complexity: O(1)

---

### clear()

Removes all elements.

```java
list.clear();
```

---

## Traversing LinkedList

### For Loop

```java
for(int i = 0; i < list.size(); i++){
    System.out.println(list.get(i));
}
```

---

### Enhanced For Loop

```java
for(int num : list){
    System.out.println(num);
}
```

---

### Iterator

```java
Iterator<Integer> it = list.iterator();

while(it.hasNext()){
    System.out.println(it.next());
}
```

---

## ArrayList vs LinkedList

| Feature | ArrayList | LinkedList |
|----------|-----------|------------|
| Internal Structure | Dynamic Array | Doubly Linked List |
| Access | O(1) | O(n) |
| Insert/Delete at Beginning | Slow | Fast |
| Insert/Delete at End | Fast | Fast |
| Memory Usage | Less | More |
| Random Access | Fast | Slow |

---

## Advantages

- Dynamic Size
- Fast Insertions
- Fast Deletions
- No Resizing Required
- Efficient at Beginning Operations

---

## Disadvantages

- More Memory Usage
- Slow Random Access
- Traversal Takes More Time

---

## Time Complexities

| Operation | Complexity |
|------------|------------|
| add() | O(1) |
| addFirst() | O(1) |
| addLast() | O(1) |
| get() | O(n) |
| set() | O(n) |
| remove() | O(n) |
| removeFirst() | O(1) |
| removeLast() | O(1) |
| contains() | O(n) |

---

## Common Interview Questions

### Does LinkedList allow duplicates?

Yes.

---

### Does LinkedList maintain insertion order?

Yes.

---

### Does LinkedList allow null values?

Yes.

---

### Which data structure is used internally?

Doubly Linked List.

---

### Which is faster for insertion and deletion?

LinkedList.

---

### Which is faster for random access?

ArrayList.

---

## When to Use LinkedList?

Use LinkedList when:

- Frequent insertions are required.
- Frequent deletions are required.
- Random access is less important.

---

## Revision Notes

- Dynamic Data Structure
- Uses Doubly Linked List
- Allows Duplicates
- Allows Null Values
- Maintains Order
- Fast Insert/Delete
- Slow Random Access
- More Memory Usage
- No Resizing Required