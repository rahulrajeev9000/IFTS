public class Compass {
    double distance;

    public Compass(int px, int py, int tx, int ty) {
        distance = Math.sqrt(Math.pow(tx - px, 2) + Math.pow(ty - py, 2));
    }

    public double getDistance() {
        return distance;
    }

}
