

public class Main {

    public static void main(String[] args) {
        Clothes[] clothes = {new Skirt(), new TeeShirt(), new Trousers(), new Tie()};

        Atelier atelier = new Atelier();
        atelier.dressWoman(clothes);
        atelier.dressMen(clothes);
    }
}