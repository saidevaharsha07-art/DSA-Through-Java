# ArrayList in Java

## What is ArrayList?

ArrayList is a dynamic array provided by Java Collections Framework.

Unlike normal arrays, ArrayList can grow and shrink automatically.

---

## Import

```java
import java.util.ArrayList;
```

---

## Creating an ArrayList

```java
ArrayList<Integer> list = new ArrayList<>();
```

```java
ArrayList<String> names = new ArrayList<>();
```

---

## Common Methods

### add()

Adds an element to the end.

```java
list.add(10);
list.add(20);
```

Output:

```text
[10, 20]
```

---

### get()

Access an element using index.

```java
System.out.println(list.get(0));
```

Output:

```text
10
```

---

### set()

Update an element.

```java
list.set(0, 100);
```

Output:

```text
[100, 20]
```

---

### remove()

Remove an element by index.

```java
list.remove(0);
```

Output:

```text
[20]
```

---

### size()

Returns number of elements.

```java
System.out.println(list.size());
```

Output:

```text
1
```

---

### contains()

Checks if an element exists.

```java
System.out.println(list.contains(20));
```

Output:

```text
true
```

---

### isEmpty()

Checks whether ArrayList is empty.

```java
System.out.println(list.isEmpty());
```

Output:

```text
false
```

---

### clear()

Removes all elements.

```java
list.clear();
```

Output:

```text
[]
```

---

## Traversing ArrayList

### Using for loop

```java
for(int i = 0; i < list.size(); i++){
    System.out.print(list.get(i) + " ");
}
```

---

### Using for-each loop

```java
for(int num : list){
    System.out.print(num + " ");
}
```

---

## Advantages

- Dynamic Size
- Easy Insertion
- Easy Deletion
- Built-in Methods
- Part of Java Collections Framework

---

## Disadvantages

- Slower than arrays
- Uses extra memory
- Insertion/Deletion in middle takes time

---

## Time Complexity

| Operation | Complexity |
|------------|------------|
| add()      | O(1) |
| get()      | O(1) |
| set()      | O(1) |
| remove()   | O(n) |
| contains() | O(n) |
| size()     | O(1) |

---

## Revision Points

- ArrayList is a dynamic array.
- Import using `java.util.ArrayList`.
- Index starts from 0.
- Use `add()` to insert.
- Use `get()` to access.
- Use `set()` to update.
- Use `remove()` to delete.
- Use `size()` to get length.
- Use `contains()` to search.