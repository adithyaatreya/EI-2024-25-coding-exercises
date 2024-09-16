// Product
class Computer {
    private String RAM;
    private String CPU;
    private String storage;

    public Computer(String RAM, String CPU, String storage) {
        this.RAM = RAM;
        this.CPU = CPU;
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Computer [RAM=" + RAM + ", CPU=" + CPU + ", Storage=" + storage + "]";
    }
}

// Builder Interface
interface ComputerBuilder {
    ComputerBuilder setRAM(String RAM);
    ComputerBuilder setCPU(String CPU);
    ComputerBuilder setStorage(String storage);
    Computer build();
}

// Concrete Builder
class CustomComputerBuilder implements ComputerBuilder {
    private String RAM;
    private String CPU;
    private String storage;

    @Override
    public ComputerBuilder setRAM(String RAM) {
        this.RAM = RAM;
        return this;
    }

    @Override
    public ComputerBuilder setCPU(String CPU) {
        this.CPU = CPU;
        return this;
    }

    @Override
    public ComputerBuilder setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    @Override
    public Computer build() {
        return new Computer(RAM, CPU, storage);
    }
}

// Usage
public class BuilderPattern {
    public static void main(String[] args) {
        ComputerBuilder builder = new CustomComputerBuilder();
        Computer computer = builder.setRAM("16GB").setCPU("Intel i7").setStorage("1TB").build();
        System.out.println(computer); // Computer [RAM=16GB, CPU=Intel i7, Storage=1TB]
    }
}
