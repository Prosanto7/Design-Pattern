package Problem2;

public class Main {
    public static void main(String[] args) {
        Folder basic = new Folder("Basic Algorithm");
        Folder f1 = new Folder("Sorting");
        f1.addFile(new File("Bubble Sort"));
        Folder f2 = new Folder("Search");
        f2.addFile(new File("Linear Search"));
        basic.addFolder(f1);
        basic.addFolder(f2);
        basic.addFile(new File("Greedy Approach"));

        Folder advanced = basic.copy();
        advanced.rename("Advanced Algorithm");
        advanced.addFile(new File("Dynamic Programming"));
        Folder f3 = new Folder("Graph Problem");
        f3.addFile(new File("Spanning Tree"));
        advanced.addFolder(f3);

        System.out.println(basic);
        System.out.println("--- --- ---");
        System.out.println(advanced);
    }
}
