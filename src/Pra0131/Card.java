package Pra0131;

public class Card {
    //花色
    public String huaSe;
    //点数
    public String point;

    public Card(String huaSe, String point) {
        this.huaSe = huaSe;
        this.point = point;
    }
    //方便打印牌的内容

    @Override
    public String toString() {
        return "Card{" +
                "huaSe='" + huaSe + '\'' +
                ", point='" + point + '\'' +
                '}';
    }
}
