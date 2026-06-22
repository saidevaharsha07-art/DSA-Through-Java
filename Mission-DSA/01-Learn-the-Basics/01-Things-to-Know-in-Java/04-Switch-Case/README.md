# 04 Switch Case

## Introduction

The switch statement is used to execute one block of code from multiple options.

It is an alternative to long if-else-if ladders when checking the same variable against different values.

---

## Syntax

```java
switch(expression){
    case value1:
        // code
        break;

    case value2:
        // code
        break;

    default:
        // code
}
```

---

## Example

```java
int day = 3;

switch(day){
    case 1:
        System.out.println("Monday");
        break;

    case 2:
        System.out.println("Tuesday");
        break;

    case 3:
        System.out.println("Wednesday");
        break;

    default:
        System.out.println("Invalid Day");
}
```

### Output

```text
Wednesday
```

---

## Break Statement

The break statement stops the execution of the switch block.

### Example

```java
int num = 2;

switch(num){
    case 1:
        System.out.println("One");
        break;

    case 2:
        System.out.println("Two");
        break;
}
```

Without break, execution continues to the next case.

---

## Fall Through

If break is omitted, execution continues to the next case.

### Example

```java
int num = 1;

switch(num){
    case 1:
        System.out.println("One");

    case 2:
        System.out.println("Two");

    case 3:
        System.out.println("Three");
}
```

### Output

```text
One
Two
Three
```

---

## Default Case

The default block executes when no case matches.

### Example

```java
int num = 10;

switch(num){
    case 1:
        System.out.println("One");
        break;

    default:
        System.out.println("Invalid Number");
}
```

### Output

```text
Invalid Number
```

---

## Multiple Cases

Multiple cases can execute the same code.

### Example

```java
char grade = 'B';

switch(grade){
    case 'A':
    case 'B':
        System.out.println("Pass");
        break;

    default:
        System.out.println("Fail");
}
```

---

## Modern Switch Expression (Java 14+)

### Example

```java
int day = 2;

String result = switch(day){
    case 1 -> "Monday";
    case 2 -> "Tuesday";
    case 3 -> "Wednesday";
    default -> "Invalid";
};

System.out.println(result);
```

### Output

```text
Tuesday
```

---

## Important Points

1. switch works with int, char, String, enum, etc.
2. break prevents fall-through.
3. default is optional.
4. Only one case executes when break is used.
5. Modern switch expressions are cleaner and shorter.

---

## Common Mistakes

### Forgetting break

Wrong ❌

```java
case 1:
    System.out.println("One");

case 2:
    System.out.println("Two");
```

Output:

```text
One
Two
```

---

### Duplicate Cases

Wrong ❌

```java
case 1:
case 1:
```

A switch cannot contain duplicate case values.

---

## Interview Questions

### Difference between if-else and switch?

- if-else can handle ranges and complex conditions.
- switch is cleaner when checking multiple fixed values.

### What is Fall Through?

Execution continues into the next case when break is not used.

### Is default mandatory?

No, default is optional.

### Which data types are supported in switch?

- int
- char
- String
- enum
- byte
- short
