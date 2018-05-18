package edu.eitc;

public class Identity extends Operation{

    int num;

    Identity(int num){
        super(null, null);
        this.num = num;
    }

    @Override
    int compute() {
        return num;
    }

    @Override
    String getExpression() {
        return String.valueOf(num);
    }

    @Override
    String getActualExpression() {
        return getExpression();
    }
}
