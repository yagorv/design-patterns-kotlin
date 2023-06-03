# Design Patterns Examples Repository

Welcome to the Design Patterns Examples Repository! This repository contains examples of various design patterns implemented in different programming languages. Each design pattern is demonstrated through a practical example to help you understand its purpose, benefits, and implementation.

## Design Pattern List

### Creational Patterns

Related to the process of creating an object.

* [Abstract Factory](#abstract-factory)
* [Builder](#builder)
* [Factory or Factory Method](#factory)
* [Prototype](#prototype)
* [Singleton](#singleton)
* [Object Pool](#objectpool)

### Structural Patterns

Class or object composition.

* [Adapter](#adapter)
* [Composite](#composite)
* [Decorator](#decorator)
* [Facade](#facade)
* [Proxy](#proxy)
* [Bridge](#bridge)
* [Flyweight](#flyweigh)

### Behavioral Patterns

How classes or objects interact and distribute functionality.

* [Command](#command)
* [Observer](#observer)
* [Strategy](#strategy)
* [Chain of Responsibility](#chain)
* [Memento](#memento)
* [Mediator](#mediator)
* [Template method](#template)
* [Iterator](#iterator)
* [Visitor](#visitor)
* [State](#state)
* [Interpreter](#interpreter)

## Patterns Included

Here's a list of design patterns covered in this repository along with a detailed description and an associated image for each:

### Adapter Pattern
The Adapter pattern allows objects with incompatible interfaces to work together by creating a common interface that both objects can use. It acts as a bridge between two incompatible classes, converting the interface of one class to match the expectations of the other.

![Adapter Pattern](https://example.com/adapter-pattern.png)

### Bridge Pattern
The Bridge pattern decouples an abstraction from its implementation, allowing them to vary independently. It enables the separation of the abstraction and its implementation into separate class hierarchies, making it easier to modify and extend them independently.

### Builder Pattern
The Builder pattern separates the construction of an object from its representation, allowing the same construction process to create different representations. It provides a step-by-step approach to construct complex objects, providing flexibility and allowing different variations of the object to be created using the same construction process.

### Command Pattern
The Command pattern encapsulates a request as an object, allowing users to parameterize clients with queues, requests, and operations. It decouples the sender of a request from the receiver, allowing multiple requests to be handled in a uniform way.

### Composite Pattern
The Composite pattern composes objects into tree structures to represent part-whole hierarchies, allowing clients to treat individual objects and compositions uniformly. It enables the creation of complex structures by representing objects and their compositions in a hierarchical manner.

### Decorator Pattern
The Decorator pattern attaches additional responsibilities to an object dynamically, providing a flexible alternative to subclassing. It allows behavior to be added to an object dynamically at runtime, ensuring the extension of the object's functionality without affecting other instances of the same class.

### Facade Pattern
The Facade pattern provides a simplified interface to a complex subsystem, making it easier to use and understand. It acts as a single entry point to a larger set of functionality, providing a higher-level interface that simplifies the usage of the subsystem.

### Factory Pattern
The Factory pattern provides an interface for creating objects, allowing subclasses to decide which class to instantiate. It encapsulates the object creation logic in a separate class, providing a common interface to create objects of different types.

### Flyweight Pattern
The Flyweight pattern minimizes memory usage by sharing common object state among multiple objects, reducing the overall number of instances needed. It allows the sharing of intrinsic (invariant) state between objects while maintaining their unique extrinsic (variant) state.

### Iterator Pattern
The Iterator pattern provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation. It decouples the algorithm for traversing a collection from the collection itself, providing a common interface for iterating over different types of collections.

### Mediator Pattern
The Mediator pattern defines an object that encapsulates how a set of objects interact, promoting loose coupling between them. It centralizes communication logic between objects, reducing direct dependencies and simplifying their interactions.

### Memento Pattern
The Memento pattern captures and externalizes an object's internal state so that it can be restored later, without violating encapsulation. It provides the ability to restore an object to a previous state, enabling undo or rollback operations.

### Observer Pattern
The Observer pattern establishes a one-to-many dependency between objects, ensuring that when one object changes state, all its dependents are notified and updated automatically. It allows objects to subscribe and receive updates from a subject when its state changes.

### Prototype Pattern
The Prototype pattern creates new objects by cloning existing ones, allowing the creation of new objects without coupling to their specific classes. It provides a way to create new objects by copying or cloning existing objects, allowing customization and reducing the need for subclassing.

### Singleton Pattern
The Singleton pattern ensures that a class has only one instance, providing a global point of access to it. It restricts the instantiation of a class to a single object and provides a way to access that object globally.

### State Pattern
The State pattern allows an object to alter its behavior when its internal state changes, decoupling the behavior from the object's class. It encapsulates different states of an object as separate classes, allowing it to change its behavior dynamically based on its internal state.

### Strategy Pattern
The Strategy pattern defines a family of interchangeable algorithms and encapsulates each one, allowing them to be used interchangeably. It enables the selection of an algorithm at runtime, providing flexibility and extensibility to the client.

### Template Pattern
The Template pattern defines the skeleton of an algorithm in a method, allowing subclasses to redefine certain steps without changing the overall structure. It provides an abstract class with a template method that defines the overall algorithm structure, allowing subclasses to provide their own implementations for specific steps.

### Visitor Pattern
The Visitor pattern separates the algorithm from the object structure it operates on, allowing the addition of new operations without modifying the objects. It allows adding new behaviors to an object hierarchy without changing the classes of the objects themselves, promoting extensibility.

## Contributions

Feel free to contribute to this repository by adding examples of design patterns in your favorite programming language. Simply fork the repository, create a new branch for your work, and submit a pull request.

Enjoy exploring the world of design patterns and how they can improve the structure and flexibility of your software projects!

## License

This repository is licensed under the [MIT License](LICENSE).
