package Problem2;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Element
{
    private List<Folder> folderList;
    private List<File> fileList;

    public Folder(String name) {
        super(name);
        folderList = new ArrayList<>();
        fileList = new ArrayList<>();
    }

    @Override
    Folder copy() {
        Folder folder = new Folder(getName());

        List folderList = new ArrayList<>();
        List fileList = new ArrayList<>();

        for(Folder fold : this.folderList) {
            folderList.add(fold);
        }

        for(File f : this.fileList) {
            fileList.add(f);
        }
        
        folder.folderList = folderList;
        folder.fileList = fileList;
        return folder;
    }

    @Override
    void rename(String newName) {
        setName(newName);
    }

    public void addFolder(Folder folder) {
        folderList.add(folder);
    }

    public void addFile(File file) {
        fileList.add(file);
    }

    public String toString() {
        return getName()+folderList+fileList;
    }



}
