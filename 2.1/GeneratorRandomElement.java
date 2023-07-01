public class GeneratorRandomElement {
    private double[] values, weights;
    public GeneratorRandomElement(double[] values, double[] weights) {this.values = values; this.weights = weights;}
    public void setValuesWeights(double[] values, double[] weights) {this.values = values; this.weights = weights;}
    private double getSumWeights() {
        double sum = 0;
        for (int i = 0; i < weights.length; i++) { sum += weights[i]; }
        return sum;
    }
    public double getValues() {
        double[] endProbabily = new double[weights.length];
        double sumWeights = getSumWeights();
        double randomProbabity = Math.random();

        for (int i = 0; i < weights.length; i++) {
            if (i != 0) endProbabily[i] = endProbabily[i - 1] + weights[i] / sumWeights;
            else endProbabily[i] = weights[i] / sumWeights;
        }
        for (int i = 0; i < weights.length; i++) {if (randomProbabity < endProbabily[i]) return values[i];}
        return 0;
    }
}
