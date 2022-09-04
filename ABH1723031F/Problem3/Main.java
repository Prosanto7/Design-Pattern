package Problem3;

public class Main {
    public static void main(String[] args) {
        Computer pc1 = ComputerFactory.getComputer("Lab-2");
        System.out.println(pc1.config());
        System.out.println(" --- ");

        Computer pc2 = ComputerFactory.getComputer("Lab-4");
        System.out.println(pc2.config());
    }
}
