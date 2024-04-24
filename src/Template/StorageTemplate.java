package Template;

import java.io.File;

abstract public class StorageTemplate {
    private String path;

    public StorageTemplate() {
    }

    abstract String saveFile(File file);

    abstract File openFile(String path);

    abstract String getInformation(File file);

    abstract void sendLogs(String information);

    abstract void closeFile(File file);

    File getFile() {
        return openFile(path);
    }

    void saveDataTemplate(String fileUrl) {

        File fetchedFile = openFile(fileUrl);
        String fileInformation = getInformation(fetchedFile);
        sendLogs(fileInformation);

        this.path = saveFile(fetchedFile);

        closeFile(fetchedFile);

    }
}
