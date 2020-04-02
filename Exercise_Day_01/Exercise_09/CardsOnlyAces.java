package Exercise_Day_01.Exercise_09;

public class CardsOnlyAces {
    public static void main(String[] args) {
        String[] cards = {"Ace", "2 ", "3", "4", "5", "6", "7", "8", "9",
                         "10", "Joker", "Queen", "King"};
        String[] suits = {" of Clubs", " of Spades", " of Hearts", " of Diamonds"};

        int i=0, j=0;
        while(i<52) {
            if(++i % 13==0)
                System.out.println(cards[i % 13] + suits[++j % 4]);
        }
    }
}