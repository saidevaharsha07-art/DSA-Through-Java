# 🎯 Valid Anagram - LeetCode 242

## Problem Statement

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

An Anagram is a word formed by rearranging the letters of another word using all original letters exactly once.

---

## Example 1

```text
Input:
s = "anagram"
t = "nagaram"

Output:
true
```

---

## Example 2

```text
Input:
s = "rat"
t = "car"

Output:
false
```

---

## Approach

Use Character Hashing.

Count frequency of each character in the first string.

Subtract frequency using the second string.

If all frequencies become 0, both strings are anagrams.

---

## Algorithm

1. If lengths are different → return false.
2. Create hash array of size 26.
3. Traverse first string and increase frequency.
4. Traverse second string and decrease frequency.
5. Check hash array.
6. If any frequency is not 0 → return false.
7. Otherwise return true.

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

Character Hashing is useful for:

- Anagrams
- Character Frequency
- String Matching
- Sliding Window Problems

---

## Revision Formula

```java
hash[s.charAt(i) - 'a']++;
hash[t.charAt(i) - 'a']--;
```