package Exercise_Day_02.Exercise_01;

public class CalculatorBase implements Calculator {
    public float sum(float x, float y) {
        return x + y;
    }

    public float subtract(float x, float y) {
        return x - y;
    }

    public float multiply(float x, float y) {
        return x * y;
    }

    public float divide(float x, float y) {
        return x / y;
    }

    public float module(float x, float y) {
        return x % y;
    }
}