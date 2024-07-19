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
### What is behavior of `==` operator for string objects in Java?
### == vs equals() method in Java
- `==` operator is used to compare the reference of two objects.
- `equals()` method is used to compare the content of two objects.
### when you use those methods which are modifying the string object, then why the string object is immutable?
- In Java, strings are immutable, which means that once a string object is created, it cannot be modified.
- When you use methods like `concat()`, `substring()`, `replace()`, etc., a new string object is created in the heap memory.
- The original string object remains unchanged.
- reference is pointing to the new object.
### what are the methods in java?
### what is the difference between actual and formal parameters?
- Actual parameters are the values passed to a method when it is called.
- Formal parameters are the variables declared in the method signature.
- Actual parameters are used to initialize the formal parameters.
- Actual parameters are also called arguments.
### why main method is static in Java?
### what is the difference between static and non-static methods in Java?
### Why only static methods can be called in the main method?
- The `main` method is static because it is called by the JVM before any objects are created.
- Static methods can be called without creating an object of the class.
- The `main` method is the entry point of a Java program, and it needs to be static so that the JVM can call it without creating an object of the class.
### call by value vs call by reference in Java
### parameter vs argument in Java
- A parameter is a variable in a method definition.
- An argument is the actual value that is passed to the method when it is called.
- Parameters are used to define the type and number of values that a method can accept.
### What is variable argument in Java? Explain in detail
### Why String args[] in main method?
- The `main` method in Java takes an array of strings as an argument because it allows you to pass command-line arguments to the program.
- The `String[] args` parameter in the `main` method is used to store the command-line arguments passed to the program when it is executed.
### explain abstraction in Java in detail, With analogy, example, interview perspective
- Abstraction is the process of hiding the implementation details and showing only the essential features of an object.
- It is one of the four fundamental OOP concepts.
- Abstraction allows you to focus on what an object does rather than how it does it.
- Example: A car is an abstraction of a vehicle. You don't need to know how the engine works to drive a car.
- Abstraction is achieved in Java using abstract classes and interfaces.
### Advantages of Encapsulation in Java, only advantages
- advantages
  - Encapsulation improves code maintainability and reusability.
  - Encapsulation protects the internal state of an object from external access.
  - Encapsulation allows you to change the internal implementation of a class without affecting its external interface.
  - Encapsulation helps in reducing complexity and increasing modularity.
  - Encapsulation makes code easier to understand and debug.
  - Encapsulation promotes data hiding and information hiding.
### What is Data Hiding in Java? Explain in detail
### What is the use of the Private constructor in Java? Actual use case
### what is Method Overriding, why it is used, Explain in detail
### what is Dynamic Method Dispatch in Java? Explain in detail
### what is super keyword in Java? Explain in detail
### what is this keyword in Java? Explain in detail
### what is the difference between this() and super() in Java?
### what is abstract class in Java? Explain in detail
### why abstract classes is used in Java? explain with example and actual Use case
### Abstarct classes vs Concrete classes in Java
### what is abstract method in Java? Explain in detail, what is the use case?
### why we can't create an object of an abstract class in Java?
- An abstract class cannot be instantiated because it may contain abstract methods that are not implemented.
- To create an object of a class, all the methods must be implemented.
- Abstract classes are meant to be extended by concrete classes that provide implementations for the abstract methods.
- You can create an object of a concrete class that extends the abstract class.
- Use case: Gives flexibility to the child classes to provide their own implementation for the abstract methods.
- Analogy: An abstract class is like a blueprint for a house. You cannot live in a blueprint, but you can use it to build a house.
### what is interface in Java? Explain in detail
### why interface is used in Java? Explain in detail
### what is the difference between abstract class and interface in Java?
- An abstract class can have both abstract and non-abstract methods, while an interface can only have abstract methods.
- A class can extend only one abstract class, but it can implement multiple interfaces.
- An abstract class can have instance variables, constructors, and static methods, while an interface cannot.
- An abstract class can have protected and default access modifiers, while an interface can only have public access modifiers.
- Use case: Use an abstract class when you want to provide a common implementation for multiple classes. Use an interface when you want to define a contract that multiple classes can implement.
- Example: An abstract class `Shape` with a method `draw()` and an interface `Drawable` with a method `draw()`.
### multiple inheritance in Java using interface
### what is callback method in Java? Explain in detail
### is it mandatory to implement all methods of an interface in concrete class?
### Do's and Don'ts of Interface in Java
- Do's:
  - Variables in an interface are default `public`, `static`, and `final`.
  - Methods in an interface are default `public` and `abstract`.
  - Static methods and default methods can have a body in an interface.
  - Interfaces can extend other interfaces.
### what is default method in Java? Explain in detail
### what are allowed and not allowed things in interfaces in Java?
- Allowed:
  - Variables in an interface are default `public`, `static`, and `final`.
  - Methods in an interface are default `public` and `abstract`.
  - Static methods and default methods can have a body in an interface.
  - Interfaces can extend other interfaces.
- Not Allowed:
  - Variables in an interface cannot be `private` or `protected`.
  - Methods in an interface cannot be `private` or `protected`.
  - Interfaces cannot have constructors.
  - Interfaces cannot have instance fields.
  - Interfaces cannot have static initializers.
### what is use of inner classes in Java? Explain in detail
- Inner classes are used to logically group classes that are only used in one place.
- Inner classes can access the members of the outer class.
- Inner classes can be private, protected, public, or default.
- Inner classes can be static or non-static.
- Inner classes can be local, anonymous, or member classes.
- Use case: Inner classes are used in event handling, GUI programming, and multithreading.
- Example: An inner class can be used to define a custom comparator for sorting a list of objects.
### what is local inner class and anonymous inner class and static inner class in Java? Explain in detail, And actaul use case
- Local Inner Class: A class defined inside a method is called a local inner class.
- Anonymous Inner Class: A class defined without a name is called an anonymous inner class.
- Static Inner Class: A class defined as static inside another class is called a static inner class.
- Use case: Local inner classes are used to define helper classes that are only used in a specific method. Anonymous inner classes are used to define event listeners and handlers. Static inner classes are used to group related classes together.
### what is the use of local inner class in Java? Explain in detail
- Local inner classes are used to define helper classes that are only used in a specific method.
- Local inner classes can access the variables of the enclosing method.
- Local inner classes are not accessible outside the method in which they are defined.
- Use case: Local inner classes are used to define custom comparators for sorting a list of objects.
### what is the use of anonymous inner class in Java? Explain in detail
- Anonymous inner classes are used to define event listeners and handlers.
- Anonymous inner classes do not have a name and are defined inline.
- Anonymous inner classes can access the variables of the enclosing method.
### what is the use of static inner class in Java? Explain in detail
- Static inner classes are used to group related classes together.
- Static inner classes do not have access to the instance variables of the outer class.
- Static inner classes can be instantiated without an instance of the outer class.
- Use case: Static inner classes are used to define utility classes that are closely related to the outer class.
- Example: A `Math` class with static
### Static variables in Java
- Static variables created inside method area.
- Static variables are shared among all instances of a class.
- Static variables are initialized only once when the class is loaded.
- Static variables can be accessed using the class name or object reference.
- Static variables are used to store common data that is shared among all instances of a class.
- Example: A `counter` variable to keep track of the number of instances created.
- Use case: Static variables are used to store constants, configuration values, and shared resources.
### Static methods in Java
- Static methods can be called without creating an object of the class.
- Static methods cannot access instance variables directly.
- Static methods are used to perform operations that do not depend on the state of the object.
- Static methods can have declared in Interface.
- We cannot override static methods.
- `this` and `super` keywords cannot be used in static methods.
- Example: A `Math` class with static
- Use case: Static methods are used to provide utility functions that do not require an instance of the class.
### Static block in Java
- Static blocks are used to initialize static variables.
- Static blocks are executed when the class is loaded into memory.
- Static blocks are executed only once when the class is loaded.
- not commonly used
- Static blocks are used to perform one-time initialization tasks.
- Example: Initializing a static variable with a default value.
- Use case: Static blocks are used to load configuration files, establish database connections, and perform other initialization tasks.
### Final variables in Java
- Final variables are constants that cannot be changed once initialized.
- Final variables must be initialized when declared or in a constructor.
- Final variables can be initialized using blocks, constructors, or directly.
- Final variables can be static or instance variables.
- Final variables are used to define constants that should not be modified.
- Example: A `PI` constant with a value of `3.14159`.
- Use case: Final variables are used to define configuration values, default settings, and other constants.
### Final methods in Java
- Final methods cannot be overridden by subclasses.
- Final methods are used to prevent subclasses from changing the behavior of a method.
- Final methods are declared using the `final` keyword.
- Final methods are used to provide a fixed implementation that should not be modified.
- Example: A `calculateArea()` method in a `Shape` class.
- Use case: Final methods are used to define core functionality that should not be changed by subclasses.
- Analogy: A final method is like a sealed box that cannot be opened or modified.
### Final classes in Java
- Final classes cannot be extended by other classes.
- Final classes are used to prevent inheritance and subclassing.
- Final classes are declared using the `final` keyword.
- Final classes are used to define immutable classes that should not be modified.
- Example: A `String` class in Java.
- Use case: Final classes are used to define utility classes, data transfer objects, and other classes that should not be extended.
- Analogy: A final class is like a closed book that cannot be opened or modified.
### Singleton class in Java
### which datatype is used to store financial values in Java?
- `BigDecimal` is used to store financial values in Java.
- `BigDecimal` is a class in the `java.math` package that provides arbitrary-precision arithmetic.
- `BigDecimal` is used to avoid rounding errors that can occur when using floating-point numbers to represent financial values.
- Example: `BigDecimal amount = new BigDecimal("100.50");`
- Use case: `BigDecimal` is used in banking applications, e-commerce platforms, and other applications that deal with financial transactions.
### Explain the difference between JVM, JRE, and JDK
- JVM (Java Virtual Machine): It is an abstract machine that provides a runtime environment for Java bytecode to be executed.
- JRE (Java Runtime Environment): It is a software package that provides the JVM, libraries, and other components required to run Java applications.
- JDK (Java Development Kit): It is a software development kit that includes the JRE, compiler, debugger, and other tools needed to develop Java applications.
- JVM is the runtime environment that executes Java bytecode. JRE is the runtime environment that provides the JVM and libraries. JDK is the development kit that includes the JRE and tools for developing Java applications.
- Use case: JVM is used to run Java applications. JRE is used to provide the runtime environment for Java applications. JDK is used to develop Java applications.
### Explain access modifiers in Java
- Access modifiers are keywords that control the visibility and accessibility of classes, methods, and variables in Java.
- There are four types of access modifiers in Java:
  - `private`: The member is accessible only within the same class.
  - `default` (no modifier): The member is accessible only within the same package.
  - `protected`: The member is accessible within the same package and by subclasses.
  - `public`: The member is accessible from any class.

| Header 1                       | Private | Protected | Public | Default |
| ------------------------------ | ------- | --------- | ------ | ------- |
| Same Class, Subclass           | Yes     | Yes       | Yes    | Yes     |
| Same Package,Subclass          | No      | Yes       | Yes    | Yes     |
| Same Package,Non-Subclass      | No      | Yes       | Yes    | Yes     |
| Different Package,Subclass     | No      | Yes       | Yes    | No      |
| Different Package,Non-Subclass | No      | No        | Yes    | No      |

- Use case: Access modifiers are used to control the visibility and accessibility of classes, methods, and variables in Java.
### Explain the difference between `==` and `equals()` in Java
- `==` is used to compare the reference of two objects.
- `equals()` is used to compare the content of two objects.
- `==` is used to compare primitive data types and object references.
- `equals()` is used to compare the content of objects.
- Use case: `==` is used to check if two objects are the same instance. `equals()` is used to check if two objects are equal in content.
- Example: `String s1 = "Hello"; String s2 = "Hello"; s1 == s2; s1.equals(s2);`

### Explain the difference between `final`, `finally`, and `finalize` in Java
### What is the difference between Premitive and Non-Premitive data types in Java?

### Why BigDecimal##### List, ArrayList - Type safety
- ~~List is not type safe. You can add any type of elements to the list.~~
- ~~ArrayList is not type safe. You can add any type of elements to the list.~~
- **If you want to make the list type safe, then you can use `List<String> list = new ArrayList<>();`. Here, you can add only `String` type of elements to the list.**
- **If you want to make the list type safe, then you can use `ArrayList<String> list = new ArrayList<>();`. Here, you can add only `String` type of elements to the list.**
- **In a List you cannot add primitive data types. You need to use Wrapper classes. It manages the autoboxing and unboxing.**ng and unboxing.**ring` to create `BigDecimal` object. Because, if you use double or float, then it will introduce rounding errors.
- Example: `BigDecimal amount = new BigDecimal("100.50");`
- Use case: `BigDecimal` is used in banking applications, e-commerce platforms, and other applications that require precise financial calculations.

### what is the difference between `break` and `continue` in Java?
- `break` is used to exit a loop or switch statement.
- `continue` is used to skip the current iteration of a loop and continue with the next iteration.

### What is reference types - How they are stored in memory?
- Whenever you create an object, it is stored in the heap memory.
- Whenever you create a reference variable, it is stored in the stack memory. and that stack memory is stored location of the object in the heap memory.
- Whenever you create a primitive variable, it is stored in the stack memory.
- In premitive types, the actual value is stored in the memory. But in reference types, the address of the object is stored in the memory.
- Example: `String s = "Hello";` Here, `s` is a reference variable that stores the address of the `String` object in the heap memory. And if s is assigned to another reference variable, then both reference variables point to the same object in the heap memory.
- Example: `int x = 10;` Here, `x` is a primitive variable that stores the actual value `10` in the memory. And if x is assigned to another variable, then a copy of the value is created in the memory. So, both variables have their own copy of the value. if `y = x;` then both x and y have the same value `10` but they are stored in different memory locations, If you change the value of x, then y will not be changed.
- Each method has its own stack memory. When a method is called, a new stack frame is created in the stack memory to store the local variables, parameters, and return address of the method.
- Objects are stored in the heap memory, an it is globally shared.

### Why string assignment is not needed to use `new` keyword?
- In Java, strings are special because they are immutable, which means that once a string object is created, it cannot be changed.
- When you assign a string literal to a string variable, Java automatically creates a string object in the string pool.
- The string pool is a special area in the heap memory where Java stores string literals to optimize memory usage.
- Example: `String s = "Hello";` Here, Java creates a string object with the value `"Hello"` in the string pool and assigns its reference to the variable `s`.
- If you use the `new` keyword to create a string object, a new object is created in the heap memory, and it is not added to the string pool.
- Example: `String s = new String("Hello");` Here, a new string object is created in the heap memory, and its reference is assigned to the variable `s`.
- Use case: String literals are used to store constant values like messages, error codes, and configuration values.
- Example: `String message = "Hello, World!";`

### String is immutable in Java. What is the reason behind it?

### Why `String` concatenation is not recommended in Java?
- In Java, string concatenation using the `+` operator creates a new string object every time it is used.
- When you concatenate two strings using the `+` operator, Java creates a new string object in the heap memory to store the concatenated value.
- This can lead to performance issues and memory overhead when concatenating multiple strings in a loop or a large number of times.
- To avoid this, you can use the `StringBuilder` or `StringBuffer` classes, which are mutable and more efficient for string concatenation.
- Example: `String result = "Hello" + "World" + "!";` Here, Java creates three string objects in the heap memory to store the concatenated value.
- Use case: Use `StringBuilder` or `StringBuffer` for efficient string concatenation in Java.

### What is the difference between `StringBuffer` and `StringBuilder` in Java?
- `StringBuffer` and `StringBuilder` are classes in the `java.lang` package that are used to create mutable strings in Java.
- `StringBuffer` is synchronized and thread-safe, while `StringBuilder` is not synchronized and not thread-safe.
- `StringBuffer` is slower than `StringBuilder` because of the synchronization overhead.
- `StringBuilder` is faster than `StringBuffer` because it is not synchronized and does not have the synchronization overhead.
- `StringBuffer` is synchronized, i.e., thread-safe and therefore, it assures that no two threads will be able to access it simultaneously. On the other hand, `StringBuilder` is unsynchronized, i.e., not thread-safe. It means two or more threads can access it simultaneously.

### What are Wrapper classes, why Wrapper classes ?
- Wrapper classes are classes in Java that provide a way to convert primitive data types into objects.
- Wrapper classes are used to represent primitive data types as objects in Java.
- Wrapper classes are final and immutable.
- Wrapper classes are used for creation from other data types, Utility methods, Storage in Collections, and Serialization.

### What is the difference between `new Integer(10)` and `Integer.valueOf(10)` ?
- `new Integer(10)` creates a new `Integer` object with the value `10` every time it is called.
- `Integer.valueOf(10)` returns a cached `Integer` object with the value `10` if the value is within the range `-128` to `127`.
- `Integer.valueOf(10)` is more memory-efficient than `new Integer(10)` because it reuses the cached object for values within the range `-128` to `127`.
- Use case: Use `Integer.valueOf(10)` for memory-efficient integer boxing in Java.
- Example: `Integer i1 = new Integer(10); Integer i2 = Integer.valueOf(10); Integer i3 = Integer.valueOf(10);`
- In the above example, `i1` is a new `Integer` object, `i2 == i3` is `true` because `Integer.valueOf(10)` returns the same cached object.

### What is Autoboxing wrapper classes ?
- Autoboxing is the process of automatically converting a primitive data type into its corresponding wrapper class object.
- Autoboxing is done by the Java compiler behind the scenes.
- Autoboxing is used to simplify the code, Syntactic sugar.
- Example: `Integer i = 10;` // Autoboxing int to Integer, BTS it is Integer i = Integer.valueOf(10);

### Date and Time related classes in Java
- `LocalDate`, `LocalTime`, `LocalDateTime` explore this.

### Variable Arguments
- Variable arguments are used when the number of arguments passed to a method is not known at compile time.
- Variable arguments are declared using an ellipsis `...` after the data type of the argument.
- Variable arguments are treated as an array in the method body.
- Variable arguments must be the last parameter in the method signature.
- Example: `public void printNumbers(int... numbers) { for (int number : numbers) { System.out.println(number); } }`
- Use case: Variable arguments are used in methods that accept a variable number of arguments, such as `printf()` in Java.

### what are the disadvantages of arrays ?
- Arrays have a fixed size, which cannot be changed once the array is created.
- Arrays do not provide built-in methods for common operations like sorting, searching, and filtering.
- Arrays do not provide type safety, which can lead to runtime errors if the wrong type of data is stored in the array.
- Deleting and inserting elements in an array is inefficient because it requires shifting elements to maintain the order.
- Arrays do not provide dynamic resizing, which can lead to wasted memory if the array size is larger than needed.
- Arrays do not provide built-in support for multidimensional arrays, which can make working with complex data structures difficult.

### Array vs ArrayList in Java
- Arrays are fixed in size, while ArrayLists can dynamically resize.
- Arrays is always type safe, while ArrayList is not type safe.
- Arrays do not provide built-in methods for common operations, while ArrayLists provide methods like `add()`, `remove()`, `get()`, `size()`, etc.
- Arrays can store primitive data types, while ArrayLists can only store objects.
- Arrays are more memory-efficient than ArrayLists because they do not require additional memory for the underlying data structure.
- Arrays are faster than ArrayLists for random access because they use direct indexing.
- Use case: Use arrays when the size is fixed and known in advance. Use ArrayLists when the size is dynamic and needs to be resized.
- Example: `int[] numbers = new int[10]; List<Integer> list = new ArrayList<>();`
- In the above example, `numbers` is an array of integers, and `list` is an ArrayList of integers.
- `numbers[0] = 10; list.add(10);` // Adding elements to the array and ArrayList.

### what is Object Composition?
- Object composition is a design technique in which a class contains an object of another class as a member variable.
- Object composition is used to create complex objects by combining simpler objects.
- Object composition is a form of code reuse and modularity.
- Object composition is used to model has-a relationships between classes.
- Example: A `Customer` class contains an `Address` object as a member variable.
- Use case: Object composition is used to create complex data structures, composite objects, and reusable components.

### Scenario `interface Interface1` having two methods `method1()` and `method2()`. `interface Interface2` has extended `Interface1` and added one more method `method3()`. Now we want override `method1()`, dont want to override `method2()` and `method3()`. How to achieve this?
- You can create an **abstract class** that implements `Interface2` and provides default implementations for `method2()` and `method3()`.

### Scenario `interface Interface1` having two methods `method1()` and `method2()`. And mutiple classes are implementing this interface. Now we want to add one more method `method3()` to `Interface1` without affecting the existing classes. How to achieve this?
- You can create default methods in the interface to provide a default implementation for the new method.
- Default methods were introduced in Java 8 to allow interfaces to have concrete methods without affecting the implementing classes.
- Example: `default void method3() { System.out.println("Default implementation of method3"); }`
- Use case: Default methods are used to add new methods to existing interfaces without breaking the implementing classes.
- Also you can **override** the default method in the **implementing class**.

### Scenario `interface Interface1` I want to add one variable `int x = 10;` to this interface. Is it possible?, If yes, how?
- You can create a constant variable in the interface using the `static` and `final` keywords.
- Constant variables in interfaces are implicitly `public`, `static`, and `final`.
- Normal variables are not allowed in interfaces.
- Example: `public static final int x = 10;`

### Comparison between Abstarct class and Interface in Java
-  Actually there is no relation between Abstract class and Interface. But syntax really looks similar.
-  If **two systems systems, or two components, or two classes talking to each other**, and you want to establish a **contract / Communication** between them, then you can use Interface.
-  Where as **high level design**, where you want to provide some common functionality to the child classes / sub classes, then you can use Abstract class. All level of subclasses meet that structure. Then you can use Abstract class.
-  In Interface, you **cannot** call something as **private**. Everything is public.
-  In Abstract class, you can have **private** methods.
-  In Interface, variables are **public static final** by default **constants**.
-  In Abstract class, you can have all types of variables.
-  Class can **implement multiple** interfaces.
-  Class can **extend only one** Abstract class.

### List collection in Java - List Interface
- Cares about the **order** of the elements.
- Allows **duplicates**.
- Add elements at specific **index**.
- If specific **index** is not provided, then it will add at the end.
- Example - `List<String> list = List.of("A", "B", "C");`
- List is immutable. `of()` method is used to create immutable list.
- Mutable list are - `ArrayList`, `LinkedList`, `Vector`, `Stack`.

### ArrayList vs LinkedList in Java
- ArrayList inserting and deleting elements is **slow** and **costly**.
- LinkedList inserting and deleting elements is **fast** and **cheap**.
- ArrayList is **faster** than LinkedList for **random access**.
- LinkedList is **faster** than ArrayList for **sequential access**. and **slow** for random access.
- ArrayList is **better** for **searching**.
- LinkedList is **better** for **inserting** and **deleting**.
- ArrayList is **better** for **read** operations.
- LinkedList is **better** for **write** operations.

### ArrayList vs Vector in Java
- ArrayList is **not synchronized**.
- Vector is **synchronized**. So, it is **thread safe**.
- **Synchronization** means, only one thread can access the method at a time.
- Example of **synchronized** methods excutions is if you have **two threads** and both are trying to **add** elements to the list at the same time, then only one thread can add the element at a time. Other thread has to wait until the first thread completes the operation.
- **Synchronization** is **costly**. Because, it has to **lock** the method before executing and **unlock** after executing.
- **ArrayList** is **faster** than **Vector**.
- But If there is a **requirement** to **synchronize** the list, then you can use **Vector**.

### List Interface - Methods to add, remove, change elements and lists
- `add()`, `addAll()`, `remove()`, `removeAll()`, `retainAll()`, `clear()`, `set()`, `get()`, `indexOf()`, `lastIndexOf()`, `contains()`, `containsAll()`, `isEmpty()`, `size()`, `toArray()`, `subList()`, `sort()`, `replaceAll()`, `removeIf()`, `forEach()`, `iterator()`, `listIterator()`, `spliterator()`, `stream()`, `parallelStream()`, `copyOf()`, `copyOfRange()`, `of()`, `ofNullable()`, `addIfAbsent()` and many more.

### List, and ArrayList - Iterating around the list
- `for loop`, `for each loop`, `iterator`, `listIterator`, `forEach`, `stream`, `parallelStream`.

### Choosing the right approach for iterating for printing and removing elements from the ArrayList
- If you want to **print** the elements, then you can use **for each loop**.
- If you want to **remove** elements while iterating through a collection, it's recommended to use an **iterator**. Using a **for-each loop** for removal can lead to a **ConcurrentModificationException** because the underlying collection structure is modified while iterating.

### Scenario - You have one ArrayList of integers. You want to remove specific elements from the list. How to achieve this?
- Because you trying to **remove** method at that time , if you use remove method, then it you need to pass the **index** of the element to be removed. If you want to pass the **element** to be removed, then you can use **remove(Object o)** method. Consider ArrayList having 4 elements - 100, 101, 102, 103. If you want to remove 101, then you can use `list.remove(101);`. But it will throw `java.lang.IndexOutOfBoundsException`. Because, it will try to remove the element at index 101. But there is no element at index 101. So, it will throw `java.lang.IndexOutOfBoundsException`. So, you need to pass the element to be removed. So, you can use `list.remove(Integer.valueOf(101));`.

### List, ArrayList - Type safety
- List is not type safe. You can add any type of elements to the list.
- ArrayList is not type safe. You can add any type of elements to the list.
- If you want to make the list type safe, then you can use `List<String> list = new ArrayList<>();`. Here, you can add only `String` type of elements to the list.
- If you want to make the list type safe, then you can use `ArrayList<String> list = new ArrayList<>();`. Here, you can add only `String` type of elements to the list.
- In a List you cannot add primitive data types. You need to use Wrapper classes. It manages the autoboxing and unboxing.

### Collections - Set Interface
- Set is used to store unique elements.
- Set does not allow duplicates.
- Set does not maintain the order of elements.
- Set.of() method is used to create an immutable set.
  
### HashSet - implementations of Set Interface
- HashSet is an implementation of the Set interface.
- HashSet uses a hash table to store elements.
- HashSet does not maintain the order of elements.
- HashSet does not allow duplicates.
- HashSet allows `null` values.
- HashSet is not synchronized.
- HashSet is faster than TreeSet.
- Use case: HashSet is used when you need a collection of unique elements without duplicates.
- Example: `Set<String> set = new HashSet<>();`

### Set Vs HashSet
- Set is an interface, while HashSet is an implementation of the Set interface.
- Set is used to store unique elements, while HashSet is used to store unique elements using a hash table.
- Set does not maintain the order of elements, while HashSet does not maintain the order of elements.
- Set does not allow duplicates, while HashSet does not allow duplicates.
- Set is a general interface, while HashSet is a specific implementation of the Set interface.
- Use case: Use Set when you need a collection of unique elements without duplicates. Use HashSet when you need a hash table-based implementation of the Set interface.
- Example of when to use HashSet

### HashSet Vs. LinkedHashSet Vs. TreeSet - Unique elements, Order of elements, Sorting
- HashSet is storing elements in the random order.
- LinkedHashset is storing elements in the order of insertion.
- TreeSet is storing elements in the sorted order.

### Collections - Queue Interface
 - Arranged in the order of processing. Example - To-do list.
 - Queue is used to store elements in the order of processing.
 - FIFO - First In First Out.
 - Queue Interface extends Collection, So all the methods of Collection are available in Queue.
 - Add, Offer, Remove, Poll, Element, Peek are the methods of Queue Interface.
 - Real time example - To-do list, Printer queue, Call center, etc.
 - Use case: Queue is used when you need to process elements in the order they were added.

### Map Interface
- Map is used to store key-value pairs.
- Map Interface does not extends Collection Interface.
- All the operations related to Collection are not applicable to Map.
- But Map is part of Collections Framework.
- Map Interface has 4 important implementations - HashMap, LinkedHashMap, TreeMap, and Hashtable.

### HashTable Vs HashMap
- HashTable is synchronized, while HashMap is not synchronized.
- HashTable does not allow null keys or values, while HashMap allows one null key and multiple null values.
- HashTable is thread-safe, while HashMap is not thread-safe.
- HashTable is slower than HashMap because of synchronization overhead.
- HashTable is a legacy class, while HashMap is the preferred choice for new applications.
- Use case: Use HashTable when you need a thread-safe map with no null keys or values. Use HashMap when you need a non-thread-safe map with null keys or values.

### LinkedHashMap
- Underlying data structure Of LinkedHashMap is HashTable + LinkedList.
- LinkedHashMap is an implementation of the Map interface.
- LinkedHashMap maintains the order of elements based on the insertion order. Like LinkedHashSet.
- Slower insertion and deletion than HashMap. Because it maintains the order of elements based on the insertion order.
- Unsorted
- Faster iteration than HashMap. Because all elements have links to each other.
- LinkedHashMap is used when you need to maintain the order of elements based on the insertion order.
- Example: `Map<String, Integer> map = new LinkedHashMap<>();`

### TreeMap
- TreeMap is an implementation of the Map interface.
- Underlying data structure of TreeMap is Red-Black Tree.
- Data is stored in sorted order based on the natural order of keys or a custom comparator.
- Also implements NavigableMap interface.


## **Note:** By default, When we are using .of() method, then it will create immutable collection.

### Tips - Regarding Collections
- Whenever you see "Hash" word in the collection, then it is not maintaining the order of elements. And it is storing elements in the random order - Unsorted. Example - HashSet, HashMap.
- Whenever you see "Linked" word in the collection, then it is **maintaining the order of elements based on the insertion order.** **Unsorted** Example - LinkedHashSet, LinkedHashMap. Uses LinkedList or might be using Doubly LinkedList.
- Whenever you see "Tree" word in the collection, then it is **maintaining the order of elements based on the sorting order.** **Sorted** Example - TreeSet, TreeMap. Uses Red-Black Tree data structure.
- Implements also **NavigableMap** or **NavigableSet** interface, then it is also providing some additional methods for navigation.

### Why we need to use Collections Framework in Java?
- Collections Framework provides a unified architecture for representing and manipulating collections of objects.
- Collections Framework provides a set of interfaces and classes to store, retrieve, and manipulate collections of objects.
- Collections Framework provides a standard way to work with collections, making it easier to write reusable and maintainable code.
- Collections Framework provides a wide range of data structures and algorithms for working with collections, such as lists, sets, maps, queues, and sorting algorithms.
- Collections Framework provides a rich set of utility classes for common operations like sorting, searching, filtering, and transforming collections.
- Collections Framework is part of the Java API and is widely used in Java applications for managing collections of objects.
- Use case: Collections Framework is used in Java applications to store, retrieve, and manipulate collections of objects efficiently and effectively.

### Why do we need to use Generics in Java?
- Generics provide type safety by allowing you to specify the type of objects that a collection can hold.
- Generics allow you to write reusable and type-safe code by specifying the type of objects that a class or method can work with.
- Generics eliminate the need for explicit type casting and provide compile-time type checking.
- Generics improve code readability and maintainability by making the code more expressive and self-documenting.
- Generics are used in Java collections to ensure that only objects of a specific type can be added to the collection.
- Use case: Generics are used in Java to create type-safe collections, classes, and methods that work with a specific type of objects.
- Example: `List<String> list = new ArrayList<>();` Here, `List<String>` specifies that the list can only hold `String` objects.
- Wherever you are using type , then you can use Generics there. Like - Collections, Classes, Methods, Interfaces, return types, etc.
- Generics are used to provide compile-time type checking and to avoid runtime errors.