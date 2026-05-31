# Lecture 19 — Inheritance in Java

## What is Inheritance?

Inheritance is an OOP mechanism where one class **acquires the properties and behaviors** (fields and methods) of another class. The class that is inherited from is called the **parent/super class**, and the class that inherits is called the **child/sub class**.

The child class uses the `extends` keyword to inherit from the parent.

**Why use it?**
- Code reusability — write once, reuse in child classes
- Method overriding — child can change parent behavior
- Establishes an **IS-A** relationship (e.g., a Car IS-A Vehicle)

---

## Syntax

```java
class Parent {
    // fields and methods
}

class Child extends Parent {
    // inherits Parent's fields and methods
    // can add its own or override
}
```

---

## Types of Inheritance in Java

### 1. Single Inheritance
One child class inherits from one parent class.

```java
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Usage
Dog d = new Dog();
d.eat();   // inherited from Animal
d.bark();  // Dog's own method
```

---

### 2. Multilevel Inheritance
A class inherits from a child, which itself was a child — a chain of inheritance.

```java
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps");
    }
}

// Usage
Puppy p = new Puppy();
p.eat();   // from Animal
p.bark();  // from Dog
p.weep();  // Puppy's own
```

---

### 3. Hierarchical Inheritance
Multiple child classes inherit from a single parent class.

```java
class Vehicle {
    void fuel() {
        System.out.println("Vehicle needs fuel");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike is riding");
    }
}

// Usage
Car c = new Car();
c.fuel();   // from Vehicle
c.drive();

Bike b = new Bike();
b.fuel();   // from Vehicle
b.ride();
```

---

### 4. Multiple Inheritance (via Interfaces only)
Java does **NOT** support multiple inheritance with classes to avoid the **Diamond Problem**. It is achieved using **interfaces**.

```java
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {
    public void fly() {
        System.out.println("Duck flies");
    }
    public void swim() {
        System.out.println("Duck swims");
    }
}
```

> Java avoids multiple class inheritance because if two parent classes have the same method, the compiler cannot decide which one to use — this is called the **Diamond Problem**.

---

### 5. Hybrid Inheritance
A combination of two or more types of inheritance. Like multiple inheritance, this is also only possible via **interfaces** in Java.

```java
interface A {
    void methodA();
}

interface B extends A {
    void methodB();
}

class C implements B {
    public void methodA() {
        System.out.println("Method A");
    }
    public void methodB() {
        System.out.println("Method B");
    }
}
```

---

## Key Concepts

### `super` keyword
Used to call the parent class constructor or methods from the child class.

```java
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Animal: " + name);
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, String breed) {
        super(name);          // calls Animal's constructor
        this.breed = breed;
    }

    void display() {
        super.display();      // calls Animal's display()
        System.out.println("Breed: " + breed);
    }
}
```

---

### Method Overriding
Child class provides its own implementation of a method already defined in the parent.

```java
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

// Usage
Shape s = new Circle();   // polymorphism
s.draw();                 // prints: Drawing a circle
```

Rules:
- Method name and parameters must be the same
- Return type must be same or a subtype (covariant)
- Access modifier cannot be more restrictive than parent

---

### `final` and Inheritance
- A `final class` cannot be extended
- A `final method` cannot be overridden

```java
final class Immutable {
    // cannot be subclassed
}

class Base {
    final void show() {
        // cannot be overridden in subclass
    }
}
```

---

## Real-World Example — Vehicle Hierarchy

```java
package Transport;

class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void info() {
        System.out.println("Brand: " + brand + ", Max Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    int doors;

    Car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
    }

    @Override
    void info() {
        super.info();
        System.out.println("Doors: " + doors);
    }
}

class ElectricCar extends Car {
    int batteryRange;

    ElectricCar(String brand, int speed, int doors, int batteryRange) {
        super(brand, speed, doors);
        this.batteryRange = batteryRange;
    }

    @Override
    void info() {
        super.info();
        System.out.println("Battery Range: " + batteryRange + " km");
    }
}

public class Main {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar("Tesla", 250, 4, 600);
        tesla.info();
        // Brand: Tesla, Max Speed: 250 km/h
        // Doors: 4
        // Battery Range: 600 km
    }
}
```

---

## Summary Table

| Type          | Description                                  | Supported in Java          |
|---------------|----------------------------------------------|----------------------------|
| Single        | One child, one parent                        | Yes (classes)              |
| Multilevel    | Chain: A → B → C                             | Yes (classes)              |
| Hierarchical  | Multiple children, one parent                | Yes (classes)              |
| Multiple      | One child, multiple parents                  | Yes (interfaces only)      |
| Hybrid        | Combination of above                         | Yes (interfaces only)      |

---

## What to Remember

- Use `extends` for class inheritance, `implements` for interfaces
- Constructor of parent is NOT inherited, but called via `super()`
- Every class in Java implicitly extends `Object` class
- Use `@Override` annotation when overriding — helps catch mistakes at compile time
