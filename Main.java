public class Main {
    public static void main(String[] args) {
        // Create simulation with goal distance 24 and max 5 hops
        FrogSimulation sim = new FrogSimulation(24, 5);
        
        // Test individual simulations
        System.out.println("Individual simulation results:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Simulation " + (i+1) + ": " + sim.simulate());
        }
        
        // Test batch simulations
        System.out.println("\nRunning 1000 simulations:");
        double successRate = sim.runSimulations(1000);
        System.out.println("Success rate: " + successRate);
    }
}