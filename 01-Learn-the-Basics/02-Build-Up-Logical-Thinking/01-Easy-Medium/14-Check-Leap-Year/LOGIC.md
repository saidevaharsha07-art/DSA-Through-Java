# 14 Check Leap Year

## Logic

A leap year has 366 days instead of 365 days.

## Steps

1. Take input year.
2. Check if year is divisible by 400.
3. Or check if year is divisible by 4 and not divisible by 100.
4. If true, it is a leap year.
5. Otherwise, it is not a leap year.

## Formula

(year % 400 == 0) OR (year % 4 == 0 AND year % 100 != 0)

## Example

Input: 2024

Output: Leap Year
