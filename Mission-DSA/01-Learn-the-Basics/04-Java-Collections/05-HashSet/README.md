# HashSet in Java

## What is HashSet?

HashSet is a collection that stores unique elements.

It is part of the Java Collections Framework and internally uses a HashMap.

Duplicate values are not allowed.

---

## Package

```java
import java.util.HashSet;
```

---

## Declaration

```java
HashSet<Integer> set = new HashSet<>();
```

```java
HashSet<String> names = new HashSet<>();
```

---

## Features of HashSet

- Stores Unique Elements
- Does Not Maintain Insertion Order
- Allows One Null Value
- Fast Searching
- Fast Insertion
- Fast Deletion
- Uses Hashing Internally

---

## Internal Working

HashSet internally uses:

```java
HashMap
```

Each element is stored as a key in HashMap.

Example:

```text
Element -> Hash Value -> Storage Bucket
```

---

## Important Methods

### add()

Adds an element.

```java
set.add(10);
```

Time Complexity: O(1)

---

### remove()

Removes an element.

```java
set.remove(10);
```

Time Complexity: O(1)

---

### contains()

Checks whether element exists.

```java
set.contains(20);
```

Time Complexity: O(1)

---

### size()

Returns number of elements.

```java
set.size();
```

---

### isEmpty()

Checks whether set is empty.

```java
set.isEmpty();
```

---

### clear()

Removes all elements.

```java
set.clear();
```

---

## Example

```java
HashSet<Integer> set = new HashSet<>();

set.add(10);
set.add(20);
set.add(10);

System.out.println(set);
```

Output:

```text
[10, 20]
```

Duplicate value is ignored.

---

## Traversing HashSet

### Enhanced For Loop

```java
for(int num : set){
    System.out.println(num);
}
```

---

### Iterator

```java
Iterator<Integer> it = set.iterator();

while(it.hasNext()){
    System.out.println(it.next());
}
```

---

## Time Complexities

| Operation | Complexity |
|------------|------------|
| add() | O(1) |
| remove() | O(1) |
| contains() | O(1) |
| size() | O(1) |

---

## Advantages

- Fast Search
- Fast Insert
- Fast Delete
- Prevents Duplicates
- Efficient for Large Data

---

## Disadvantages

- No Indexing
- No Ordering
- Cannot Access Elements by Position

---

## HashSet vs ArrayList

| Feature | HashSet | ArrayList |
|----------|----------|-----------|
| Duplicates | Not Allowed | Allowed |
| Order | Not Maintained | Maintained |
| Search | Fast O(1) | O(n) |
| Index Access | No | Yes |

---

## Real Life Applications

- Removing Duplicates
- Unique User IDs
- Unique Email Storage
- Fast Membership Checking

---

## Common Interview Questions

### Does HashSet allow duplicates?

No.

---

### Does HashSet maintain insertion order?

No.

---

### Does HashSet allow null values?

Yes, only one null value.

---

### Which data structure is used internally?

HashMap.

---

### What is average time complexity of add()?

O(1)

---

## Revision Notes

- Uses Hashing
- Stores Unique Elements
- No Duplicates
- No Ordering
- Allows One Null
- Internally Uses HashMap
- O(1) Search
- O(1) Insert
- O(1) Delete