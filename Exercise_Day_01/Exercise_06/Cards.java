package Exercise_Day_01.Exercise_06;

public class Cards {
    public static void main(String[] args) {
        String[] suits = {" of Clubs", " of Spades", " of Hearts", " of Diamonds"};

        for(int i = 0, j = 1; i < 52; i++){
            String card = ""+ (i % 13 + 1);
            if(i % 13 == 0){
                card = "Ace";
            }else if(i%13==10 ){
                card = "Joker";
            }else if(i%13==11 ){
                card = "Queen";
            }else if(i%13==12 ){
                card = "King";
            }
            System.out.println(card + suits[j % 4]);
            if(i % 13 == 0) j++;
        }
    }
}