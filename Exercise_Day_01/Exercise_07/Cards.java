package Exercise_Day_01.Exercise_07;

public class Cards {
    public static void main(String[] args) {
        String[] cards = {"Ace ", "2 ", "3", "4", "5", "6", "7", "8", "9",
                         "10", "Joker", "Queen", "King"};
        String[] suits = {" of Clubs", " of Spades", " of Hearts", " of Diamonds"};

        for(String suit : suits){
            for(String card : cards){
                System.out.println(card + suit);
            }
        }
    }
}