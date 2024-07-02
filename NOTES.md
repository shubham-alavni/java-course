### Skeleton of Java Program
- Every Java program has a class definition.

### What is Literals in Java?
- Literals are data items that are fixed in value.
- For example, `int x = 10;` where `10` is a literal.
- There are different types of literals in Java:
  - Integer literals
  - Floating-point literals
  - Character literals
  - String literals
  - Boolean literals
  - Null literals
- Integer literals can be written in decimal, octal, or hexadecimal form.
- Floating-point literals can be written in decimal or scientific notation.
- Character literals are enclosed in single quotes.
- String literals are enclosed in double quotes.
- Boolean literals can be either `true` or `false`.

### What are four types are integral? And why are they called integral?
### How negative numbers are stored in memory? in Java
### How floating-point numbers are stored in memory? in Java
### What is the difference between float and double in Java?
### What is the difference between int and Integer in Java?
### Interpreter vs Compiler - What is the difference?
### why java need class file and java file?
### Why java is hybrid language?
### javac needed to compile java file. That creates class file. Then why we need java command to run the class file?
### explain JVM architecture in detail
### Features of Java explain in detail with examples
### explain coercion in Java
### difference between print, println, printf, format in Java
- `print` - prints the string inside the parentheses and the cursor remains on the same line. example: `System.out.print("Hello World");`
- `println` - prints the string inside the parentheses and moves the cursor to the next line. example: `System.out.println("Hello World");`
- `printf` - prints the string inside the parentheses and allows you to format the output using format specifiers. example: `System.out.printf("Hello %s", "World");`
- `format` - same as `printf` but it is a method of the `PrintStream` class. example: `System.out.format("Hello %s", "World");`
### String object creation in Java and types of string constructors
### Same literal string assigned to two different reference variables. How many objects are created?
- Only one object is created in the heap memory and both reference variables point to the same object.
- But if you create a new string object using the `new` keyword, then a new object is created in the heap memory.
- Example:
        ```java
          String s1 = "Hello";
          String s2 = "Hello";
          String s3 = new String("Hello");
        ```
### 