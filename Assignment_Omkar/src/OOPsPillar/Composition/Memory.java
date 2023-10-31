package OOPsPillar.Composition;

public class Memory {

    private int sizeGB;

    public Memory(int sizeGB) {
        this.sizeGB = sizeGB;
    }

    public void storeData() {
        System.out.println("Memory has " + sizeGB + " GB of storage capacity.");
    }
}
