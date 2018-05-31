package edu.eitc;

public class Main {

    public static void main(String[] args) {
        //Numbers
        final Operation two = new Identity(2);
        final Operation five = new Identity(5);
        final Operation zero = new Identity(0);
        final Operation negativeThree = new Negate(new Identity(3));
        final Operation one = new Identity(1);

        System.out.println(two.getExpression());
        System.out.println(five.getExpression());
        System.out.println(zero.getExpression());
        System.out.println(negativeThree.getExpression());
        System.out.println(one.getExpression());

        System.out.println();

        //Add test
        Operation addTwoFive = new Add(two, five);
        Operation chainedAdd = new Add(new Add(two, five), new Add(two, one));
        System.out.println(addTwoFive.getExpression() + " = " + addTwoFive.compute());
        System.out.println("Actual expression: " + addTwoFive.getActualExpression());
        System.out.println(chainedAdd.getExpression() + " = " + chainedAdd.compute());
        System.out.println("Actual expression: " + chainedAdd.getActualExpression());

        System.out.println();


        //Negate test
        Operation negateAdd = new Negate(new Add(five, one));
        System.out.println(negateAdd.getExpression() + " = " + negateAdd.compute());
        System.out.println("Actual expression: " + negateAdd.getActualExpression());

        System.out.println();

        //Minus test
        Operation minus1 = new Minus(new Add(two, five), new Add(two, one));
        Operation minus2 = new Minus(new Add(two, five), new Negate(new Add(two, one)));
        System.out.println(minus1.getExpression() + " = " + minus1.compute());
        System.out.println("Actual expression: " + minus1.getActualExpression());
        System.out.println(minus2.getExpression() + " = " + minus2.compute());
        System.out.println("Actual expression: " + minus2.getActualExpression());

        System.out.println();

        //Multiply test
        Operation multiplyPositive = new Multiply(two, new Add(one, one));
        Operation multiplyNegative = new Multiply( new Add(negativeThree, one), new Multiply(two, two));

        System.out.println(multiplyPositive.getExpression() + " = " + multiplyPositive.compute());
        System.out.println("Actual expression: " + multiplyPositive.getActualExpression());
        System.out.println(multiplyNegative.getExpression() + " = " + multiplyNegative.compute());
        System.out.println("Actual expression: " + multiplyNegative.getActualExpression());

        System.out.println();

        //Power test
	    Operation powerOp = new Power(two, five);
	    System.out.println(powerOp.getExpression() + " = " + powerOp.compute());
        System.out.println("Actual expression: " + powerOp.getActualExpression());

        Operation powerZero = new Power(new Multiply(two, new Add(one, one)), zero);
        System.out.println(powerZero.getExpression() + " = " + powerZero.compute());
        System.out.println("Actual expression: " + powerZero.getActualExpression());

        System.out.println();

        //Complex test
        Operation complex = new Power(multiplyNegative, addTwoFive);
        System.out.println(complex.getExpression() + " = " + complex.compute());
        System.out.println("Actual expression: " + complex.getActualExpression().substring(0, 500));

        System.out.println();
    }
}
