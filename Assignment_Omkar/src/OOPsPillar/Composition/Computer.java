package OOPsPillar.Composition;

public class Computer {
    private CPU cpu;
    private Memory memory;
    private Storage storage;

    public Computer(CPU cpu, Memory memory, Storage storage) {
        this.cpu = cpu;
        this.memory = memory;
        this.storage = storage;
    }

    public void run() {
        System.out.println("Computer is running.");
        cpu.process();
        memory.storeData();
        storage.readData();
    }
}
