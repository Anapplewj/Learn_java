package Pra0308;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PokerGame {
    //首先创建一副牌
    public static List<Card> byePoker(){
        List<Card> poker=new ArrayList<>();
        String[] huaSe={"♥", "♠", "♣", "♦"};
        for(int i=0;i<4;i++){
            for(int j=2;j<=10;j++){
                poker.add(new Card(huaSe[i],""+j));
            }
            poker.add(new Card(huaSe[i],"J"));
            poker.add(new Card(huaSe[i],"Q"));
            poker.add(new Card(huaSe[i],"K"));
            poker.add(new Card(huaSe[i],"A"));
        }
        poker.add(new Card("","Big"));
        poker.add(new Card("","Small"));
        return poker;
    }
    //洗牌
    public static void shuffle(List<Card> poker){
        //当前位置和随机[0,i)之间产生随机位置交换
        Random random=new Random();
        for(int i=poker.size()-1;i>0;i--){
            int pos=random.nextInt(i);
            swap(i,pos,poker);
        }
    }
    public static void swap(int i,int pos,List<Card> poker){
        Card temp=poker.get(i);
        poker.set(i,poker.get(pos));
        poker.set(pos,temp);
    }

    public static void main(String[] args) {
        List<Card> poker=byePoker();
        shuffle(poker);
        //发牌，三个玩家，每个玩家五张牌
        List<List<Card>> players=new ArrayList<>();
        players.add(new ArrayList<>());
        players.add(new ArrayList<>());
        players.add(new ArrayList<>());
        for(int i=0;i<5;i++){
            for(int j=0;j<3;j++){
                Card card=poker.remove(0);
                List<Card> player=players.get(j);
                player.add(card);
            }
        }
        //展示玩家手里的牌
        for(int i=0;i<players.size();i++){
            System.out.println("第"+(i+1)+"个玩家的牌是"+players.get(i));
        }
    }
}
