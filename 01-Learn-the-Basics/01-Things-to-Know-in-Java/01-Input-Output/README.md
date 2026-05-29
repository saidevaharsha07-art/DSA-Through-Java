# ☕ Java Basic Input / Output (SUPER NOTES)

---

# 1. Program Structure

Every Java program starts with a class and a `main()` method.

```java
public class Main {
    public static void main(String[] args) {

    }
}
```

### Memory Trick

```text
Class
 ↓
main()
 ↓
Code
```

---

# 2. Output in Java

Use:

```java
System.out.print();
```

or

```java
System.out.println();
```

### Example

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hey, Striver!");
    }
}
```

### Output

```text
Hey, Striver!
```

---

# 3. Print vs Println

## print()

Prints on same line.

```java
System.out.print("Hello ");
System.out.print("World");
```

### Output

```text
Hello World
```

---

## println()

Prints on next line.

```java
System.out.println("Hello");
System.out.println("World");
```

### Output

```text
Hello
World
```

---

# 4. New Line Character

Use:

```java
\n
```

### Example

```java
System.out.print("Hello\nWorld");
```

### Output

```text
Hello
World
```

---

# 5. Taking Input

Import Scanner:

```java
import java.util.Scanner;
```

Create Scanner Object:

```java
Scanner sc = new Scanner(System.in);
```

---

# 6. Integer Input

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        System.out.println(x);
    }
}
```

### Input

```text
10
```

### Output

```text
10
```

---

# 7. Multiple Integer Inputs

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(x + " " + y);
    }
}
```

### Input

```text
10 20
```

### Output

```text
10 20
```

---

# 8. String Input

## Single Word

```java
String name = sc.next();
```

### Input

```text
Harsha
```

### Output

```text
Harsha
```

---

## Full Sentence

```java
String name = sc.nextLine();
```

### Input

```text
Sai Deva Harsha
```

### Output

```text
Sai Deva Harsha
```

---

# 9. Character Input

```java
char ch = sc.next().charAt(0);
```

### Input

```text
A
```

### Output

```text
A
```

---

# 10. Double Input

```java
double d = sc.nextDouble();
```

### Input

```text
10.5
```

### Output

```text
10.5
```

---

# 11. Float Input

```java
float f = sc.nextFloat();
```

---

# 12. Long Input

```java
long n = sc.nextLong();
```

---

# 13. Boolean Input

```java
boolean flag = sc.nextBoolean();
```

### Input

```text
true
```

### Output

```text
true
```

---

# 14. Common Scanner Methods

| Method           | Data Type            |
| ---------------- | -------------------- |
| nextInt()        | int                  |
| nextLong()       | long                 |
| nextFloat()      | float                |
| nextDouble()     | double               |
| next()           | String (single word) |
| nextLine()       | String (full line)   |
| next().charAt(0) | char                 |
| nextBoolean()    | boolean              |

---

# 15. Example Program

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        String name = sc.next();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        sc.close();
    }
}
```

### Input

```text
18 Harsha
```

### Output

```text
Name: Harsha
Age: 18
```

---

# ⚠ Common Mistake

```java
String s = sc.nextLine();
```

after

```java
int x = sc.nextInt();
```

may skip input because of leftover newline.

### Fix

```java
sc.nextLine();
String s = sc.nextLine();
```

---

# 🎯 Interview / Viva Questions

### What is Scanner?

Scanner is a class used to take input from the user.

---

### Difference between print() and println()?

```text
print()   → Same Line
println() → New Line
```

---

### Difference between next() and nextLine()?

```text
next()     → One Word
nextLine() → Entire Line
```

---

### How to take Character Input?

```java
char ch = sc.next().charAt(0);
```

---

# 🚀 Last Minute Revision

```text
Output:
System.out.print()
System.out.println()

Input:
Scanner sc = new Scanner(System.in);

int     → nextInt()
long    → nextLong()
float   → nextFloat()
double  → nextDouble()
String  → next()
Sentence→ nextLine()
char    → next().charAt(0)

print()   → Same Line
println() → New Line

next()     → One Word
nextLine() → Full Sentence
```