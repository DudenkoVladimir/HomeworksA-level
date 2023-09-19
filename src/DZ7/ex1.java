package DZ7;

public class ex1 {
    private double x;
    private double y;
    private double z;

    public ex1(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double calculateLength() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public ex1 calculateCrossProduct(ex1 other) {
        double crossX = y * other.z - z * other.y;
        double crossY = z * other.x - x * other.z;
        double crossZ = x * other.y - y * other.x;
        return new ex1(crossX, crossY, crossZ);
    }

    public double calculateCosineAngle(ex1 other) {
        double dotProduct = x * other.x + y * other.y + z * other.z;
        double lengthProduct = calculateLength() * other.calculateLength();
        return dotProduct / lengthProduct;
    }

    public ex1 add(ex1 other) {
        return new ex1(x + other.x, y + other.y, z + other.z);
    }

    public ex1 subtract(ex1 other) {
        return new ex1(x - other.x, y - other.y, z - other.z);
    }

    public static ex1[] generateRandomVectors(int N) {
        ex1[] vectors = new ex1[N];
        for (int i = 0; i < N; i++) {
            double x = Math.random();
            double y = Math.random();
            double z = Math.random();
            vectors[i] = new ex1(x, y, z);
        }
        return vectors;
    }
}
