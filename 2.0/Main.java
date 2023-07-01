
public class Main {
    public static void main(String[] args) {
        Coordinates vector1 = new Coordinates(10, 10, 10);
        Coordinates vector2 = new Coordinates(20, 20, 20);
        VectorsOperation endValue = new VectorsOperation();

        print(String.valueOf(endValue.getLenghtVector(vector1)));
        print(String.valueOf(endValue.getScalarProduct(vector1, vector2)));
        print(endValue.getRandomVector(5));

    }
    public static void print(String volume) { System.out.println(volume); }

    public static void print(double[] volume) {
        System.out.println("Your vector is:");
        for (Double el: volume) {
            System.out.print(el + "\t");
        }
    }
}
