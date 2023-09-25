package Week_4;

import java.util.Random;

public class Deck {
    Card[] c1=new Card[52];
    String[] suit={"Heart","Diamond","Club","Tiles"};
    String[] rank={"Ace","2","3","4","5","6","7","8","9","10","Queen","King","Jack"};
    int counter=0;
    Deck(){
        for(int i=0;i<4;i++){
            for(int j=0;j<13;j++){
                c1[counter++]=new Card(rank[j],suit[i]+"\n");
            }
        }
    }
    public String toString(){
        StringBuilder str=new StringBuilder();
        for(int i=0;i<52;i++){
            str.append(c1[i]);
        }
        return String.format("%s",str);
    }
    public void shuffle(){
        Random random=new Random();
        for(int i=0;i<6000;i++){
            int randomIndex=random.nextInt(52);
            Card temp=c1[randomIndex];
            c1[randomIndex]=c1[0];
            c1[0]=temp;
        }
    }
}
