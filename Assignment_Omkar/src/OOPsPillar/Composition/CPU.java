package OOPsPillar.Composition;

public class CPU {
    private String brand;
    private double speedGHz;

    public CPU(String brand, double speedGHz) {
        this.brand = brand;
        this.speedGHz = speedGHz;
    }

    public void process() {
        System.out.println(brand + " CPU is processing data at " + speedGHz + " GHz.");
    }
}
