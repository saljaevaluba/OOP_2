public class DiscriminantCalculator implements Discriminant{

    @Override
    public double calculateDiscriminant(double a, double b, double c) {
        return b * b - 4 * a * c;
    }
}
