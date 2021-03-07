package Pra0307;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PokerGame {
    //首先创建好一副牌
    public static List<Card> byePoker(){
        List<Card> poker=new ArrayList<>();
        //准备好四种花色
        String[] huaSe={"♥", "♠", "♣", "♦"};
        //四种花色，十三张牌
        for(int i=0;i<4;i++){
            for(int j=2;j<=10;j++){
                poker.add(new Card(huaSe[i],""+j));
            }
            poker.add(new Card(huaSe[i],"J"));
            poker.add(new Card(huaSe[i],"Q"));
            poker.add(new Card(huaSe[i],"K"));
            poker.add(new Card(huaSe[i],"A"));
        }
        //大王和小王
        poker.add(new Card("","Big"));
        poker.add(new Card("","Small"));
        return poker;
    }
    //随机数方法洗牌
    public static void shuffle(List<Card> poker){
        Random radom=new Random();
        for(int i=poker.size()-1;i>0;i--){
            //产生一个[0,i）之间的随机数
            int pos=radom.nextInt(i);
            //和这个随机数交换位置
            swap(i,pos,poker);
        }
    }
    public static void swap(int i,int pos,List<Card> poker){
        Card temp=poker.get(i);
        poker.set(i,poker.get(pos));
        poker.set(pos,temp);
    }

    public static void main(String[] args) {
        //创建一副牌
        List<Card> poker=byePoker();
        shuffle(poker);
        //有三个玩家，每个玩家发五张牌，
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
//总结：首先创建了一个Card类
//这个小游戏让我回顾了顺序表的知识
//然后创建一副牌，洗牌
//有三个玩家，所有玩家的名单也相当于一个顺序表
//每个玩家的内容是一副牌，这副牌也是一种链表，类型为Card
//也就相当于二维数组，数组的每一行存储的是不同的玩家
//每一列存储的是，某个玩家拥有的牌
//顺序表真有趣
