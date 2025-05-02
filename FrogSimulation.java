import java.util.Random;

public class FrogSimulation {
    private int goalDistance;
    private int maxHops;
    private Random random;

    public FrogSimulation(int dist, int numHops) {
        goalDistance = dist;
        maxHops = numHops;
        random = new Random();
    }

    private int hopDistance() {
        return random.nextInt(31) - 10; // Random distance between -10 and 20
    }

    public boolean simulate() {
        int position = 0;
        for (int hops = 0; hops < maxHops; hops++) {
            position += hopDistance();
            if (position >= goalDistance) {
                return true;
            }
            if (position < 0) {
                return false;
            }
        }
        return false;
    }

    public double runSimulations(int num) {
        int successes = 0;
        for (int i = 0; i < num; i++) {
            if (simulate()) {
                successes++;
            }
        }
        return (double) successes / num;
    }
}