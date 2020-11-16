package rpn;

import java.util.Stack;

public class Calc {

    private Stack<Double> stack;

    public Calc() {

        stack = new Stack<Double>();
    }

    String[] getWords(String strExpr) {

        return strExpr.split(" ");
    }

    public Double compute(String strExpr) throws ExpressionException {

        if (strExpr == null) {
            throw new ExpressionException("Kan inte vara null.");
        }

        if (strExpr == "") {
            throw new ExpressionException("Kan inte vara tom");
        }

        stack.empty();

        String[] words = getWords(strExpr);

        for (int i = 0; i < words.length; i++) {
            switch (words[i]) {
            case "*":
                if (stack.size() >= 2) {
                    stack.push(stack.pop() * stack.pop());
                } else {
                    throw new ExpressionException("Det saknas operander!");
                }
                break;

            case "-":
                if (stack.size() >= 2) {
                    stack.push(stack.pop() - stack.pop());
                } else {
                    throw new ExpressionException("Det saknas operander!");
                }
                break;

            case "+":
                if (stack.size() >= 2) {
                    stack.push(stack.pop() + stack.pop());
                } else {
                    throw new ExpressionException("Det saknas operander!");
                }
                break;

            case "/":
                if (stack.size() >= 2) {
                    stack.push(stack.pop() / stack.pop());
                } else {
                    throw new ExpressionException("Det saknas operander!");
                }
                break;

            case "sqrt":
                if (stack.size() >= 1) {
                    stack.push(Math.sqrt(stack.pop()));
                } else {
                    throw new ExpressionException("Det saknas en operand!");
                }
                break;

            case "sqr":
                if (stack.size() >= 1) {
                    stack.push(Math.pow(stack.pop(), 2));
                } else {
                    throw new ExpressionException("Det saknas en operand!");
                }
                break;

            default:
                try {

                    Double dbl = Double.parseDouble(words[i]);
                    stack.push(dbl);

                } catch (NumberFormatException e) {
                    throw new ExpressionException("Är inte ett tal eller en otillåten operator.");
                }

                break;
            }

        }

        return stack.pop();
    }

}
