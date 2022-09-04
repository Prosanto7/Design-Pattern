package Problem3;

public class Computer {
    private String processor;
    private String ram;
    private String hardDisk;
    private String monitor;

    public Computer(String processor, String ram, String hardDisk, String monitor) {
        this.processor = processor;
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.monitor = monitor;
    }

    public String config() {
        String output = "";
        output += "Processor : " + processor + "\n";
        output += "RAM : " + ram + "\n";
        output += "Hard Disk : " + hardDisk + "\n";
        output += "Monitor : " + monitor + "\n";
        return output;
    }
}
