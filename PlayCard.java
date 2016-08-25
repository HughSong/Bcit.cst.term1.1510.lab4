/**
 * 
 */

/**
 * @author ֻ־׃כחס
 * @version:28.Jau.2016
 */
public class PlayCard {

    /**
     * @param args
     */
    enum Rank {
        ace, two, three, four, five, six, seven, eight, nine, ten, jack, queen, king
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Rank highcard;
        Rank facecard;
        Rank card1;
        Rank card2;
        highcard = Rank.ace;
        facecard = Rank.queen;
        card1 = Rank.two;
        card2 = Rank.nine;
        System.out.println("A blackjack hand: " + highcard + " and " + facecard);
        int card1Val = card1.ordinal() + 1;
        int card2Val = card2.ordinal() + 1;
        System.out.println("A two card hand: " + card1.name() + " and " + card2.name());
        System.out.println("Hand value: " + (card1Val + card2Val));
    }

}
