package org.ibm.oops;

public class FileDocument implements Persistable {
    private String fileName;

    public FileDocument(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void save() {
        System.out.println("Saving file document to database: " + DB_NAME);
        // Implement actual save logic here
    }

    @Override
    public void load() {    
        System.out.println("Loading file document from database: " + DB_NAME);
        // Implement actual load logic here
    }

    @Override
    public void delete() {
        System.out.println("Deleting file document from database: " + DB_NAME);
        // Implement actual delete logic here
    }
}
