package edu.eitc;

import java.util.ArrayList;

public class Power extends Operation {

    private Operation chained;

    public Power(Operation term1, Operation term2) {
        super(term1, term2);

        int term2Val = term2.compute();

        if (term2Val == 0) {
            //N^0 = 1
            chained = new Identity(1);

        } else {
            chained = term1;

            //N^M = N*N*...*N (M times)
            for (int i = 1; i < Math.abs(term2Val); i++) {
                chained = new Multiply(chained, term1);
            }
        }
    }

    @Override
    int compute() {
        return chained.compute();
    }

    @Override
    String getExpression() {
        return String.format("(%s^%s)", term1.getExpression(), term2.getExpression());
    }

    @Override
    String getActualExpression() {
        return chained.getActualExpression();
    }
}
