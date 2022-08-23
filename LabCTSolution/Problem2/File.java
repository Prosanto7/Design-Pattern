package LabCTSolution.Problem2;

public class File extends Element{

    public File(String name) {
        super(name);
    }

    @Override
    File copy() {
        return new File(getName());
    }

    @Override
    void rename(String newName) {
        setName(newName);
    }

    @Override
    public String toString() {
        return getName();
    }
}
