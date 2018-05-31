package edu.eitc;

public abstract class Operation {
    Operation term1, term2;

    Operation(Operation term1, Operation term2){
        this.term1 = term1;
        this.term2 = term2;
    }

    abstract int compute();
    abstract String getExpression();
    abstract String getActualExpression();
}
