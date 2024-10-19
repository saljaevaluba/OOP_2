public class Tie extends Clothes implements MensClothing{
    @Override
    public void dressMan() {

    }
    @Override
    public void information() {
        System.out.println("Одежда - Галстук");
        System.out.println("Размер: " + getClothesSize() + " " + getClothesSize().getDescription());
        System.out.println("Цвет: " + getClothesColor());
        System.out.println("Цена: " + getClothesCost());
        System.out.println();
    }
}
