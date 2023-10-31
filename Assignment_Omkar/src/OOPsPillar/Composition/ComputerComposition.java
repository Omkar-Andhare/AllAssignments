package OOPsPillar.Composition;

public class ComputerComposition {
    public static void main(String[] args) {
        CPU intelCPU = new CPU("Intel", 3.0);
        Memory ram = new Memory(32);
        Storage hdd = new Storage(2);

        Computer myComputer = new Computer(intelCPU, ram, hdd);
        myComputer.run();
    }
}
