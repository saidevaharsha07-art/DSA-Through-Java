# 🎯 First Unique Character in a String - LeetCode 387

## Problem Statement

Given a string `s`, find the first non-repeating character in it and return its index.

If it does not exist, return -1.

---

## Example 1

```text
Input: s = "leetcode"
Output: 0
```

Explanation:

'l' appears only once and is the first unique character.

---

## Example 2

```text
Input: s = "loveleetcode"
Output: 2
```

Explanation:

'v' is the first non-repeating character.

---

## Example 3

```text
Input: s = "aabb"
Output: -1
```

---

## Approach

Use Character Hashing.

1. Count frequency of each character.
2. Traverse the string again.
3. Return the first character whose frequency is 1.

---

## Algorithm

1. Create hash array of size 26.
2. Count frequencies.
3. Traverse string.
4. If frequency of character is 1:
   - Return its index.
5. Return -1 if no unique character exists.

---

## Time Complexity

```text
O(N)
```

## Space Complexity

```text
O(1)
```

---

## Key Learning

Character Hashing helps solve:

- Frequency Counting
- Anagrams
- Unique Character Problems
- Sliding Window Problems

---

## Revision Formula

```java
hash[s.charAt(i) - 'a']++;
```