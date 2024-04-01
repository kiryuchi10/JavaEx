package com.javaex.objectclass.test;

class Point implements Cloneable {
    private int x;
    private int y;

    // Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters and setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Override clone method to clone the Point object
    public Point getClone() {
        Point clone=null;
    	try {
            return (Point)clone();
        } catch (CloneNotSupportedException e) {
            // This should never happen since Point implements Cloneable
            throw new InternalError(e);
        }
    }

    // Method to print the coordinates
    public void printCoordinates() {
        System.out.println("X coordinate: " + x);
        System.out.println("Y coordinate: " + y);
    }
}