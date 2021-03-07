package Pra0307;

public class Card {
    public String huaSe;
    public String point;

    public Card(String huaSe, String point) {
        this.huaSe = huaSe;
        this.point = point;
    }

    @Override
    public String toString() {
        return "Card{" +
                "huaSe='" + huaSe + '\'' +
                ", point='" + point + '\'' +
                '}';
    }
}
