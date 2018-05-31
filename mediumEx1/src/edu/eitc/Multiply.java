package edu.eitc;

import java.util.ArrayList;

public class Multiply extends Operation {

    private Operation chained;

    public Multiply(Operation term1, Operation term2) {
        super(term1, term2);

        int term2Val = term2.compute();
        boolean signInvert = term2Val < 0;

        if (term2Val == 0) {
            //N*0 = 0
            chained = new Identity(0);

        } else {
            //N*1 = N
            Operation baseTerm = signInvert ? new Negate(term1) : term1;
            chained = baseTerm;

            //N*M = N+N+...+N (M times)
            for (int i = 1; i < Math.abs(term2Val); i++) {
                chained = new Add(chained, baseTerm);
            }
        }
    }

    @Override
    int compute() {
        return chained.compute();
    }

    @Override
    String getExpression() {
        return String.format("(%s*%s)", term1.getExpression(), term2.getExpression());
    }

    @Override
    String getActualExpression() {
        return chained.getActualExpression();
    }
}
