#  Frequency Count

## Definition

Frequency Count is a technique used to count how many times each element appears in an array or string.

It is one of the most common applications of Hashing.

---

## Why Frequency Count?

Instead of repeatedly traversing the array to count occurrences, we store frequencies using a HashMap.

Example:

```text
Array:
1 2 2 3 3 3

Frequency:
1 → 1
2 → 2
3 → 3
```

---

## Approach 1 : Brute Force

### Idea

For every element:

Count how many times it appears.

### Pseudocode

```text
for each element

    count occurrences

    print frequency
```

### Complexity

```text
Time Complexity : O(n²)

Space Complexity : O(1)
```

---

# Approach 2 : Using HashMap (Optimal)

## Idea

Store:

Key   → Element

Value → Frequency

Example:

```text
1 → 1

2 → 2

3 → 3
```

---

## Algorithm

1. Create HashMap
2. Traverse the array
3. Increase frequency
4. Print frequencies

---

## Java Program

```java
import java.util.HashMap;

public class code {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 3, 3};

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println(map);
    }
}
```

### Output

```text
{1=1, 2=2, 3=3}
```

---

# Understanding getOrDefault()

Example:

```java
map.getOrDefault(num, 0)
```

Meaning:

```text
If key exists

    return its value

Else

    return 0
```

Example:

```text
num = 2

Map:

2 → 3

Returns:

3
```

If key doesn't exist:

```text
Returns:

0
```

---

# Dry Run

Array:

```text
1 2 2 3 3 3
```

Initially:

```text
{}
```

Read 1:

```text
{1=1}
```

Read 2:

```text
{1=1, 2=1}
```

Read 2:

```text
{1=1, 2=2}
```

Read 3:

```text
{1=1, 2=2, 3=1}
```

Read 3:

```text
{1=1, 2=2, 3=2}
```

Read 3:

```text
{1=1, 2=2, 3=3}
```

Final Answer:

```text
{1=1, 2=2, 3=3}
```

---

# Character Frequency Count

## Problem

Count frequency of characters in a string.

Input:

```text
banana
```

Output:

```text
b → 1

a → 3

n → 2
```

---

## Java Program

```java
import java.util.HashMap;

public class code {
    public static void main(String[] args) {

        String str = "banana";

        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : str.toCharArray()) {

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println(map);
    }
}
```

Output:

```text
{a=3, b=1, n=2}
```

---

# Find Highest Frequency Element

## Problem

Find the element occurring maximum number of times.

Array:

```text
1 2 2 3 3 3
```

Output:

```text
3
```

---

## Java Program

```java
import java.util.HashMap;

public class code {
    public static void main(String[] args) {

        int[] arr = {1,2,2,3,3,3};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr) {
            map.put(num, map.getOrDefault(num,0)+1);
        }

        int maxFreq = 0;
        int answer = -1;

        for(int key : map.keySet()) {

            if(map.get(key) > maxFreq) {
                maxFreq = map.get(key);
                answer = key;
            }
        }

        System.out.println(answer);
    }
}
```

Output:

```text
3
```

---

# Applications

### 1. Count Element Occurrences

Most common use case.

### 2. Character Frequency

Used in strings and text processing.

### 3. Majority Element

Find element appearing more than n/2 times.

### 4. Duplicate Detection

Check if duplicates exist.

### 5. Anagram Problems

Compare character frequencies.

---

# Key Points

- Frequency Count stores occurrence count of elements.
- HashMap provides O(1) average insertion and lookup.
- getOrDefault() is frequently used.
- Very common in coding interviews.
- Foundation for advanced HashMap problems.

---

## Complexity Analysis

### Using HashMap

```text
Time Complexity : O(n)

Space Complexity : O(n)
```

---

# Interview Definition

Frequency Count is a hashing technique used to store and count the number of occurrences of elements efficiently using a HashMap.

---

# LeetCode Problems

```text
LC 242 - Valid Anagram

LC 387 - First Unique Character in a String

LC 169 - Majority Element

LC 451 - Sort Characters By Frequency
```

---

# Memory Trick

```text
Element appears?

Increase count.

New element?

Store count as 1.
```

### One-Line Idea

👉 Frequency Count = Count occurrences using HashMap instead of repeatedly traversing the array.