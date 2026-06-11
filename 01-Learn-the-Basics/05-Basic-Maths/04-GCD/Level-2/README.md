# Level 2 - GCD Using Euclid's Algorithm

## Question

Write a Java program to find the GCD of two numbers using Euclid's Algorithm.

## Example

Input:
12 18

Output:
6

## Logic

GCD(a,b) = GCD(b,a%b)

Repeat until b becomes 0.

The remaining value of a is the answer.

## Hint

```java
while(b != 0){
    int rem = a % b;
    a = b;
    b = rem;
}
```

Answer:

```java
System.out.println(a);
```