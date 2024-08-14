package com.arian.example.model;

/**
 * The {@code Point} record represents a point in a 2D coordinate system with immutable {@code x} and {@code y} coordinates.
 * <p>
 * Records are a concise way to create immutable classes that only contain data.
 * This record encapsulates the coordinates of a point in a 2D space.
 * </p>
 *
 * @param x the x-coordinate of the point
 * @param y the y-coordinate of the point
 */
public record Point(int x, int y) {

}
