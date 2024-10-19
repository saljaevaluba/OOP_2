public class Skirt extends Clothes implements WomensClothing{
    @Override
    public void dressWoman() {

    }

    @Override
    public void information() {
        System.out.println("Одежда - Юбка");
        System.out.println("Размер: " + getClothesSize() + " " + getClothesSize().getDescription());
        System.out.println("Цвет: " + getClothesColor());
        System.out.println("Цена: " + getClothesCost());
        System.out.println();
    }
}
