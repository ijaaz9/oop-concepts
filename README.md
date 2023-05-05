
# OOP Concepts

The reason for this project is simply to get back to basics.

## Inheritance in Java

- A mechanism in which one object acquires all the properties and behaviors of a parent object.
- The idea behind inheritance in Java is that you can create new classes that are built upon existing classes. 
- Inheritance represents the **IS-A** relationship

### Why use inheritance in java

- For Method Overriding (so runtime polymorphism can be achieved). 
- For Code Reusability.

### Terms used in Inheritance

- **Class:** A class is a group of objects which have common properties. It is a template or blueprint from which objects are created.
- **Sub Class/Child Class:** Subclass is a class which inherits the other class. It is also called a derived class, extended class, or child class.
- **Super Class/Parent Class:** Superclass is the class from where a subclass inherits the features. It is also called a base class or a parent class.
- **Reusability:** As the name specifies, reusability is a mechanism which facilitates you to reuse the fields and methods of the existing class when you create a new class. You can use the same fields and methods already defined in the previous class.

## Polymorphism in Java

- A concept by which we can perform a single action in different ways
- Two types of polymorphism in Java: compile-time polymorphism and runtime polymorphism
- We can perform polymorphism in java by method overloading and method overriding.
- If you overload a static method in Java, it is the example of compile time polymorphism.

### Runtime Polymorphism in Java

- Runtime polymorphism or Dynamic Method Dispatch is a process in which a call to an overridden method is resolved at runtime rather than compile-time.
- An overridden method is called through the reference variable of a superclass.

#### Upcasting

- If the reference variable of Parent class refers to the object of Child class, it is known as upcasting

## Abstract class in Java

- A class which is declared with the abstract keyword is known as an abstract class in Java. It can have abstract and non-abstract methods (method with the body).

## Abstraction in Java
- A process of hiding the implementation details and showing only functionality to the user.
- It shows only essential things to the user and hides the internal details, 
- Abstraction lets you focus on what the object does instead of how it does it.

### Ways to achieve Abstraction

- Two ways to achieve abstraction in java
  - Abstract class (0 to 100%)
  - Interface (100%)

#### Points to Remember

- An abstract class must be declared with an abstract keyword.
- It can have abstract and non-abstract methods.
- It cannot be instantiated.
- It can have constructors and static methods also.
- It can have final methods which will force the subclass not to change the body of the method.

## Encapsulation in Java

- A process of wrapping code and data together into a single unit
- Create a fully encapsulated class in Java by making all the data members of the class private. Now we can use setter and getter methods to set and get the data in it.

### Advantage of Encapsulation in Java

- By providing only a setter or getter method, you can make the class **read-only** or **write-only**
- It provides control over the data.
- A way to achieve data hiding
- Encapsulated class is easy to test. So, it is better for unit testing.
- Easy and fast to create an encapsulated class