package Exercise_Day_01.Exercise_03;

public class UnaryOperatorDemo {
    public static void main(String[] args) {
        int i = 3;
        // Unary
        i++;
        System.out.println("result is " + i); // i must be equal to 4
        
        // Unary
        i--;
        System.out.println("result is " + i); // i must be equal to 3
        
        System.out.println("result is " + ++i); // i must be equal to 4
        // System.out.println("result is " + UnaryOperation ); 
        
        System.out.println("result is " + i++); // i must be equal to 4
        // System.out.println("result is " + UnaryOperation ); 
        
        System.out.println("result is " + i); // i must be equal to 5

    }
}