
public class Main {
    public static void main(String[] args) {
        GeneratorRandomElement element = new GeneratorRandomElement(new double[]{1, 4, 3}, new double[]{1, 2, 10});
        double[] counter = new double[3];
        for (int i = 0; i < 100; i++) {
            if (element.getValues() == 1) {
                counter[0]++;
            } else if (element.getValues() == 4) {
                counter[1]++;
            } else if (element.getValues() == 3) {
                counter[2]++;
            }
        }
        print(counter);
    }
    public static void print(String volume) { System.out.println(volume); }
    public static void print(double volume) {System.out.println(volume);}
    public static void print(double[] volume) {
        System.out.println("Your vector is:");
        for (Double el: volume) {
            System.out.print(el + "\t");
        }
    }
}
