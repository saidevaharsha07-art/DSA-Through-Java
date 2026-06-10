# TreeMap in Java

## What is TreeMap?

TreeMap is a data structure that stores data in the form of:

```text
Key → Value
```

Like HashMap, but TreeMap automatically stores keys in sorted order.

TreeMap is part of the Java Collections Framework.

---

## Package

```java
import java.util.TreeMap;
```

---

## Declaration

```java
TreeMap<Integer, String> map = new TreeMap<>();
```

---

## Features of TreeMap

- Stores Key-Value Pairs
- Keys Must Be Unique
- Values Can Be Duplicate
- Keys Are Automatically Sorted
- Does Not Allow Null Keys
- Allows Multiple Null Values
- Implements NavigableMap Interface

---

## Internal Working

TreeMap internally uses:

```text
Red-Black Tree
```

Red-Black Tree is a self-balancing Binary Search Tree.

Because of sorting:

```java
put()
get()
remove()
```

take O(log n) time.

---

## Important Methods

### put()

Insert key-value pair.

```java
map.put(101, "Harsha");
```

Time Complexity: O(log n)

---

### get()

Returns value of key.

```java
map.get(101);
```

Time Complexity: O(log n)

---

### remove()

Removes key-value pair.

```java
map.remove(101);
```

Time Complexity: O(log n)

---

### containsKey()

Checks whether key exists.

```java
map.containsKey(101);
```

Time Complexity: O(log n)

---

### firstKey()

Returns smallest key.

```java
map.firstKey();
```

---

### lastKey()

Returns largest key.

```java
map.lastKey();
```

---

### higherKey()

Returns next greater key.

```java
map.higherKey(20);
```

---

### lowerKey()

Returns next smaller key.

```java
map.lowerKey(20);
```

---

### size()

Returns number of entries.

```java
map.size();
```

---

## Example

```java
TreeMap<Integer, String> map = new TreeMap<>();

map.put(103, "C");
map.put(101, "A");
map.put(102, "B");

System.out.println(map);
```

Output:

```text
{101=A, 102=B, 103=C}
```

Keys are automatically sorted.

---

## Traversing TreeMap

### keySet()

```java
for(Integer key : map.keySet()){
    System.out.println(key);
}
```

---

### values()

```java
for(String value : map.values()){
    System.out.println(value);
}
```

---

### entrySet()

```java
for(Map.Entry<Integer,String> entry : map.entrySet()){
    System.out.println(entry.getKey() + " " + entry.getValue());
}
```

---

## Time Complexities

| Operation | Complexity |
|------------|------------|
| put() | O(log n) |
| get() | O(log n) |
| remove() | O(log n) |
| containsKey() | O(log n) |
| firstKey() | O(log n) |
| lastKey() | O(log n) |

---

## Advantages

- Keys Remain Sorted
- Fast Searching
- Fast Insertion
- Supports Range Queries
- Useful in Ordered Data

---

## Disadvantages

- Slower than HashMap
- More Memory Usage
- No Null Keys Allowed

---

## HashMap vs TreeMap

| Feature | HashMap | TreeMap |
|----------|----------|----------|
| Ordering | No | Sorted |
| Internal DS | Hash Table | Red-Black Tree |
| Search | O(1) | O(log n) |
| Insert | O(1) | O(log n) |
| Delete | O(1) | O(log n) |
| Null Key | Allowed | Not Allowed |

---

## Common Interview Questions

### Does TreeMap maintain sorting?

Yes.

---

### Which data structure is used internally?

Red-Black Tree.

---

### Does TreeMap allow duplicate keys?

No.

---

### Does TreeMap allow duplicate values?

Yes.

---

### Does TreeMap allow null keys?

No.

---

### Does TreeMap allow null values?

Yes.

---

## When to Use TreeMap?

Use TreeMap when:

- Sorted keys are required.
- Range queries are required.
- Ordered traversal is needed.

---

## Revision Notes

- Key → Value Pair
- Keys Automatically Sorted
- Uses Red-Black Tree
- O(log n) Search
- O(log n) Insert
- O(log n) Delete
- No Null Keys
- Duplicate Values Allowed
- Ordered Version of HashMap