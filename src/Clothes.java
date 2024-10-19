
public abstract class Clothes {
    Size clothesSize;
    int clothesCost;
    Color clothesColor;

    public Clothes(Size size, int cost, Color color) {
        this.clothesSize = size;
        this.clothesCost = cost;
        this.clothesColor = color;
    }

    public Clothes() {
        this.clothesSize = Size.XXS;
        this.clothesColor = Color.WHITE;
        this.clothesCost = 10000;
    }

    public Size getClothesSize() {
        return clothesSize;
    }
    public void setClothesSize(Size size) {
        this.clothesSize = size;
    }

    public Color getClothesColor() {
        return clothesColor;
    }

    public void setClothesColor(Color clothesColor) {
        this.clothesColor = clothesColor;
    }

    public int getClothesCost() {
        return clothesCost;
    }

    public void setClothesCost(int clothesCost) {
        this.clothesCost = clothesCost;
    }
}
