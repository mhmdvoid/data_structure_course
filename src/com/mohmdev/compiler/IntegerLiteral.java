package com.mohmdev.compiler;

// What attribute has? Will the actual value 10, -20, 2;
// Operation integerLiteral can add , subtract, multiply, divide
public class IntegerLiteral {

    private int value;

    public IntegerLiteral(int value) {
        this.value = value;
    }

    public int plus(IntegerLiteral otherInteger) {
        return this.value + otherInteger.value;
    }

    public int subtract(IntegerLiteral otherInteger) {
        return this.value - otherInteger.value;
    }

    public int multiply(IntegerLiteral otherInteger) {
        return this.value * otherInteger.value;
    }

    public int divide(IntegerLiteral otherInteger) {
        if (otherInteger.value == 0) {
            System.out.println("It is impossible to divide over ZERO");
            return this.value;
        }
        return this.value / otherInteger.value;
    }
}
