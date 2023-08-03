package com.benionpackage;

import java.io.File;

public class FileInfo {
    public static void main(String[] args) {
        File file_object = new File("C:\\Benion Programmings\\Java\\File Handling\\files\\benion.txt");
        if (file_object.exists()) {
            System.out.println("File Name: " + file_object.getName());
            System.out.println("Absolute Path: " + file_object.getAbsolutePath());
            System.out.println("IsWriteable: " + file_object.canWrite());
            System.out.println("IsReadable: " + file_object.canRead());
            System.out.println("File Size(bytes): " + file_object.length());
        } else {
            System.out.println("File Does Not Exists");
        }
    }
}
