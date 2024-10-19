public class Atelier{

    public Atelier(){

    }
    public void dressWoman(Clothes[] clothes) {
        for (Clothes clothe : clothes) {
            if (clothe instanceof WomensClothing) {
                ((WomensClothing) clothe).information();
            }
        }
    }

    public void dressMen(Clothes[] clothes) {
        for (Clothes clothe : clothes) {
            if (clothe instanceof MensClothing) {
                ((MensClothing) clothe).information();
            }
        }
    }
}
