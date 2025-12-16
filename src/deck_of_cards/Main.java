package deck_of_cards;

public class Main {
    public static void main(String[] args){

        Deck deck=new Deck();
        deck.shuffle();

        Card[][] playersCards=new Card[4][9];

        for(int i=0;i<4;i++){
            for(int j=0;j<9;j++){
                playersCards[i][j]=deck.drawCard();
            }
        }

        for(int i=0;i<4;i++){
            System.out.println("Player "+(i+1)+":");
            for(int j=0;j<9;j++){
                System.out.println(playersCards[i][j]);
            }
            System.out.println();
        }
    }
}
