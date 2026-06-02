# 18 Rotate Array by K Places

## Logic

Rotate the array by K positions by moving elements from the beginning to the end.

## Steps

1. Take array input.
2. Take value K as input.
3. Reduce K using K = K % n.
4. Repeat rotation K times.
5. In each rotation, move the first element to the end.
6. Shift remaining elements to the left.
7. Print the rotated array.
