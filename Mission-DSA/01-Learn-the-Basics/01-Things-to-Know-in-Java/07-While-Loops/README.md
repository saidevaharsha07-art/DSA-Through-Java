# 07 While Loops

## Introduction

A while loop is used when the number of iterations is not known beforehand.

It continues executing as long as the given condition remains true.

While loops are heavily used in:

- Number Problems
- Digit Extraction
- Reverse Number
- Palindrome Number
- Armstrong Number
- GCD/HCF
- Binary Conversion

---

## Syntax

```java
while(condition){
    // code
}
```

### Example

```java
int i = 1;

while(i <= 5){
    System.out.println(i);
    i++;
}
```

### Output

```text
1
2
3
4
5
```

---

## Printing Numbers from 1 to N

```java
int n = 5;
int i = 1;

while(i <= n){
    System.out.print(i + " ");
    i++;
}
```

### Output

```text
1 2 3 4 5
```

---

## Printing Numbers from N to 1

```java
int i = 5;

while(i >= 1){
    System.out.print(i + " ");
    i--;
}
```

### Output

```text
5 4 3 2 1
```

---

## Sum of First N Numbers

```java
int n = 5;
int i = 1;
int sum = 0;

while(i <= n){
    sum += i;
    i++;
}

System.out.println(sum);
```

### Output

```text
15
```

---

## Count Digits in a Number

```java
int n = 12345;
int count = 0;

while(n > 0){
    count++;
    n /= 10;
}

System.out.println(count);
```

### Output

```text
5
```

---

## Reverse a Number

```java
int n = 1234;
int rev = 0;

while(n > 0){
    int digit = n % 10;
    rev = rev * 10 + digit;
    n /= 10;
}

System.out.println(rev);
```

### Output

```text
4321
```

---

## Palindrome Number

```java
int n = 121;
int temp = n;
int rev = 0;

while(n > 0){
    int digit = n % 10;
    rev = rev * 10 + digit;
    n /= 10;
}

if(temp == rev){
    System.out.println("Palindrome");
}
```

---

## Do-While Loop

A do-while loop executes at least once.

### Syntax

```java
do{
    // code
}
while(condition);
```

### Example

```java
int i = 1;

do{
    System.out.println(i);
    i++;
}
while(i <= 5);
```

### Output

```text
1
2
3
4
5
```

---

## Difference Between While and Do-While

| While Loop              | Do-While Loop           |
| ----------------------- | ----------------------- |
| Condition checked first | Condition checked later |
| May execute zero times  | Executes at least once  |

---

## Infinite While Loop

```java
while(true){
    System.out.println("Hello");
}
```

This loop runs forever until stopped.

---

## Important Points

1. Condition is checked before execution.
2. Update variables properly.
3. Avoid infinite loops.
4. While loops are useful when iterations are unknown.
5. Most digit-based problems use while loops.

---

## Common Mistakes

### Forgetting Update Statement

Wrong ❌

```java
int i = 1;

while(i <= 5){
    System.out.println(i);
}
```

Results in an infinite loop.

---

### Wrong Condition

Wrong ❌

```java
while(i > 5)
```

Loop will never execute if i starts from 1.

---

## Interview Questions

### Difference between For Loop and While Loop?

- For Loop → when iterations are known.
- While Loop → when iterations are unknown.

### Difference between While and Do-While?

- While checks condition first.
- Do-While executes at least once.

### Can a While Loop be Infinite?

Yes.

```java
while(true)
```

creates an infinite loop.

---

## Striver A2Z Connection

While Loops are heavily used in:

- Count Digits
- Reverse Number
- Palindrome Number
- Armstrong Number
- GCD/HCF
- Decimal to Binary
- Binary to Decimal

Master While Loops before solving Number Theory problems.
