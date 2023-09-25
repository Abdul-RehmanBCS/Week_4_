package Week_4;

public class CardTest {
    public static void main(String[] args) {
//        Card c1=new Card("8","king");
//        System.out.println(c1);
        Deck d1=new Deck();
        d1.shuffle();
        System.out.println(d1);
    }
}
