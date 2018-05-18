package edu.eitc;

public class Negate extends Operation {

    Negate(Operation op){
        super(op, null);
    }

    @Override
    int compute() {
        return -term1.compute();
    }

    @Override
    String getExpression() {
        return "(-" + term1.getExpression() + ")";
    }

    @Override
    String getActualExpression() {
        return "(-" + term1.getActualExpression() + ")";
    }
}
