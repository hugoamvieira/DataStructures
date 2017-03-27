package DijkstrasInterpreter;

import java.util.Stack;

public class Algorithm {
    private Stack<String> operationsStack;
    private Stack<Double> valuesStack;

    public Algorithm() {
        this.operationsStack = new Stack<>();
        this.valuesStack = new Stack<>();
    }

    public void interpretExpression(String expr) {
        String[] exprArray = expr.split(" ");

        for (String s : exprArray) {
            if (s.equals("(")) {
                // Do nothing

            } else if (s.equals("+")) {
                this.operationsStack.push(s);

            } else if (s.equals("*")) {
                this.operationsStack.push(s);

            } else if (s.equals("/")) {
                this.operationsStack.push(s);

            } else if (s.equals(")")) {
                String operation = this.operationsStack.pop();

                if (operation.equals("+")) {
                    this.valuesStack.push(this.valuesStack.pop() + this.valuesStack.pop());

                } else if (operation.equals("*")) {
                    this.valuesStack.push(this.valuesStack.pop() * this.valuesStack.pop());

                } else if (operation.equals("/")) {
                    this.valuesStack.push(this.valuesStack.pop() / this.valuesStack.pop());
                }

                // We encountered a value. Push to valuesStack
            } else {
                this.valuesStack.push(Double.parseDouble(s));
            }
        }
    }

    public void result() {
        System.out.println(this.valuesStack.pop());
    }
}
