package OOPsPillar.Composition;

public class Storage {
    private int capacityTB;

    public Storage(int capacityTB) {
        this.capacityTB = capacityTB;
    }

    public void readData() {
        System.out.println("Storage has a capacity of " + capacityTB + " TB.");
    }
}
