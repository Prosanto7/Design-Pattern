package Problem2;

public class File extends Element{

    public File(String name) {
        super(name);
    }

    @Override
    File copy() {
        File file = new File(getName());
        return file;
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
