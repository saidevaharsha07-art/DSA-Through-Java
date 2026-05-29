# 🔀 Java Switch Case - Super Notes

## What is Switch Case?

Switch is used when one variable needs to be compared with multiple values.

### Syntax

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

## Example

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();

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

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid");
        }

        sc.close();
    }
}
```

## Why break?

Without break:

```java
case 1:
    System.out.println("Monday");

case 2:
    System.out.println("Tuesday");
```

Output:

```text
Monday
Tuesday
```

This is called Fall Through.

### With break

```java
case 1:
    System.out.println("Monday");
    break;
```

Output:

```text
Monday
```

## Default Case

Runs when no case matches.

```java
default:
    System.out.println("Invalid");
```

## Supported Types

```java
int
char
String
enum
```

## Example with Character

```java
char grade = 'B';

switch(grade){

    case 'A':
        System.out.println("Excellent");
        break;

    case 'B':
        System.out.println("Good");
        break;

    default:
        System.out.println("Not Specified");
}
```

## Switch vs If Else

| Switch | If Else |
|----------|----------|
| Multiple Exact Values | Complex Conditions |
| Faster Readability | More Flexible |
| Cleaner Code | More Powerful |

## Viva Questions

### What is Switch?

Used to compare one variable against multiple values.

### What is break?

Stops execution of remaining cases.

### What is default?

Runs when no case matches.

### What is Fall Through?

Executing subsequent cases when break is omitted.

## Last Minute Revision

```text
switch → Multiple Choices

case → Value Match

break → Exit Switch

default → No Match

Fall Through → Missing break
```