package edu.eitc;

public class Minus extends Operation{

    public Minus(Operation term1, Operation term2) {
        super(term1, term2);
    }

    @Override
    int compute() {
        return term1.compute() + new Negate(term2).compute();
    }

    @Override
    String getExpression() {
        return String.format("(%s-%s)", term1.getExpression(), term2.getExpression());
    }

    @Override
    String getActualExpression() {
        return String.format("(%s+%s)", term1.getActualExpression(), new Negate(term2).getActualExpression());
    }
}
