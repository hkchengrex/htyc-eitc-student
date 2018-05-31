package edu.eitc;

public class Add extends Operation {
    public Add(Operation term1, Operation term2) {
        super(term1, term2);
    }

    @Override
    int compute() {
        return term1.compute() + term2.compute();
    }

    @Override
    String getExpression() {
        return String.format("(%s+%s)", term1.getExpression(), term2.getExpression());
    }

    @Override
    String getActualExpression() {
        return String.format("(%s+%s)", term1.getActualExpression(), term2.getActualExpression());
    }
}
