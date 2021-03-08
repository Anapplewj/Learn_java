package Pra0308;

public class Card {
    private String huaSe;
    private String point;

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
