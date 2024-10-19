public class Trousers extends Clothes implements MensClothing, WomensClothing{
    @Override
    public void dressMan() {

    }

    @Override
    public void dressWoman() {

    }

    @Override
    public void information() {
        System.out.println("Одежда - Брюки");
        System.out.println("Размер: " + getClothesSize() + " " + getClothesSize().getDescription());
        System.out.println("Цвет: " + getClothesColor());
        System.out.println("Цена: " + getClothesCost());
        System.out.println();
    }
}
