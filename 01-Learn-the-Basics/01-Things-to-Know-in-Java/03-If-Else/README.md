# 🔀 Java If-Else Statements - Super Notes

## 1. What are Conditional Statements?

Conditional statements help a program make decisions.

```text
Condition True  → Execute One Block
Condition False → Execute Another Block
```

### Real Life Example

```text
Age >= 18
↓
Adult

Age < 18
↓
Minor
```

---

# 2. if Statement

Used when we want to execute code only when a condition is true.

### Syntax

```java
if(condition){
    // code
}
```

### Example

```java
int age = 20;

if(age >= 18){
    System.out.println("Adult");
}
```

### Output

```text
Adult
```

---

# 3. if-else Statement

Used when we have two possible outcomes.

### Syntax

```java
if(condition){
    // true block
}
else{
    // false block
}
```

### Example

```java
int age = 16;

if(age >= 18){
    System.out.println("Adult");
}
else{
    System.out.println("Minor");
}
```

### Output

```text
Minor
```

---

# 4. User Input Example

```java
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("You are an adult.");
        }
        else{
            System.out.println("You are not an adult.");
        }

        sc.close();
    }
}
```

### Input

```text
20
```

### Output

```text
You are an adult.
```

---

# 5. if-else-if Ladder

Used when there are multiple conditions.

### Syntax

```java
if(condition1){

}
else if(condition2){

}
else if(condition3){

}
else{

}
```

---

# 6. Grade Example

```java
int marks = 54;

if(marks < 25){
    System.out.println("Grade F");
}
else if(marks <= 44){
    System.out.println("Grade E");
}
else if(marks <= 49){
    System.out.println("Grade D");
}
else if(marks <= 59){
    System.out.println("Grade C");
}
else if(marks <= 69){
    System.out.println("Grade B");
}
else{
    System.out.println("Grade A");
}
```

### Output

```text
Grade C
```

---

# 7. Why Simplified Conditions Work?

Instead of:

```java
marks >= 25 && marks <= 44
```

we can write:

```java
marks <= 44
```

because:

```text
Previous conditions already failed.
```

Example:

```java
if(marks < 25)
```

fails.

Therefore:

```text
marks is automatically >= 25
```

So:

```java
else if(marks <= 44)
```

is enough.

---

# 8. Nested If

An if inside another if.

### Syntax

```java
if(condition1){

    if(condition2){

    }

}
```

### Example

```java
int age = 20;
boolean voterId = true;

if(age >= 18){

    if(voterId){
        System.out.println("Can Vote");
    }

}
```

### Output

```text
Can Vote
```

---

# 9. Even or Odd

```java
int n = 7;

if(n % 2 == 0){
    System.out.println("Even");
}
else{
    System.out.println("Odd");
}
```

### Output

```text
Odd
```

---

# 10. Positive, Negative or Zero

```java
int n = -5;

if(n > 0){
    System.out.println("Positive");
}
else if(n < 0){
    System.out.println("Negative");
}
else{
    System.out.println("Zero");
}
```

---

# 11. Largest of Two Numbers

```java
int a = 10;
int b = 20;

if(a > b){
    System.out.println(a);
}
else{
    System.out.println(b);
}
```

### Output

```text
20
```

---

# 12. Largest of Three Numbers

```java
int a = 10;
int b = 30;
int c = 20;

if(a >= b && a >= c){
    System.out.println(a);
}
else if(b >= a && b >= c){
    System.out.println(b);
}
else{
    System.out.println(c);
}
```

### Output

```text
30
```

---

# 13. Relational Operators

| Operator | Meaning            |
| -------- | ------------------ |
| ==       | Equal              |
| !=       | Not Equal          |
| >        | Greater Than       |
| <        | Less Than          |
| >=       | Greater Than Equal |
| <=       | Less Than Equal    |

Example:

```java
System.out.println(10 > 5);
```

Output:

```text
true
```

---

# 14. Logical Operators

## AND (&&)

Both conditions must be true.

```java
if(age >= 18 && citizen == true)
```

---

## OR (||)

At least one condition must be true.

```java
if(age >= 18 || permission == true)
```

---

## NOT (!)

Reverses result.

```java
if(!isLoggedIn)
```

---

# 15. Common Mistakes

## Wrong

```java
if(age = 18)
```

Assignment operator used.

---

## Correct

```java
if(age == 18)
```

Comparison operator used.

---

# 16. Flow Chart

```text
       Condition
           ↓
        True?
       /     \
     Yes      No
      ↓        ↓
   If Block  Else Block
```

---

# 🎯 Viva Questions

### What is an if statement?

Executes code only when condition is true.

---

### What is else?

Runs when if condition becomes false.

---

### What is else-if ladder?

Used to check multiple conditions.

---

### What is Nested If?

An if statement inside another if statement.

---

### Difference between == and = ?

```text
=  → Assignment
== → Comparison
```

---

# 🚀 Last Minute Revision

```text
if
↓
One Condition

if - else
↓
Two Outcomes

if - else if - else
↓
Multiple Conditions

Nested If
↓
If inside If

Operators

== Equal
!= Not Equal
>  Greater
<  Less
>= Greater Equal
<= Less Equal

&& AND
|| OR
!  NOT

Mistake:
=  Assignment
== Comparison
```