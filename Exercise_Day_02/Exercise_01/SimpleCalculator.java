package Exercise_Day_02.Exercise_01;

public class SimpleCalculator {
    public static void main(String[] args) {
        CalculatorBase calc = new CalculatorBase();
        String errorMessage = "You need to provide 3 args:\n\t[sum, subtract, divide, multiply, module]\n\t[first value]\n\t[second value]";
        try {
            float x = Float.parseFloat(args[1]);
            float y = Float.parseFloat(args[2]);
            if (args[0].equals("sum")) {
                System.out.println(calc.sum(x, y));
                return;
            } else if (args[0].equals("subtract")) {
                System.out.println(calc.subtract(x, y));
                return;
            } else if (args[0].equals("divide")) {
                System.out.println(calc.divide(x, y));
                return;
            } else if (args[0].equals("multiply")) {
                System.out.println(calc.multiply(x, y));
                return;
            } else if (args[0].equals("module")) {
                System.out.println(calc.module(x, y));
                return;
            }
            else {
                System.out.println(errorMessage);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(errorMessage);
        }
    }
}