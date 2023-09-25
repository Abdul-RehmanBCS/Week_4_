package Week_4;

public class Card {
    final String rank;
    final String suit;
    Card(String rank,String suit){
        this.suit=suit;
        this.rank=rank;
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }
    public String toString(){
        return String.format("%s of %s",rank,suit);
    }
//    public boolean equals(){
//
//    }
}
