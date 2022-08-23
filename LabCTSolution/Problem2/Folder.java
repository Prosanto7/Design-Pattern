package LabCTSolution.Problem2;

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
        Folder copyFolder = new Folder(this.getName());
        for(Folder folder : this.folderList) {
            copyFolder.getFolderList().add(folder.copy());
        }

        for(File f : this.fileList) {
            copyFolder.getFileList().add(f.copy());
        }
        return copyFolder;
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

    public List<File> getFileList() {
        return fileList;
    }

    public List<Folder> getFolderList() {
        return folderList;
    }
}
