package Problem3;

public class ComputerFactory {
    public static Computer getComputer(String lab) {
        Computer computer = null;
        if (lab.equals("Lab-1")) {
            computer = new Computer("Core i5-10400", "8GB 3200GHz", "1 TB HDD", "18 inch HD");
        } else if (lab.equals("Lab-2")) {
            computer = new Computer("Core i5-11400", "8GB 3600GHz", "1 TB HDD", "21 inch FHD");
        } else if (lab.equals("Lab-3")) {
            computer = new Computer("Core i7-10700", "8GB 2800GHz", "512 GB HDD + 256 SSD", "22 inch FHD");
        } else if (lab.equals("Lab-4")) {
            computer = new Computer("Core i7-11700", "8GB 3600GHz", "1 TB HDD + 256 SSD", "24 inch FHD");
        }
        return computer;
    }
}
