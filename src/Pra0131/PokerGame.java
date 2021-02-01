package Pra0131;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PokerGame {

    //创建出一副牌
    public static List<Card> buyPoker(){
        //创建一副牌
        List<Card> poker=new ArrayList<>();
        //准备好四种花色
        String[] huase={"♥", "♠", "♣", "♦"};
        //循环赋值
        //四种花色  十三张牌，从2~J,Q,K,A
        for(int i=0;i<4;i++){
            for(int j=2;j<=10;j++){
                poker.add(new Card(huase[i],""+j));
            }
            poker.add(new Card(huase[i],"J"));
            poker.add(new Card(huase[i],"Q"));
            poker.add(new Card(huase[i],"K"));
            poker.add(new Card(huase[i],"A"));
        }
        //大王和小王
        poker.add(new Card("","Big Joker"));
        poker.add(new Card("","Small Joker"));
        return poker;
    }

    //随机数方法洗牌
    private static void shuffle(List<Card> poker){
        Random random=new Random();
        for(int i=poker.size()-1;i>0;i--){
            //产生一个[0,i)之间的随机数
            int pos=random.nextInt(i);
            //和这个随机数的位置交换位置
            swap(i,pos,poker);
        }
    }
    //交换两个位置的牌
    private static void swap(int i, int pos, List<Card> poker) {
        Card card=poker.get(i);
        poker.set(i,poker.get(pos));
        poker.set(pos,card);
    }

    public static void main(String[] args) {
        List<Card> poker=buyPoker();
        shuffle(poker);//库中的洗牌 Collections.shuffle(poker);
        //System.out.println(poker);
        //有三个玩家，每个玩家发五张牌
        List<List<Card>> players=new ArrayList<>();
        players.add(new ArrayList<>());
        players.add(new ArrayList<>());
        players.add(new ArrayList<>());
        for(int i=0;i<5;i++){
            for(int j=0;j<3;j++){
                Card top=poker.remove(0);
                List<Card> player=players.get(j);
                player.add(top);
            }
        }
        //展示玩家手里的牌
        for(int i=0;i<players.size();i++){
            List<Card> player=players.get(i);
            System.out.println("第"+(i+1)+"个玩家的牌是"+player);
        }
    }
}
