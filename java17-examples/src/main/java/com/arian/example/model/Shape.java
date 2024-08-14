package com.arian.example.model;

/**
 * The {@code Shape} class is a sealed class that restricts which classes can extend it.
 * <p>
 * Sealed Classes allow you to restrict what other classes can extend or implement a class or interface.
 * This ensures that the set of subclasses is known and controlled, providing more control over inheritance.
 * </p>
 *
 * <p>
 * The {@code Shape} class can only be extended by the {@code Circle} and {@code Square} classes,
 * as specified by the {@code permits} clause.
 * </p>
 *
 * @see Circle
 * @see Square
 */
public sealed class Shape permits Circle, Square {

}

/**
 * The {@code Circle} class represents a circle in a 2D coordinate system.
 * This class is a final subclass of the {@code Shape} sealed class.
 */
final class Circle extends Shape {
   // Implementation
}

/**
 * The {@code Square} class represents a square in a 2D coordinate system.
 * This class is a final subclass of the {@code Shape} sealed class.
 */
final class Square extends Shape {
   // Implementation
}
