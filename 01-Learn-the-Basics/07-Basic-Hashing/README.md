# 🎯 Hashing - Master Revision Notes

---

# What is Hashing?

Hashing is a technique used to store and retrieve data efficiently.

It is mainly used for:

✅ Frequency Counting

✅ Fast Searching

✅ Duplicate Detection

✅ Pair Sum Problems

✅ Majority Element Problems

---

# Why Hashing?

### Without Hashing

```java
for(int i = 0; i < n; i++){
    count = 0;
    for(int j = 0; j < n; j++){
        if(arr[i] == arr[j]){
            count++;
        }
    }
}
```

### Time Complexity

```
O(N²)
```

---

### With Hashing

```java
for(int i = 0; i < n; i++){
    hash[arr[i]]++;
}
```

### Time Complexity

```
O(N)
```

Much Faster 🚀

---

# Basic Idea

### Array

```
1 2 1 3 2 1
```

### Hash Array

```
Index : 0 1 2 3
Value : 0 3 2 1
```

### Meaning

```
1 occurs 3 times
2 occurs 2 times
3 occurs 1 time
```

---

# Number Hashing

## Frequency Count

```java
int arr[] = {1,2,1,3,2,1};

int hash[] = new int[13];

for(int i = 0; i < arr.length; i++){
    hash[arr[i]]++;
}
```

### Query

```java
System.out.println(hash[1]);
```

### Output

```
3
```

---

# Character Hashing

### String

```
abacaba
```

### Hash Array

```java
int hash[] = new int[26];

for(int i = 0; i < s.length(); i++){
    hash[s.charAt(i) - 'a']++;
}
```

### Frequency of 'a'

```java
hash['a' - 'a']
```

### Output

```
4
```

---

# ASCII Values

```
a = 97
b = 98
c = 99

A = 65
B = 66
C = 67
```

---

# Lowercase Character Hashing

```java
hash[s.charAt(i) - 'a']++;
```

### Mapping

```
a → 0
b → 1
c → 2
...
z → 25
```

### Hash Array Size

```java
int hash[] = new int[26];
```

---

# Uppercase Character Hashing

```java
hash[s.charAt(i) - 'A']++;
```

### Mapping

```
A → 0
B → 1
C → 2
...
Z → 25
```

---

# Complete Character Hashing

For both uppercase and lowercase characters:

```java
int hash[] = new int[256];
```

```java
hash[s.charAt(i)]++;
```

Works using ASCII values.

---

# HashMap

Use HashMap when:

✔ Numbers are very large

✔ Negative numbers exist

✔ Range is unknown

---

## Frequency Count Using HashMap

```java
HashMap<Integer, Integer> map = new HashMap<>();

for(int num : arr){
    map.put(num, map.getOrDefault(num, 0) + 1);
}
```

---

## Query Frequency

```java
System.out.println(map.get(5));
```

### Output

```
Frequency of 5
```

---

# Highest Frequency Element

```java
int maxFreq = 0;
int element = -1;

for(int i = 0; i < hash.length; i++){
    if(hash[i] > maxFreq){
        maxFreq = hash[i];
        element = i;
    }
}
```

---

# Lowest Frequency Element

```java
int minFreq = Integer.MAX_VALUE;
int element = -1;

for(int i = 0; i < hash.length; i++){
    if(hash[i] > 0 && hash[i] < minFreq){
        minFreq = hash[i];
        element = i;
    }
}
```

---

# Time Complexities

| Operation | Complexity |
|------------|------------|
| Array Access | O(1) |
| Hash Array Frequency Count | O(N) |
| HashMap Insert | O(1) Average |
| HashMap Search | O(1) Average |
| Brute Force Frequency Count | O(N²) |

---

# Interview Questions

## Easy

✅ Count Frequencies

✅ Highest Frequency Element

✅ Lowest Frequency Element

✅ Character Frequency

---

## Medium

✅ Majority Element

✅ Two Sum

✅ Find Duplicates

✅ First Non-Repeating Character

---

# Important Formulae

## Number Hashing

```java
hash[arr[i]]++;
```

---

## Lowercase Character Hashing

```java
hash[s.charAt(i) - 'a']++;
```

---

## Uppercase Character Hashing

```java
hash[s.charAt(i) - 'A']++;
```

---

## ASCII Hashing

```java
hash[s.charAt(i)]++;
```

---

## HashMap Frequency

```java
map.put(x, map.getOrDefault(x, 0) + 1);
```

---

# Quick Revision (30 Seconds)

```
Hashing = Frequency Counting

Array Hashing
→ Small Range

Character Hashing
→ Strings

HashMap
→ Large Range / Negative Numbers

Frequency Count
→ O(N)

HashMap Operations
→ O(1) Average

Most Common Uses:
• Frequency Count
• Majority Element
• Two Sum
• Duplicates
```

---

# Key Takeaway

> Hashing is one of the most important foundations in DSA.
>
> Once you master Hashing, many Array, String, Sliding Window, Two Pointer, and Interview problems become significantly easier.

🚀 Learn Once. Use Everywhere.