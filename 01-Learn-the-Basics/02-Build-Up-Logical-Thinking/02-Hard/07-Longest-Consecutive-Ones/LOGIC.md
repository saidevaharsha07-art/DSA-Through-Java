# 07 Longest Consecutive Ones

## Logic

Find the maximum number of continuous 1s present in the array.

## Steps

1. Take array input.
2. Create count = 0 and maxCount = 0.
3. Traverse the array.
4. If the element is 1, increment count.
5. Update maxCount if count becomes larger.
6. If the element is 0, reset count to 0.
7. Print maxCount.
