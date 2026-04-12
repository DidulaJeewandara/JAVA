class Computer{

    String CPU;
    boolean GPU;
    String RAM;
    String Storage;
    boolean PowerSupply;
    boolean Wifi;


    public void show(){
        System.out.println("CPU: " + CPU + "\nGPU: " + GPU + "\nRAM: " + RAM + "\nStorage: " + Storage + "\nPower Supply: " + PowerSupply + "\nWifi: " + Wifi);
    }

}


    
class ComputerBuilder{
    private Computer computer;

    public ComputerBuilder() {
        computer = new Computer();
    }

    public ComputerBuilder setCPU(String CPU) {
        computer.CPU = CPU;
        return this;
    }

    public ComputerBuilder setGPU(boolean GPU) {
        computer.GPU = GPU;
        return this;
    }

    public ComputerBuilder setRAM(String RAM) {
        computer.RAM = RAM;
        return this;
    }

    public ComputerBuilder setStorage(String Storage) {
        computer.Storage = Storage;
        return this;
    }

    public ComputerBuilder setPowerSupply(boolean PowerSupply) {
        computer.PowerSupply = PowerSupply;
        return this;
    }

    public ComputerBuilder setWifi(boolean Wifi) {
        computer.Wifi = Wifi;
        return this;
    }

    public Computer build() {
        return computer;
    }

}

public class builder {
    public static void main(String[] args) {
        Computer computer1 = new ComputerBuilder()
            .setCPU("Intel i7")
            .setGPU(true)
            .setRAM("16GB")
            .setStorage("512GB SSD")
            .setPowerSupply(true)
            .setWifi(true)
            .build();

        Computer deskComputer = new ComputerBuilder()
            .setCPU("AMD Ryzen 5")
            .setGPU(false)
            .setRAM("3GB")
            .setStorage("1TB HDD")
            .setPowerSupply(true)
            .setWifi(false)
            .build();

        deskComputer.show();
        computer1.show();
    }

}


