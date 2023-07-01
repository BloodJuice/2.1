
public class VectorsOperation extends Coordinates{
    public VectorsOperation() {}
    public double getLenghtVector(Coordinates vector) {
        return Math.sqrt(Math.pow(vector.getX(), 2) + Math.pow(vector.getY(), 2) + Math.pow(vector.getZ(), 2));
    }
    public double getScalarProduct(Coordinates vector1, Coordinates vector2) {
        return vector1.getX() * vector2.getX() + vector1.getY() * vector2.getY() + vector1.getZ() * vector2.getZ();
    }
    public double[] getVectorProduct(Coordinates vec1, Coordinates vec2) {
        double[] vec = new double[3];
        vec[0] = vec1.getY()*vec2.getZ() - vec1.getZ()*vec2.getY();
        vec[1] = vec1.getZ()*vec2.getX() - vec1.getX()*vec2.getZ();
        vec[2] = vec1.getX()*vec2.getY() - vec1.getY()*vec2.getX();
        return vec;
    }
    public double getCorner(Coordinates vec1, Coordinates vec2) {
        return getScalarProduct(vec1, vec2) / (getLenghtVector(vec1) + getLenghtVector(vec2));
    }
    public double[] getSumVector(Coordinates vec1, Coordinates vec2) {
        double[] vec = new double[3];
        vec[0] = vec1.getX() + vec2.getX();
        vec[1] = vec1.getY() + vec2.getY();
        vec[2] = vec1.getZ() + vec2.getZ();
        return vec;
    }
    public double[] getDiffVector(Coordinates vec1, Coordinates vec2) {
        double[] vec = new double[3];
        vec[0] = vec1.getX() - vec2.getX();
        vec[1] = vec1.getY() - vec2.getY();
        vec[2] = vec1.getZ() - vec2.getZ();
        return vec;
    }
    public double[] getRandomVector(int N) {
        double[] vector = new double[N];
        for (int i = 0; i < N; i++) {
            vector[i] = Math.random() * 10.;
        }
        return vector;
    }
}
