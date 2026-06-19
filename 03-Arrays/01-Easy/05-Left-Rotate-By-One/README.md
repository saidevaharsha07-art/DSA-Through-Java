# Left Rotate Array by One Place

## Problem Statement
Given an array, rotate the array to the left by one position.

## Example
Input: [1, 2, 3, 4, 5]  
Output: [2, 3, 4, 5, 1]

## Optimal Approach
1. Store the first element in a temporary variable.
2. Shift every element one position left.
3. Place the first element at the last index.

## Time Complexity
O(n)

## Space Complexity
O(1)

## Key Learning
- Array shifting
- In-place modification