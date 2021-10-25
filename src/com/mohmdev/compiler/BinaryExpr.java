package com.mohmdev.compiler;


// Attribute > a binary expression has 2 operands, and an operator;
public class BinaryExpr {
    enum BinaryOperator {
        ADD, SUBTRACT, MULTIPLY, DIVIDE,
    }

    IntegerLiteral lhs;
    IntegerLiteral rhs;
    BinaryOperator binaryOperator;

    public BinaryExpr(IntegerLiteral lhs, IntegerLiteral rhs, BinaryOperator binaryOperator) {
        this.lhs = lhs;
        this.rhs = rhs;
        this.binaryOperator = binaryOperator;
    }

    public int execute() {
        switch (binaryOperator) {
            case ADD ->         { return lhs.plus(rhs);     }
            case SUBTRACT ->    { return lhs.subtract(rhs); }
            case MULTIPLY ->    { return lhs.multiply(rhs); }
            case DIVIDE ->      { return lhs.divide(rhs);   }

        }

        // UNREACHABLE
        return 0;
    }
}
