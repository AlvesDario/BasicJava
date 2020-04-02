package Exercise_Day_01.Exercise_04;

public class ExerciseDemo {
    public static void main(String[] args) {
        boolean isCat = true;
        String animal = "Dog";
        String sound = "Ruff Ruff";
        if(isCat) {
            animal = "Cat";
            sound = "Meooow";
        }

        System.out.println("the " + animal + " does " + sound + " !!!");
    }
}